import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class AppTest{
    Calculator testee;
    /*
Addition
    */
    @Before
    public void setup(){
        testee = new Calculator();
    }
    @Test
    public void testSummePositive() {
        assertTrue(testee.summe(10, 20) == 30);
    }
    @Test
    public void testSummeNegative() {
        assertTrue(testee.summe(-20, -10) == -30);
    }
    @Test
    public void testSummePositiveNegative() {
        assertTrue(testee.summe(-10, 20) == 10);
    }
    @Test
    public void testSummeNegativePositive() {
        assertTrue(testee.summe(10, -20) == -10);
    }
    @Test
    public void testSummeZero() {
        assertTrue(testee.summe(0, 20) == 20);
    }
    @Test
    public void testSummeRounding() {
        assertTrue(testee.summe(5 / 2, 2) == 4);
    }
    @Test
    public void testSummeLargenumbers() {
       assertTrue(testee.summe(1000000, 2000000) == 3000000);
    }
    @Test(expected = ArithmeticException.class)
    public void testSummeOverflow() {
        assertEquals((long) Integer.MAX_VALUE + 1, testee.summe(Integer.MAX_VALUE, 1));
    }
        /*
    Subtraktion
        */
    @Test
    public void testDifferenzPositive() {
        assertTrue(testee.differenz(10, 20) == -10);
    }
    @Test
    public void testDifferenzNegative() {
        assertTrue(testee.differenz(-20, -10) == -10);
    }
    @Test
    public void testDifferenzPositiveNegative() {
        assertTrue(testee.differenz(-10, 20) == -30);
    }
    @Test
    public void testDifferenzNegativePositive() {
        assertTrue(testee.differenz(10, -20) == 30);
    }
    @Test
    public void testDifferenzZero() {
        assertTrue(testee.differenz(0, 20) == -20);
    }
    @Test
    public void testDifferenzRounding() {
        assertTrue(testee.differenz(5 / 2, 2) == 0);
    }
    @Test
    public void testDifferenzLargenumbers() {
        assertTrue(testee.differenz(1000000, 2000000) == -1000000);
    }
    @Test(expected = ArithmeticException.class)
    public void testDifferenzOverflow() {
        testee = new Calculator();
        assertEquals((long) Integer.MIN_VALUE - 1, testee.differenz(Integer.MIN_VALUE, 1));
    }

    /*
    Division
     */


    @Test
    public void testMultiplikationPositive() {
        assertTrue(testee.multiplikation(10, 20) == 200);
    }
    @Test
    public void testMultiplikationNegative() {
        assertTrue(testee.multiplikation(-20, -10) == 200);
    }
    @Test
    public void testMultiplikationPositiveNegative() {
        assertTrue(testee.multiplikation(-10, 20) == -200);
    }
    @Test
    public void testMultiplikationNegativePositive() {
        assertTrue(testee.multiplikation(10, -20) == -200);
    }
    @Test
    public void testMultiplikationZero() {
        assertTrue(testee.multiplikation(0, 20) == 0);
    }
    @Test
    public void testMultiplikationZeroNegative() {
        assertTrue(testee.multiplikation(0, -2) == 0);
    }
    @Test
    public void testMultiplikationLargenumbers() {
        assertTrue(testee.multiplikation(100, 20000) ==   2000000);
    }
    @Test(expected = ArithmeticException.class)
    public void testMultiplikationOverflow() {
        testee = new Calculator();
        assertEquals((long) Integer.MIN_VALUE * 1, testee.differenz(Integer.MIN_VALUE, 1));
    }

}
