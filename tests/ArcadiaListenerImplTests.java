import org.junit.Test;
import us.whitehorn.jason.arcadia.compiler.ArcadiaCompiler;
import us.whitehorn.jason.arcadia.core.ArcadiaProgram;

import static junit.framework.Assert.assertNull;
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
    public void testFloatSubtraction() {
        ArcadiaProgram prog = null;
        String script =
                "i = 3.5 - 1.25 \n" +
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
        assertEquals(2.25, output, 0.001);
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
    public void testWhileLoopWithFloatLessThanOrEqualConditional() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0.5 \n" +
                "while i <= 3.0 \n" +
                "    i = i + 0.5 \n" +
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
        float output = (float) prog._debugOutput;
        assertEquals(3.5, output, 0.001);
    }

    @Test
    public void testWhileLoopWithIntegerLessThanOrEqualConditional() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0 \n" +
                "while i <= 3 \n" +
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
        assertEquals(4, output);
    }

    @Test
    public void testWhileLoopWithFloatLessThanConditional() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0.5 \n" +
                "while i < 3.0 \n" +
                "    i = i + 0.5 \n" +
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
        float output = (float) prog._debugOutput;
        assertEquals(3.0, output, 0.001);
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

    @Test
    public void testAssignFloatVariableToAnInteger() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0.3 \n" +
                "j = 4 \n" +
                "j = i \n" +
                "_debug j \n";
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
        assertEquals(0.3, output, 0.0001);
    }

    @Test
    public void tesAddFloatToAnInteger() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0.5 \n" +
                "j = 1 \n" +
                "k = i + j \n" +
                "_debug k \n";
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
        assertEquals(1.5, output, 0.0001);
    }

    @Test
    public void tesAddIntegerToAFloat() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0.5 \n" +
                        "j = 1 \n" +
                        "k = j + i \n" +
                        "_debug k \n";
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
        assertEquals(1.5, output, 0.0001);
    }

    @Test
    public void tesAddFloatToAnIntegerWithoutIntermediates() {
        ArcadiaProgram prog = null;
        String script =
                "i = 1 + 0.5 \n" +
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
        assertEquals(1.5, output, 0.0001);
    }

    @Test
    public void tesAddIntegerToAFloatWithoutIntermediates() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0.5 + 1 \n" +
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
        assertEquals(1.5, output, 0.0001);
    }

    @Test
    public void tesAddThreeIntegers() {
        ArcadiaProgram prog = null;
        String script =
                "i = 1 + 2 + 3 \n" +
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
        assertEquals(6, output);
    }

    @Test
    public void tesAddThreeFloats() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0.5 + 1.5 + 2.5 \n" +
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
        assertEquals(4.5, output, 0.001);
    }

    @Test
    public void tesAddTwoFloatsAndAInteger() {
        ArcadiaProgram prog = null;
        String script =
                "i = 0.5 + 1.5 + 2 \n" +
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
        assertEquals(4.0, output, 0.001);
    }

    @Test
    public void tesAddFourIntegers() {
        ArcadiaProgram prog = null;
        String script =
                "i = 1 + 2 + 3 + 4 \n" +
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
        assertEquals(10, output);
    }

    @Test
    public void tesMultiplyTwoIntegers() {
        ArcadiaProgram prog = null;
        String script =
                "i = 2 * 3 \n" +
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
        assertEquals(6, output);
    }

    @Test
    public void tesMultiplyTwoFloats() {
        ArcadiaProgram prog = null;
        String script =
                "i = 2.5 * 3.0 \n" +
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
        assertEquals(7.5, output, 0.001);
    }

    @Test
    public void tesDivideTwoIntegers() {
        ArcadiaProgram prog = null;
        String script =
                "i = 20 / 2 \n" +
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
        assertEquals(10, output);
    }

    @Test
    public void tesDivideByIntegerZero() {
        ArcadiaProgram prog = null;
        String script =
                "i = 20 / 0 \n" +
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
        Object output = prog._debugOutput;
        assertNull(output);
    }
}
