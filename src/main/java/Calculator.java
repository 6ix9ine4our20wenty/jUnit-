public class Calculator {
    int summe(int value1, int value2) {
        long tester = (long) value1 + (long) value2;
        overflowhandler(tester);
        return (int) tester;
    }
    int differenz(int value1, int value2) {
        long tester = (long) value1 - (long) value2;
        overflowhandler(tester);
        return (int) tester;
    }
    int division(int value1, int value2) {
        long tester = (long) value1 / (long) value2;
        overflowhandler(tester);
        return (int) tester;
    }

    private void overflowhandler(long tester) {
        if (tester > Integer.MAX_VALUE) {
            throw new ArithmeticException("too big");
        }
        if (tester < Integer.MIN_VALUE) {
            throw new ArithmeticException("too small");
        }
    }

}
