package us.whitehorn.jason.arcadia.compiler;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import us.whitehorn.jason.arcadia.core.ArcadiaBlockScope;
import us.whitehorn.jason.arcadia.core.ArcadiaProgram;
import us.whitehorn.jason.arcadia.core.ArcadiaSymbol;
import us.whitehorn.jason.arcadia.core.DynamicClassLoader;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;

import static org.objectweb.asm.Opcodes.*;

public class ArcadiaListenerImpl extends ArcadiaBaseListener {
    private ClassWriter cw;
    private MethodVisitor mainMethod;
    private Hashtable<String, ArcadiaSymbol> symbolTable;
    private Hashtable<String, String> funcTable;
    private Stack<ArcadiaBlockScope> scope;
    private Stack<String> vmTypeStack;

    private Boolean debug = true;

    public ArcadiaListenerImpl(){
        symbolTable = new Hashtable<>();
        funcTable = new Hashtable<>();
        //Define built-in functions
        funcTable.put("puts", "V");
        funcTable.put("_debug", "V");

        scope = new Stack<>();
        vmTypeStack = new Stack<>();

        //https://dzone.com/articles/fully-dynamic-classes-with-asms
        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(V10,                              // Java 10
                ACC_PUBLIC,                         // public class
                "us/whitehorn/jason/arcadia/DynamicArcadiaProgram",    // package and name
                null,                               // signature (null means not generic)
                "us/whitehorn/jason/arcadia/core/ArcadiaProgram",    // superclass
                new String[]{ }); // interfaces


        /* Build constructor */
        MethodVisitor con = cw.visitMethod(
                ACC_PUBLIC,                         // public method
                "<init>",                           // method name
                "()V",                              // descriptor
                null,                               // signature (null means not generic)
                null);                              // exceptions (array of strings)

        con.visitCode();                            // Start the code for this method
        con.visitVarInsn(ALOAD, 0);                 // Load "this" onto the stack
        con.visitMethodInsn(INVOKESPECIAL,          // Invoke an instance method (non-virtual)
                "us/whitehorn/jason/arcadia/core/ArcadiaProgram",                 // Class on which the method is defined
                "<init>",                           // Name of the method
                "()V",                              // Descriptor
                false);                             // Is this class an interface?
        con.visitInsn(RETURN);                      // End the constructor method
        con.visitMaxs(1, 1);                        // Specify max stack and local vars


        mainMethod = cw.visitMethod(
                ACC_PUBLIC,                         // public method
                "run",                           // method name
                "()V",                              // descriptor
                null,                               // signature (null means not generic)
                null);                              // exceptions (array of strings)
        mainMethod.visitCode();                            // Start the code for this method

    }

    @Override
    public void enterFunction_call(ArcadiaParser.Function_callContext ctx) {
        _debug("enterFunction_call");
        mainMethod.visitVarInsn(ALOAD, 0);                 // Load "this" onto the stack
    }

    @Override
    public void exitInt_result(ArcadiaParser.Int_resultContext ctx) {
        _debug("exitInt_result");
        if(ctx.parent instanceof ArcadiaParser.Int_resultContext){
            return; //HACK: dynamic results can be nested.
        }
        for (ParseTree t : ctx.children) {
            String txt = t.getText();
            if (t instanceof TerminalNodeImpl) {
                //do nothing, yet
            } else {
                vmTypeStack.push("I");
                mainMethod.visitIntInsn(BIPUSH, Integer.parseInt(txt)); //TODO: support larger than shorts
            }
        }
        if(ctx.op != null) {
            String op = ctx.op.getText();
            vmTypeStack.pop();
            if(op.equals("+")) {
                mainMethod.visitInsn(IADD);
            }else if(op.equals("-")){
                mainMethod.visitInsn(ISUB);
            }
            //TODO: more operations
        }
    }

