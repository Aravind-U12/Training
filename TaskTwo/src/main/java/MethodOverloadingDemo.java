/**
 * Demonstrates method overloading: same method name, different signatures.
 */
public class MethodOverloadingDemo {
    public static void run() {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.add(10, 20, 30));
        System.out.println(calculator.add(2.5, 3.5));
    }

    private static class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

        double add(double a, double b) {
            return a + b;
        }
    }
}
