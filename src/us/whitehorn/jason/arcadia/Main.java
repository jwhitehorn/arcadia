package us.whitehorn.jason.arcadia;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import us.whitehorn.jason.arcadia.compiler.ArcadiaCompiler;
import us.whitehorn.jason.arcadia.compiler.ArcadiaListenerImpl;
import us.whitehorn.jason.arcadia.compiler.ArcadiaLexer;
import us.whitehorn.jason.arcadia.compiler.ArcadiaParser;
import us.whitehorn.jason.arcadia.core.ArcadiaProgram;

import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            CharStream input;
            if(args.length > 0) {
                input = CharStreams.fromFileName(args[0]);
            }else {
                InputStream script = Main.class.getResource("/repl.arc").openStream();
                input = CharStreams.fromStream(script);
            }

            ArcadiaProgram program = ArcadiaCompiler.compile(input);
            program.run();

        } catch (Exception e) {
            e.printStackTrace();
        }


        ArcadiaLexer lexer;
    }
}