    @Override
    public void exitFloat_result(ArcadiaParser.Float_resultContext ctx) {
        _debug("exitFloat_result");
        for (ParseTree t : ctx.children) {
            String txt = t.getText();
            if (t instanceof TerminalNodeImpl) {
                //do nothing, yet
            } else {
                vmTypeStack.push("F");
                mainMethod.visitLdcInsn(Float.parseFloat(txt));
            }
        }
        if(ctx.op != null) {
            String op = ctx.op.getText();
            vmTypeStack.pop();
            if(op.equals("+")) {
                mainMethod.visitInsn(FADD);
            }else if(op.equals("-")){
                mainMethod.visitInsn(FSUB);
            }
            //TODO: more operations
        }
    }

    @Override
    public void exitDynamic_result(ArcadiaParser.Dynamic_resultContext ctx){
        _debug("exitDynamic_result");
        if(ctx.parent instanceof ArcadiaParser.Dynamic_resultContext){
            return; //HACK: dynamic results can be nested.
        }
        for (ParseTree t : ctx.children) {
            if (t instanceof TerminalNodeImpl) {
                continue;   //we'll get these later
            }
            String rvalue = t.getText();
            ArcadiaSymbol symbol = symbolTable.get(rvalue);
            if(symbol == null){
                continue; //these are likely literals are were picked up by other rules
            }
            String vmType = symbol.getVMType();
            if (vmType.equals("I")) {
                vmTypeStack.push("I");
                mainMethod.visitVarInsn(ILOAD, symbol.getSymbolId());
            } else if(vmType.equals("F")){
                vmTypeStack.push("F");
                mainMethod.visitVarInsn(FLOAD, symbol.getSymbolId());
            } else {
                //assume to be an object
                vmTypeStack.push("Ljava/lang/String;");
                mainMethod.visitVarInsn(ALOAD, symbol.getSymbolId());
            }
        }
        if(ctx.op != null) {
            String op = ctx.op.getText();
            //TODO: look at op
            vmTypeStack.pop();
            mainMethod.visitInsn(IADD);
        }
    }

    @Override
    public void exitString_result(ArcadiaParser.String_resultContext ctx) {
        _debug("exitString_result");
        String param = ctx.getText();
        param = param.substring(1, param.length() - 1);
        mainMethod.visitLdcInsn(param);
        vmTypeStack.push("Ljava/lang/String;");
    }


    @Override
    public void exitFunction_call(ArcadiaParser.Function_callContext ctx){
        _debug("exitFunction_call");
        String funcName = ctx.function_name().getText();
        String callDescriptor = ")".concat(funcTable.get(funcName));
        while(vmTypeStack.empty() == false){
            callDescriptor = vmTypeStack.pop() + callDescriptor;
        }
        callDescriptor = "(" + callDescriptor;

        mainMethod.visitMethodInsn(INVOKEVIRTUAL,
                "us/whitehorn/jason/arcadia/DynamicArcadiaProgram",
                funcName,
                callDescriptor,
                false);

    }

    @Override
    public void exitInt_assignment(ArcadiaParser.Int_assignmentContext ctx){
        _debug("exitInt_assignment");
        String lvalue = ctx.lvalue().getText();
        ArcadiaSymbol symbol = symbolTable.get(lvalue);
        if(symbol == null){
            //define variable
            symbol = new ArcadiaSymbol(lvalue, "I", symbolTable.size() + 1);
            symbolTable.put(lvalue, symbol);
        }
        vmTypeStack.pop();
        mainMethod.visitVarInsn(ISTORE, symbol.getSymbolId());
    }

    @Override
    public void exitFloat_assignment(ArcadiaParser.Float_assignmentContext ctx) {
        _debug("exitFloat_assignment");
        String lvalue = ctx.lvalue().getText();
        ArcadiaSymbol symbol = symbolTable.get(lvalue);
        if(symbol == null){
            //define variable
            symbol = new ArcadiaSymbol(lvalue, "F", symbolTable.size() + 1);
            symbolTable.put(lvalue, symbol);
        }

        vmTypeStack.pop();
        mainMethod.visitVarInsn(FSTORE, symbol.getSymbolId());
    }

