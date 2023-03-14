import org.calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootTruePositive () {
        assertEquals("Finding square root of a number for true positive ", 4, calculator.squareRoot(16), DELTA);
        assertEquals("Finding square root of a number for true positive ", 2, calculator.squareRoot(4), DELTA);
        assertEquals("Finding square root of a number for true positive ", 3, calculator.squareRoot(9), DELTA);
        assertEquals("Finding square root of a number for true positive ", 5, calculator.squareRoot(25), DELTA);
        assertEquals("Finding square root of a number for true positive ", 6, calculator.squareRoot(36), DELTA);
    }

    @Test
    public void squareRootFalsePositive () {
        assertNotEquals("Finding square root of a number for false positive ", 14, calculator.squareRoot(16), DELTA);
        assertNotEquals("Finding square root of a number for false positive ", 12, calculator.squareRoot(4), DELTA);
        assertNotEquals("Finding square root of a number for false positive ", 13, calculator.squareRoot(9), DELTA);
        assertNotEquals("Finding square root of a number for false positive ", 15, calculator.squareRoot(25), DELTA);
        assertNotEquals("Finding square root of a number for false positive ", 16, calculator.squareRoot(36), DELTA);
    }

    @Test
    public void factorialTruePositive () {
        assertEquals("Finding factorial of a number for true positive ", 1, calculator.factorial(1), DELTA);
        assertEquals("Finding factorial of a number for true positive ", 2, calculator.factorial(2), DELTA);
        assertEquals("Finding factorial of a number for true positive ", 6, calculator.factorial(3), DELTA);
        assertEquals("Finding factorial of a number for true positive ", 24, calculator.factorial(4), DELTA);
        assertEquals("Finding factorial of a number for true positive ", 120, calculator.factorial(5), DELTA);
    }

    @Test
    public void factorialFalsePositive () {
        assertNotEquals("Finding factorial of a number for false positive ", 11.0, calculator.factorial(1), DELTA);
        assertNotEquals("Finding factorial of a number for false positive ", 12.0, calculator.factorial(2), DELTA);
        assertNotEquals("Finding factorial of a number for false positive ", 16.0, calculator.factorial(3), DELTA);
        assertNotEquals("Finding factorial of a number for false positive ", 124.0, calculator.factorial(4), DELTA);
        assertNotEquals("Finding factorial of a number for false positive ", 1120.0, calculator.factorial(5), DELTA);
    }

    @Test
    public void naturalLogTruePositive () {
        assertEquals("Finding natural log of a number for true positive ", 0.6931471805599453, calculator.naturalLog(2.0), DELTA);
        assertEquals("Finding natural log of a number for true positive ", 1.0986122886681098, calculator.naturalLog(3.0), DELTA);
        assertEquals("Finding natural log of a number for true positive ", 1.3862943611198906, calculator.naturalLog(4.0), DELTA);
        assertEquals("Finding natural log of a number for true positive ", 1.6094379124341003, calculator.naturalLog(5.0), DELTA);
        assertEquals("Finding natural log of a number for true positive ", 1.791759469228055, calculator.naturalLog(6.0), DELTA);
    }

    @Test
    public void naturalLogFalsePositive () {
        assertNotEquals("Finding natural log of a number for false positive ", 1.6931471805599453, calculator.naturalLog(2.0), DELTA);
        assertNotEquals("Finding natural log of a number for false positive ", 2.6931471805599453, calculator.naturalLog(3.0), DELTA);
        assertNotEquals("Finding natural log of a number for false positive ", 1.6931471805599453, calculator.naturalLog(4.0), DELTA);
        assertNotEquals("Finding natural log of a number for false positive ", 3.6931471805599453, calculator.naturalLog(5.0), DELTA);
        assertNotEquals("Finding natural log of a number for false positive ", 5.6931471805599453, calculator.naturalLog(6.0), DELTA);
    }

    @Test
    public void powerTruePositive () {
        assertEquals("Finding power of a number for true positive ", 1, calculator.power(1, 2), DELTA);
        assertEquals("Finding power of a number for true positive ", 4, calculator.power(2, 2), DELTA);
        assertEquals("Finding power of a number for true positive ", 9, calculator.power(3, 2), DELTA);
        assertEquals("Finding power of a number for true positive ", 16, calculator.power(4, 2), DELTA);
        assertEquals("Finding power of a number for true positive ", 25, calculator.power(5, 2), DELTA);
    }

    @Test
    public void powerFalsePositive () {
        assertNotEquals("Finding power of a number for false positive ", 11, calculator.power(1, 2), DELTA);
        assertNotEquals("Finding power of a number for false positive ", 11, calculator.power(2, 2), DELTA);
        assertNotEquals("Finding power of a number for false positive ", 11, calculator.power(3, 2), DELTA);
        assertNotEquals("Finding power of a number for false positive ", 11, calculator.power(4, 2), DELTA);
        assertNotEquals("Finding power of a number for false positive ", 11, calculator.power(5, 2), DELTA);
    }
}
