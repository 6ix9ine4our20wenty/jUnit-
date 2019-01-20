public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;

        System.out.println("Console Calculator\n" +
                "=====================\n" +
                "\n");

        valueA = 10;
        valueB = 20;
        System.out.println("Summe " + valueA + " + " + valueB + " = " +  calculator.summe(valueA, valueB));
        System.out.println("Multiplikation " + valueA + " * " + valueB +  " = " + calculator.multiplikation(valueA, valueB));
        System.out.println("Subtraktion " + valueA + " - " + valueB +  " = " + calculator.differenz(valueA, valueB));


    }
}
