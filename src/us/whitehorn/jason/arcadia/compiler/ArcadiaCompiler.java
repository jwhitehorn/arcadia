package us.whitehorn.jason.arcadia.compiler;
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

public class ArcadiaCompiler extends ArcadiaBaseListener {
    ClassWriter cw;
    MethodVisitor mainMethod;
    Hashtable<String, ArcadiaSymbol> symbolTable;
    Hashtable<String, String> funcTable;
    String callDescriptor;

    public ArcadiaCompiler(){
        symbolTable = new Hashtable<>();
        funcTable = new Hashtable<>();
        //Define built-in functions
        funcTable.put("puts", "V");

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
        mainMethod.visitVarInsn(ALOAD, 0);                 // Load "this" onto the stack
        callDescriptor = "(";
    }

    @Override
    public void exitDynamic_result(ArcadiaParser.Dynamic_resultContext ctx){
        String rvalue = ctx.getText();
        ArcadiaSymbol symbol = symbolTable.get(rvalue);
        mainMethod.visitVarInsn(ILOAD, symbol.getSymbolId());
        callDescriptor = callDescriptor.concat(symbol.getVMType());
    }

    @Override
    public void exitString_result(ArcadiaParser.String_resultContext ctx) {
        String param = ctx.getText();
        param = param.substring(1, param.length() - 1);
        mainMethod.visitLdcInsn(param);
        callDescriptor = callDescriptor.concat("Ljava/lang/String;");
    }


    @Override
    public void exitFunction_call(ArcadiaParser.Function_callContext ctx){
        String funcName = ctx.function_name().getText();
        callDescriptor = callDescriptor.concat(")").concat(funcTable.get(funcName));

        mainMethod.visitMethodInsn(INVOKEVIRTUAL,
                "us/whitehorn/jason/arcadia/DynamicArcadiaProgram",
                funcName,
                callDescriptor,
                false);

    }

    @Override
    public void exitInt_assignment(ArcadiaParser.Int_assignmentContext ctx){
        String lvalue = ctx.lvalue().getText();
        Integer rvalue = Integer.valueOf(ctx.int_result().getText());
        ArcadiaSymbol symbol = symbolTable.get(lvalue);
        if(symbol == null){
            //define variable
            symbol = new ArcadiaSymbol(lvalue, "I", symbolTable.size() + 1);
            symbolTable.put(lvalue, symbol);
        }

        mainMethod.visitIntInsn(BIPUSH, rvalue.shortValue()); //TODO: support larger integers
        mainMethod.visitVarInsn(ISTORE, symbol.getSymbolId());
    }

    @Override
    public void enterWhile_statement(ArcadiaParser.While_statementContext ctx) {
        Label begin = new Label();
        mainMethod.visitLabel(begin);
    }

    @Override
    public void exitWhile_statement(ArcadiaParser.While_statementContext ctx){

    }

    public ArcadiaProgram finish() throws IllegalAccessException, InstantiationException {
        mainMethod.visitInsn(RETURN);                      // End the constructor method
        mainMethod.visitMaxs(1, 1);                        // Specify max stack and local vars

        DynamicClassLoader loader = new DynamicClassLoader();
        Class<?> clazz = loader.defineClass("us.whitehorn.jason.arcadia.DynamicArcadiaProgram", cw.toByteArray());

        ArcadiaProgram prog = (ArcadiaProgram)clazz.newInstance();

        return prog;
    }
}
