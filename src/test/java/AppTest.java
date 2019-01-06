import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class AppTest {
    Calculator testee;

    @Test
        public void testSumme(){
        testee = new Calculator();
        assertTrue(testee.summe(10,20) == 30);
    }
    @Test
        public void testSubtraction(){
        testee = new Calculator();
        assertTrue(testee.subtraktion(25, 10) == 15);
    }
}
