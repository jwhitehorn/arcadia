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

    private Hashtable<String, ArcadiaSymbol> symbolTable;
    private Hashtable<String, String> funcTable;
    private Stack<ArcadiaBlockScope> scope;
    private Stack<String> vmTypeStack;
    private Stack<MethodVisitor> methodStack;

    private Boolean debug = true;

    public ArcadiaListenerImpl(){
        symbolTable = new Hashtable<>();
        funcTable = new Hashtable<>();
        //Define built-in functions
        funcTable.put("puts", "V");
        funcTable.put("_debug", "V");

        scope = new Stack<>();
        vmTypeStack = new Stack<>();
        methodStack = new Stack<>();

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


        MethodVisitor mainMethod = cw.visitMethod(
                ACC_PUBLIC,                         // public method
                "main",                           // method name
                "()V",                              // descriptor
                null,                               // signature (null means not generic)
                null);                              // exceptions (array of strings)
        mainMethod.visitCode();                            // Start the code for this method
        methodStack.push(mainMethod);

    }

    @Override
    public void enterFunction_call(ArcadiaParser.Function_callContext ctx) {
        _debug("enterFunction_call");

        MethodVisitor method = methodStack.peek();
        method.visitVarInsn(ALOAD, 0);                 // Load "this" onto the stack
    }

    @Override
    public void exitInt_result(ArcadiaParser.Int_resultContext ctx) {
        _debug("exitInt_result");

        if(ctx.op != null) {
            String op = ctx.op.getText();
            _handleOp(op);
        }
    }

    @Override
    public void exitInt_t(ArcadiaParser.Int_tContext ctx) {
        _debug("exitInt_t");
        String txt = ctx.getText();

        vmTypeStack.push("I");
        MethodVisitor method = methodStack.peek();
        method.visitIntInsn(BIPUSH, Integer.parseInt(txt)); //TODO: support larger than shorts
    }

    @Override
    public void exitFloat_result(ArcadiaParser.Float_resultContext ctx) {
        if(ctx.op != null) {
            String op = ctx.op.getText();
            _handleOp(op);
        }
    }

    @Override
    public void exitFloat_t(ArcadiaParser.Float_tContext ctx) {
        _debug("exitFloat_t");

        String txt = ctx.getText();

        vmTypeStack.push("F");
        MethodVisitor method = methodStack.peek();
        method.visitLdcInsn(Float.parseFloat(txt));
    }

    @Override
    public void exitDynamic_result(ArcadiaParser.Dynamic_resultContext ctx) {
        _debug("exitDynamic_result");
        if(ctx.op != null) {
            String op = ctx.op.getText();
            _handleOp(op);
        }
    }
    @Override
    public void exitDynamic(ArcadiaParser.DynamicContext ctx) {
        _debug("exitDynamic");
        MethodVisitor method = methodStack.peek();

        String rvalue = ctx.getText();
        ArcadiaSymbol symbol = symbolTable.get(rvalue);

        String vmType = symbol.getVMType();
        if (vmType.equals("I")) {
            vmTypeStack.push("I");
            method.visitVarInsn(ILOAD, symbol.getSymbolId());
        } else if(vmType.equals("F")){
            vmTypeStack.push("F");
            method.visitVarInsn(FLOAD, symbol.getSymbolId());
        } else {
            //assume to be an object
            vmTypeStack.push("Ljava/lang/String;");
            method.visitVarInsn(ALOAD, symbol.getSymbolId());
        }

    }

    @Override
    public void exitString_result(ArcadiaParser.String_resultContext ctx) {
        _debug("exitString_result");
        String param = ctx.getText();
        param = param.substring(1, param.length() - 1);
        MethodVisitor method = methodStack.peek();
        method.visitLdcInsn(param);
        vmTypeStack.push("Ljava/lang/String;");
    }


    @Override
    public void exitFunction_call(ArcadiaParser.Function_callContext ctx){
        _debug("exitFunction_call");
        MethodVisitor method = methodStack.peek();
        String funcName = ctx.function_name().getText();
        String callDescriptor = ")".concat(funcTable.get(funcName));
        while(vmTypeStack.empty() == false){
            callDescriptor = vmTypeStack.pop() + callDescriptor;
        }
        callDescriptor = "(" + callDescriptor;

        method.visitMethodInsn(INVOKEVIRTUAL,
                "us/whitehorn/jason/arcadia/DynamicArcadiaProgram",
                funcName,
                callDescriptor,
                false);

    }

    @Override
    public void exitInt_assignment(ArcadiaParser.Int_assignmentContext ctx){
        _debug("exitInt_assignment");
        MethodVisitor method = methodStack.peek();
        String lvalue = ctx.lvalue().getText();
        ArcadiaSymbol symbol = symbolTable.get(lvalue);
        if(symbol == null){
            //define variable
            symbol = new ArcadiaSymbol(lvalue, "I", symbolTable.size() + 1);
            symbolTable.put(lvalue, symbol);
        }
        vmTypeStack.pop();
        method.visitVarInsn(ISTORE, symbol.getSymbolId());
    }

    @Override
    public void exitFloat_assignment(ArcadiaParser.Float_assignmentContext ctx) {
        _debug("exitFloat_assignment");
        MethodVisitor method = methodStack.peek();
        String lvalue = ctx.lvalue().getText();
        ArcadiaSymbol symbol = symbolTable.get(lvalue);
        if(symbol == null){
            //define variable
            symbol = new ArcadiaSymbol(lvalue, "F", symbolTable.size() + 1);
            symbolTable.put(lvalue, symbol);
        }

        vmTypeStack.pop();
        method.visitVarInsn(FSTORE, symbol.getSymbolId());
    }

    @Override
    public void exitString_assignment(ArcadiaParser.String_assignmentContext ctx) {
        _debug("exitString_assignment");
        MethodVisitor method = methodStack.peek();
        String lvalue = ctx.lvalue().getText();
        String rvalue = ctx.string_result().getText();
        ArcadiaSymbol symbol = symbolTable.get(lvalue);
        if(symbol == null){
            //define variable
            symbol = new ArcadiaSymbol(lvalue, "Ljava/lang/String;", symbolTable.size() + 1);
            symbolTable.put(lvalue, symbol);
        }

        vmTypeStack.pop();
        method.visitVarInsn(ASTORE, symbol.getSymbolId());
    }

    @Override
    public void exitDynamic_assignment(ArcadiaParser.Dynamic_assignmentContext ctx) {
        _debug("exitDynamic_assignment");
        String lvalue = ctx.lvalue().getText();

        this._handleAssignment(lvalue);
    }

    @Override
    public void exitInitial_array_assignment(ArcadiaParser.Initial_array_assignmentContext ctx) {
        _debug("exitInitial_array_assignment");

        MethodVisitor method = methodStack.peek();
        String lvalue = ctx.lvalue().getText();
        ArcadiaSymbol symbol = symbolTable.get(lvalue);

        if(symbol == null){
            //define variable
            symbol = new ArcadiaSymbol(lvalue, "Ljava/lang/Object", symbolTable.size() + 1);
            symbolTable.put(lvalue, symbol);
        }

        method.visitIntInsn(BIPUSH, 0);
        method.visitTypeInsn(ANEWARRAY, "java/lang/Object");

        //vmTypeStack.pop();
        method.visitVarInsn(ASTORE, symbol.getSymbolId());
    }

    @Override
    public void exitComparison(ArcadiaParser.ComparisonContext ctx) {
        _debug("exitComparison");
        MethodVisitor method = methodStack.peek();
        ArcadiaBlockScope currentBlock = scope.peek();

        String op = ctx.op.getText();
        //in the next block of code we will do the opposite of the operator. So == becomes !=, > becomes <=, etc.
        //this is because these comparisons are gatekeepers for the block and we're wiring up logic to jump over
        //the block (the logical opposite of how the developer conceived it).
        vmTypeStack.pop();
        String vmType = vmTypeStack.pop();
        if(op.equals("<")) {
            // < comparison becomes >= comparison
            if (vmType.equals("I")) {
                method.visitJumpInsn(IF_ICMPGE, currentBlock.getBlockEnd());
            }else if(vmType.equals("F")){
                //OK, not here.
                //Here we're literally implementing the same logical operator and doing an extra jump
                Label skip = new Label();
                method.visitInsn(FCMPG);
                method.visitJumpInsn(IFLT, skip);
                method.visitJumpInsn(GOTO, currentBlock.getBlockEnd());
                method.visitLabel(skip);
            }
        }else if(op.equals("!=")){
            // != comparison becomes == comparison
            if(vmType.equals("I")) {
                method.visitJumpInsn(IF_ICMPEQ, currentBlock.getBlockEnd());
            }
        }else if(op.equals("<=")){
            // <= becomes >
            if(vmType.equals("I")) {
                method.visitJumpInsn(IF_ICMPGT, currentBlock.getBlockEnd());
            }else if(vmType.equals("F")){
                method.visitInsn(FCMPG);
                method.visitJumpInsn(IFGT, currentBlock.getBlockEnd());
            }
        }
        //TODO: more operators & types
    }

    @Override
    public void exitCond_expression(ArcadiaParser.Cond_expressionContext ctx) {
        _debug("exitCond_expression");

    }

    @Override
    public void enterWhile_statement(ArcadiaParser.While_statementContext ctx) {
        _debug("enterWhile_statement");
        MethodVisitor method = methodStack.peek();
        ArcadiaBlockScope loopScope = new ArcadiaBlockScope();
        scope.push(loopScope);
        method.visitLabel(loopScope.getBlockStart());
    }

    @Override
    public void exitWhile_statement(ArcadiaParser.While_statementContext ctx){
        _debug("exitWhile_statement");
        MethodVisitor method = methodStack.peek();
        ArcadiaBlockScope loopScope = scope.pop();
        method.visitJumpInsn(GOTO, loopScope.getBlockStart());
        method.visitLabel(loopScope.getBlockEnd());
    }

    @Override
    public void exitFunction_definition_header(ArcadiaParser.Function_definition_headerContext ctx) {
        String funcName = ctx.function_name().getText();

        MethodVisitor method = cw.visitMethod(
                ACC_PUBLIC,                         // public method
                funcName,                           // method name
                "()V",                              // descriptor
                null,                               // signature (null means not generic)
                null);                              // exceptions (array of strings)
        method.visitCode();                            // Start the code for this method
        methodStack.push(method);
        funcTable.put(funcName, "V");
    }

    @Override
    public void exitFunction_definition(ArcadiaParser.Function_definitionContext ctx) {
        MethodVisitor method = methodStack.pop();
        method.visitInsn(RETURN);                      // End the constructor method
        method.visitMaxs(1, 1);                        // Specify max stack and local vars
    }

    public ArcadiaProgram finish() throws IllegalAccessException, InstantiationException {
        _debug("finish");
        MethodVisitor method = methodStack.pop();
        method.visitInsn(RETURN);                      // End the constructor method
        method.visitMaxs(1, 1);                        // Specify max stack and local vars

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

    private void _handleOp(String op){
        System.out.println("_handleOp");
        MethodVisitor method = methodStack.peek();
        //TODO: look at op
        String vmType = vmTypeStack.pop();
        String otherVmType = vmTypeStack.peek();
        if(vmType.equals(otherVmType) == false){
            //if we're trying to operate on two different types let's
            //first do a type conversation and then determine the proper
            //new type
            if(vmType.equals("I") && otherVmType.equals("F")){
                //The variable at the top of the stack is an Int
                //and the one below it is a Float. We should...
                method.visitInsn(I2F); //convert the int to a float

                //and then proceed with float as the data type
                vmType = "F";
            }else if(vmType.equals("F") && otherVmType.equals("I")){
                //The variable at the top of the stack is a float
                //and the one before it is an Int.
                //This scenario is similar to the last one, except we must first...
                method.visitInsn(SWAP); //swap the top two variables so that we can
                method.visitInsn(I2F); //convert the int to a float

                //and then proceed with float as the data type
                vmType = "F";
                //but we must also ensure that our internal type stack is correct
                vmTypeStack.pop();
                vmTypeStack.push("F");
            }
        }


        if(op.equals("+")) {
            if (vmType.equals("I")) {
                method.visitInsn(IADD);
            } else if (vmType.equals("F")) {
                method.visitInsn(FADD);
            }
        }else if(op.equals("*")){
            if (vmType.equals("I")) {
                method.visitInsn(IMUL);
            } else if (vmType.equals("F")) {
                method.visitInsn(FMUL);
            }
        }else if(op.equals("-")){
            if (vmType.equals("I")) {
                method.visitInsn(ISUB);
            } else if (vmType.equals("F")) {
                method.visitInsn(FSUB);
            }
        }else if(op.equals("/")){
            if (vmType.equals("I")) {
                method.visitInsn(IDIV);
            }else if(vmType.equals("F")){
                method.visitInsn(FDIV);
            }
        }
        //TODO: more types
    }

    private void _handleAssignment(String symbolName){
        String rVMType = vmTypeStack.pop();
        ArcadiaSymbol symbol = symbolTable.get(symbolName);
        MethodVisitor method = methodStack.peek();

        if(symbol == null){
            //define variable if currently unused
            symbol = new ArcadiaSymbol(symbolName, rVMType, symbolTable.size() + 1);
            symbolTable.put(symbolName, symbol);
        }else if(symbol.getVMType().equals(rVMType) == false){
            //check to see if the symbol's type matches the new type, otherwise we need to fix that...
            symbol.setVMType(rVMType);
        }

        if(rVMType.equals("I")) {
            method.visitVarInsn(ISTORE, symbol.getSymbolId());
        }else if(rVMType.equals("F")){
            method.visitVarInsn(FSTORE, symbol.getSymbolId());
        }
        //TODO: other types
    }
}
