package Calculator;

/**
 * Practice with static class methods.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("2 + 2 = " + Calculator.add(2, 2));
        System.out.println("2 - 9 = " + Calculator.subtract(2, 9));
        System.out.println("2 * 6 = " + Calculator.multiply(2, 6));
        System.out.println("16 / 4 = " + Calculator.divide(16, 4));
        System.out.println("2 / 0 = " + Calculator.divide(2, 0));
    }
}
