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
        String script =
                "i = 3 \n" +
                "_debug i \n";
        try {
            prog = ArcadiaCompiler.compile(script);
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

    @Test
    public void testDefineFloatVariable() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0.5 \n" +
                "_debug i \n";
        try {
            prog = ArcadiaCompiler.compile(script);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(prog);
        prog.run();
        Float output = (Float) prog._debugOutput;
        assertEquals(0.5, output, 0.001);
    }

    @Test
    public void testCanDefineStringVariable() {
        ArcadiaProgram prog = null;
        String script =
                "i = \"Hi!\" \n" +
                "_debug i \n";
        try {
            prog = ArcadiaCompiler.compile(script);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(prog);
        prog.run();
        String output = (String) prog._debugOutput;
        assertEquals("Hi!", output);
    }

    @Test
    public void testCanPassStringArgument() {
        ArcadiaProgram prog = null;
        String script =
                "_debug \"Hi!\" \n";
        try {
            prog = ArcadiaCompiler.compile(script);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(prog);
        prog.run();
        String output = (String) prog._debugOutput;
        assertEquals("Hi!", output);
    }

    @Test
    public void testPassFloatArgument() {
        ArcadiaProgram prog = null;
        String script =
                "_debug 0.5 \n";
        try {
            prog = ArcadiaCompiler.compile(script);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(prog);
        prog.run();
        Float output = (Float) prog._debugOutput;
        assertEquals(0.5, output, 0.001);
    }

    @Test
    public void testPassIntegerArgument() {
        ArcadiaProgram prog = null;
        String script =
                "_debug 6 \n";
        try {
            prog = ArcadiaCompiler.compile(script);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(prog);
        prog.run();
        int output = (int) prog._debugOutput;
        assertEquals(6, output);
    }

    @Test
    public void testAssignIntegerVariableToAnother() {
        ArcadiaProgram prog = null;
        String script =
                "i = 3 \n" +
                "j = 4 \n" +
                "i = j \n" +
                "_debug i \n";
        try {
            prog = ArcadiaCompiler.compile(script);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(prog);
        prog.run();
        int output = (int) prog._debugOutput;
        assertEquals(4, output);
    }

    @Test
    public void testAssignFloatVariableToAnother() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0.3 \n" +
                "j = 0.4 \n" +
                "i = j \n" +
                "_debug i \n";
        try {
            prog = ArcadiaCompiler.compile(script);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(prog);
        prog.run();
        Float output = (Float) prog._debugOutput;
        assertEquals(0.4, output, 0.0001);
    }

    @Test
    public void testIntegerAddition() {
        ArcadiaProgram prog = null;
        String script =
                "i = 3 + 1 \n" +
                "_debug i \n";
        try {
            prog = ArcadiaCompiler.compile(script);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(prog);
        prog.run();
        int output = (int) prog._debugOutput;
        assertEquals(4, output);
    }

    @Test
    public void testIntegerSubtraction() {
        ArcadiaProgram prog = null;
        String script =
                "i = 3 - 1 \n" +
                "_debug i \n";
        try {
            prog = ArcadiaCompiler.compile(script);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(prog);
        prog.run();
        int output = (int) prog._debugOutput;
        assertEquals(2, output);
    }

    @Test
    public void testFloatAddition() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0.4 \n" +
                "i = i + 0.2 \n" +
                "_debug i \n";
        try {
            prog = ArcadiaCompiler.compile(script);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(prog);
        prog.run();
        float output = (float) prog._debugOutput;
        assertEquals(0.6, output, 0.001);
    }

    @Test
    public void testIntegerIncrement() {
        ArcadiaProgram prog = null;
        String script =
                "i = 3 \n" +
                "i = i + 1 \n" +
                "_debug i \n";
        try {
            prog = ArcadiaCompiler.compile(script);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertNotNull(prog);
        prog.run();
        int output = (int) prog._debugOutput;
        assertEquals(4, output);
    }

    @Test
    public void testWhileLoop() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0 \n" +
                "while i < 3 \n" +
                "    i = i + 1 \n" +
                "end \n" +
                "_debug i \n";
        try {
            prog = ArcadiaCompiler.compile(script);
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

    @Test
    public void testWhileLoopWithInequality() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0 \n" +
                "while i != 3 \n" +
                "    i = i + 1 \n" +
                "end \n" +
                "_debug i \n";
        try {
            prog = ArcadiaCompiler.compile(script);
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

    @Test
    public void testWhileLoopWithInequalityDecrement() {
        ArcadiaProgram prog = null;
        String script =
                "i = 6 \n" +
                "while i != 3 \n" +
                "    i = i - 1 \n" +
                "end \n" +
                "_debug i \n";
        try {
            prog = ArcadiaCompiler.compile(script);
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