    @Override
    public void exitString_assignment(ArcadiaParser.String_assignmentContext ctx) {
        _debug("exitString_assignment");
        String lvalue = ctx.lvalue().getText();
        String rvalue = ctx.string_result().getText();
        ArcadiaSymbol symbol = symbolTable.get(lvalue);
        if(symbol == null){
            //define variable
            symbol = new ArcadiaSymbol(lvalue, "Ljava/lang/String;", symbolTable.size() + 1);
            symbolTable.put(lvalue, symbol);
        }

        //mainMethod.visitLdcInsn(rvalue);
        vmTypeStack.pop();
        mainMethod.visitVarInsn(ASTORE, symbol.getSymbolId());
    }

    @Override
    public void exitDynamic_assignment(ArcadiaParser.Dynamic_assignmentContext ctx) {
        _debug("exitDynamic_assignment");
        String lvalue = ctx.lvalue().getText();
        String rvalue = ctx.dynamic_result().getText();
        String rVMType = vmTypeStack.pop();


        ArcadiaSymbol lsymbol = symbolTable.get(lvalue);
        if(lsymbol == null){
            //define variable
            lsymbol = new ArcadiaSymbol(lvalue, rVMType, symbolTable.size() + 1);
            symbolTable.put(lvalue, lsymbol);
        }

        if(rVMType.equals("I")) {
            mainMethod.visitVarInsn(ISTORE, lsymbol.getSymbolId());
        }else if(rVMType.equals("F")){
            mainMethod.visitVarInsn(FSTORE, lsymbol.getSymbolId());
        }
        //TODO: other types

    }

    @Override
    public void exitComparison(ArcadiaParser.ComparisonContext ctx) {
        _debug("exitComparison");
        ArcadiaBlockScope currentBlock = scope.peek();

        String op = ctx.op.getText();
        //in the next block of code we will do the opposite of the operator. So == becomes !=, > becomes <=, etc.
        //this is because these comparisons are gatekeepers for the block and we're wiring up logic to jump over
        //the block (the logical opposite of how the developer conceived it).
        vmTypeStack.pop();
        vmTypeStack.pop();
        if(op.equals("<")) {
            mainMethod.visitJumpInsn(IF_ICMPGE, currentBlock.getBlockEnd()); // < comparison becomes >= comparison
        }else if(op.equals("!=")){
            mainMethod.visitJumpInsn(IF_ICMPEQ, currentBlock.getBlockEnd()); // != comparison becomes == comparison
        }
        //TODO: more operators
    }

    @Override
    public void exitCond_expression(ArcadiaParser.Cond_expressionContext ctx) {
        _debug("exitCond_expression");

    }

    @Override
    public void enterWhile_statement(ArcadiaParser.While_statementContext ctx) {
        _debug("enterWhile_statement");
        ArcadiaBlockScope loopScope = new ArcadiaBlockScope();
        scope.push(loopScope);
        mainMethod.visitLabel(loopScope.getBlockStart());
    }

    @Override
    public void exitWhile_statement(ArcadiaParser.While_statementContext ctx){
        _debug("exitWhile_statement");
        ArcadiaBlockScope loopScope = scope.pop();
        mainMethod.visitJumpInsn(GOTO, loopScope.getBlockStart());
        mainMethod.visitLabel(loopScope.getBlockEnd());
    }

    public ArcadiaProgram finish() throws IllegalAccessException, InstantiationException {
        _debug("finish");
        mainMethod.visitInsn(RETURN);                      // End the constructor method
        mainMethod.visitMaxs(1, 1);                        // Specify max stack and local vars

        DynamicClassLoader loader = new DynamicClassLoader();
        Class<?> clazz = loader.defineClass("us.whitehorn.jason.arcadia.DynamicArcadiaProgram", cw.toByteArray());

        ArcadiaProgram prog = (ArcadiaProgram)clazz.newInstance();

        return prog;
    }

    private void _debug(String msg){
        if(debug) {
            System.out.println(msg);
        }
    }
}
