import org.junit.Test;
import us.whitehorn.jason.arcadia.compiler.ArcadiaCompiler;
import us.whitehorn.jason.arcadia.core.ArcadiaProgram;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class ArcadiaListenerImplTests {

    @Test
    public void testCanCompileNothing() {
        ArcadiaProgram prog = null;
        try {
            prog = ArcadiaCompiler.compile("\n");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        assertNotNull(prog);
    }

    @Test
    public void testCanDefineIntegerVariable() {
        ArcadiaProgram prog = null;
        try {
            prog = ArcadiaCompiler.compile("i = 3\n_debug i\n");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(prog);
        prog.run();
        int output = (int) prog._debugOutput;
        assertEquals(3, output);
    }
}
