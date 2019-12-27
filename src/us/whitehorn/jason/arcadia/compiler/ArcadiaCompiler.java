package us.whitehorn.jason.arcadia.compiler;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import us.whitehorn.jason.arcadia.core.ArcadiaProgram;

public class ArcadiaCompiler {

    public static ArcadiaProgram compile(String src) throws InstantiationException, IllegalAccessException {
        CharStream input = CharStreams.fromString(src);
        return compile(input);
    }

    public static ArcadiaProgram compile(CharStream src) throws InstantiationException, IllegalAccessException {
        ArcadiaLexer lexer = new ArcadiaLexer(src);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArcadiaParser parser = new ArcadiaParser(tokens);

        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();

        ArcadiaListenerImpl listener = new ArcadiaListenerImpl();
        walker.walk(listener, tree);
        return listener.finish();
    }

}
