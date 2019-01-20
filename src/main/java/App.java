import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Console Calculator\n" +
                "=====================\n" +
                "Bitte Zahlen eingeben");

        String valueA = scanner.next();
        String valueB = scanner.next();

        int value1 = Integer.parseInt(valueA);
        int value2 = Integer.parseInt(valueB);

        System.out.println("Summe " + valueA + " + " + valueB + " = " +  calculator.summe(value1, value2));
        System.out.println("Multiplikation " + valueA + " * " + valueB +  " = " + calculator.multiplikation(value1, value2));
        System.out.println("Subtraktion " + valueA + " - " + valueB +  " = " + calculator.differenz(value1, value2));


    }
}
