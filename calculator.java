public class Calculator {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        // Example usage of the calculator methods
        System.out.println("Addition: " + addition(5, 3));
        System.out.println("Subtraction: " + subtraction(5, 3));
        System.out.println("Multiplication: " + multiplication(5, 3));
        System.out.println("Division: " + division(5, 3));
        System.out.println("Modulus: " + modulus(5, 3));
    }
}