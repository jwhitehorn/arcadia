package us.whitehorn.jason.arcadia.compiler;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import us.whitehorn.jason.arcadia.core.ArcadiaProgram;
import us.whitehorn.jason.arcadia.core.ArcadiaSymbol;
import us.whitehorn.jason.arcadia.core.DynamicClassLoader;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Dictionary;
import java.util.Hashtable;
import static org.objectweb.asm.Opcodes.*;

public class ArcadiaListenerImpl extends ArcadiaBaseListener {
    ClassWriter cw;
    MethodVisitor mainMethod;
    Hashtable<String, ArcadiaSymbol> symbolTable;
    Hashtable<String, String> funcTable;
    String callDescriptor;
    Boolean debug = true;

    public ArcadiaListenerImpl(){
        symbolTable = new Hashtable<>();
        funcTable = new Hashtable<>();
        //Define built-in functions
        funcTable.put("puts", "V");
        funcTable.put("_debug", "V");

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
        callDescriptor = "(";
    }

    @Override
    public void exitInt_result(ArcadiaParser.Int_resultContext ctx) {
        _debug("exitInt_result");
        for (ParseTree t : ctx.children) {
            String txt = t.getText();
            if (t instanceof TerminalNodeImpl) {
                //do nothing, yet
            } else {
                mainMethod.visitIntInsn(BIPUSH, Integer.parseInt(txt)); //TODO: support larger than shorts
            }
        }
        if(ctx.op != null) {
            String op = ctx.op.getText();
            //TODO: look at op
            mainMethod.visitInsn(IADD);
        }
    }

    @Override
    public void exitDynamic_result(ArcadiaParser.Dynamic_resultContext ctx){
        _debug("exitDynamic_result");
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
            if (vmType == "I") {
                mainMethod.visitVarInsn(ILOAD, symbol.getSymbolId());
            } else {
                //assume to be an object
                mainMethod.visitVarInsn(ALOAD, symbol.getSymbolId());
            }
            if (callDescriptor != null) {
                //if we're in a method call...
                callDescriptor = callDescriptor.concat(symbol.getVMType());
            }
        }
        if(ctx.op != null) {
            String op = ctx.op.getText();
            //TODO: look at op
            mainMethod.visitInsn(IADD);
        }
    }

    @Override
    public void exitString_result(ArcadiaParser.String_resultContext ctx) {
        _debug("exitString_result");
        String param = ctx.getText();
        param = param.substring(1, param.length() - 1);
        mainMethod.visitLdcInsn(param);
        if(callDescriptor != null) {
            //if we're in a function call block...
            callDescriptor = callDescriptor.concat("Ljava/lang/String;");
        }
    }


    @Override
    public void exitFunction_call(ArcadiaParser.Function_callContext ctx){
        _debug("exitFunction_call");
        String funcName = ctx.function_name().getText();
        callDescriptor = callDescriptor.concat(")").concat(funcTable.get(funcName));

        mainMethod.visitMethodInsn(INVOKEVIRTUAL,
                "us/whitehorn/jason/arcadia/DynamicArcadiaProgram",
                funcName,
                callDescriptor,
                false);

        callDescriptor = null;

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

        mainMethod.visitVarInsn(ISTORE, symbol.getSymbolId());
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
        mainMethod.visitVarInsn(ASTORE, symbol.getSymbolId());
    }

    @Override
    public void exitDynamic_assignment(ArcadiaParser.Dynamic_assignmentContext ctx) {
        _debug("exitDynamic_assignment");
        String lvalue = ctx.lvalue().getText();
        String rvalue = ctx.dynamic_result().getText();
        ArcadiaSymbol rsymbol = symbolTable.get(rvalue);

        ArcadiaSymbol lsymbol = symbolTable.get(lvalue);
        if(lsymbol == null){
            //define variable
            lsymbol = new ArcadiaSymbol(lvalue, rsymbol.getVMType(), symbolTable.size() + 1);
            symbolTable.put(lvalue, lsymbol);
        }

        mainMethod.visitVarInsn(ISTORE, lsymbol.getSymbolId());
    }

    @Override
    public void enterWhile_statement(ArcadiaParser.While_statementContext ctx) {
        _debug("enterWhile_statement");
        Label begin = new Label();
        mainMethod.visitLabel(begin);
    }

    @Override
    public void exitWhile_statement(ArcadiaParser.While_statementContext ctx){
        _debug("exitWhile_statement");

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
