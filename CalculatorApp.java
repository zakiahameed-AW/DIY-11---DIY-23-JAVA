public class CalculatorApp {

    public static int calculateProduct(int num1, int num2) {
        return num1 * num2;
    }

    public static double calculateQuotient(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        int product = calculateProduct(4, 6);
        double quotient = calculateQuotient(20.0, 4.0);

        System.out.println("Product is: " + product);
        System.out.println("Quotient is: " + quotient);
    }
}
