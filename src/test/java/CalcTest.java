import Calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {
    Calculator calculator = new Calculator();
    public static final double DIFF = 1e-13;
    @Test
    public void square_rootTP(){
        assertEquals("square root test of a number for true positive", 4, calculator.square_root(16),DIFF);
        assertEquals("square root test of a number for true positive", 3, calculator.square_root(9),DIFF);
        assertEquals("square root test of a number for true positive", 7, calculator.square_root(49),DIFF);
        assertEquals("square root test of a number for true positive", 15, calculator.square_root(225),DIFF);
        assertEquals("square root test of a number for true positive", 1, calculator.square_root(1),DIFF);
        assertEquals("square root test of a number for true positive", -1, calculator.square_root(-100),DIFF);



    }
    @Test
    public void square_rootFP(){
        assertNotEquals("square root test of a number for true positive", -10, calculator.square_root(-100),DIFF);
        assertNotEquals("square root test of a number for true positive", -15, calculator.square_root(-225),DIFF);
        assertNotEquals("square root test of a number for false positive", 1, calculator.square_root(4),DIFF);
        assertNotEquals("square root test of a number for false positive", 0, calculator.square_root(1),DIFF);
        assertNotEquals("square root test of a number for false positive", 3, calculator.square_root(25),DIFF);
        assertNotEquals("square root test of a number for false positive", 8, calculator.square_root(80),DIFF);
    }
    @Test
    public void factorialTP(){
        assertEquals("factorial test of a number for true positive", 1, calculator.factorial(1),DIFF);
        assertEquals("factorial test of a number for true positive", 24, calculator.factorial(4),DIFF);
        assertEquals("factorial test of a number for true positive", 720, calculator.factorial(6),DIFF);
        assertEquals("factorial test of a number for true positive", 1, calculator.factorial(0),DIFF);
    }
    @Test
    public void factorialFP(){
        assertNotEquals("factorial test of a number for false positive", 24, calculator.factorial(-4),DIFF);
        assertNotEquals("factorial test of a number for false positive", 2, calculator.factorial(4),DIFF);
        assertNotEquals("factorial test of a number for false positive", 34, calculator.factorial(2),DIFF);
        assertNotEquals("factorial test of a number for false positive", 220, calculator.factorial(5),DIFF);
        assertNotEquals("factorial test of a number for false positive", 0, calculator.factorial(0),DIFF);
    }

    @Test
    public void logarithmTP(){
        assertEquals("logarithm test of a number for true positive", 0, calculator.logarithm(1),DIFF);
    }
    @Test
    public void logarithmFP(){
        assertNotEquals("logarithm test of a number for false positive", 23, calculator.logarithm(23),DIFF);
        assertNotEquals("logarithm test of a number for false positive", 23, calculator.logarithm(-23),DIFF);
        assertNotEquals("logarithm test of a number for false positive", 2, calculator.logarithm(3.412),DIFF);
        assertNotEquals("logarithm test of a number for false positive", 3, calculator.logarithm(10),DIFF);
    }

    @Test
    public void powerTP(){
        assertEquals("logarithm test of a number for true positive", 16, calculator.power(2,4),DIFF);
        assertEquals("logarithm test of a number for true positive", 64, calculator.power(4,3),DIFF);
        assertEquals("logarithm test of a number for true positive", 16, calculator.power(2,4),DIFF);
        assertEquals("logarithm test of a number for true positive", 1, calculator.power(1,1),DIFF);
        assertEquals("logarithm test of a number for true positive", 36, calculator.power(6,2),DIFF);
    }
    @Test
    public void powerFP(){
        assertNotEquals("logarithm test of a number for true positive", 0, calculator.power(0,0),DIFF);
        assertNotEquals("logarithm test of a number for false positive", 2, calculator.power(2,2),DIFF);
        assertNotEquals("logarithm test of a number for false positive", 0, calculator.power(1,1),DIFF);
        assertNotEquals("logarithm test of a number for false positive", 120, calculator.power(11,2),DIFF);
        assertNotEquals("logarithm test of a number for false positive", 225, calculator.power(5,3),DIFF);
    }
}
