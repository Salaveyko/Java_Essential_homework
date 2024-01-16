package Calculator;

import java.util.Scanner;

/**
 * The program parses the entered expression and performs mathematical operations with its parts.
 * An expression like 'double action double' with spaces between them is required.
 * En error will occur if the expression is entered incorrectly.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // required spaces between parts of the expression
            System.out.print("\n('exit' to finish work)\nEnter the expression: ");
            String expression = sc.nextLine();

            Scanner expScan = new Scanner(expression);
            try {
                if (!expScan.hasNextDouble()) {
                    if (expScan.hasNext()) {
                        if (expScan.next().equalsIgnoreCase("exit")) return;
                    }
                    throw new IllegalArgumentException("Incorrect expression.");
                }
                double res = expScan.nextDouble();
                if (!expScan.hasNext()) {
                    throw new IllegalArgumentException("Incorrect expression.");
                }
                char action = expScan.next().charAt(0);
                if (!expScan.hasNextDouble()) {
                    throw new IllegalArgumentException("Incorrect expression.");
                }
                double num = expScan.nextDouble();

                expScan.close();

                switch (action) {
                    case '+' -> res = Calculator.add(res, num);
                    case '-' -> res = Calculator.subtract(res, num);
                    case '*' -> res = Calculator.multiply(res, num);
                    case '/' -> res = Calculator.divide(res, num);
                    default -> throw new IllegalArgumentException("Incorrect expression.");
                }

                System.out.println(expression + " = " + res);

            } catch (Exception e) {
                System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            }
        }
    }
}
