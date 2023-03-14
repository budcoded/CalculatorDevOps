import org.calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void multiplicationTruePositive () {
        assertEquals("Finding multiplication of two number for true positive ", 15, calculator.multiplication(3, 5), DELTA);
        assertEquals("Finding multiplication of two number for true positive ", 24, calculator.multiplication(6, 4), DELTA);
    }

    @Test
    public void multiplicationFalsePositive () {
        assertNotEquals("Finding multiplication of two number for False Positive", 120, calculator.multiplication(5,8), DELTA);
        assertNotEquals("Finding multiplication of two number for False Positive", 80, calculator.multiplication(4,10), DELTA);
    }

    @Test
    public void squareTruePositive () {
        assertEquals("Finding square for True Positive", 16, calculator.square(4), DELTA);
        assertEquals("Finding square for True Positive", 1, calculator.square(1), DELTA);
    }

    @Test
    public void squareFalsePositive () {
        assertNotEquals("Finding square for False Positive", 10, calculator.square(3), DELTA);
        assertNotEquals("Finding square for False Positive", 20, calculator.square(4), DELTA);
    }

    @Test
    public void cubeRootTruePositive () {
        assertEquals("Finding cube root for True Positive", 5, calculator.cubeRoot(125), DELTA);
        assertEquals("Finding cube root for True Positive", -5, calculator.cubeRoot(-125), DELTA);
    }

    @Test
    public void cubeRootFalsePositive () {
        assertNotEquals("Finding cube root for False Positive", 11, calculator.cubeRoot(121), DELTA);
        assertNotEquals("Finding cube root for False Positive", 3, calculator.cubeRoot(8), DELTA);
    }


    @Test
    public void subTruePositive () {
        assertEquals("Finding subtraction of two number for True Positive", 2, calculator.subtraction(5,3), DELTA);
        assertEquals("Finding subtraction of two number for True Positive", -2, calculator.subtraction(6,8), DELTA);
    }

    @Test
    public void subFalsePositive () {
        assertNotEquals("Finding subtraction of two number for False Positive", 3, calculator.subtraction(5,8), DELTA);
        assertNotEquals("Finding subtraction of two number for False Positive", -1, calculator.subtraction(5,4), DELTA);
    }
}
