public class operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 1. Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // 2. Unary Operators
        System.out.println("\n=== Unary Operators ===");
        int x = 5;
        System.out.println("Unary Plus: " + (+x));
        System.out.println("Unary Minus: " + (-x));
        System.out.println("Increment: " + (++x));
        System.out.println("Decrement: " + (--x));
        System.out.println("Logical NOT: " + (!true));

        // 3. Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 4. Logical Operators
        System.out.println("\n=== Logical Operators ===");
        boolean p = true;
        boolean q = false;
        System.out.println("AND: " + (p && q));
        System.out.println("OR: " + (p || q));
        System.out.println("NOT: " + (!p));

        // 5. Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int n = 10;
        System.out.println("Initial: " + n);
        n += 5;
        System.out.println("After += 5: " + n);
        n -= 3;
        System.out.println("After -= 3: " + n);
        n *= 2;
        System.out.println("After *= 2: " + n);
        n /= 4;
        System.out.println("After /= 4: " + n);
        n %= 3;
        System.out.println("After %= 3: " + n);

        // 6. Bitwise Operators
        System.out.println("\n=== Bitwise Operators ===");
        int c = 5; // Binary: 0101
        int d = 3; // Binary: 0011
        System.out.println("Bitwise AND: " + (c & d));
        System.out.println("Bitwise OR: " + (c | d));
        System.out.println("Bitwise XOR: " + (c ^ d));
        System.out.println("Bitwise NOT: " + (~c));

        // 7. Shift Operators
        System.out.println("\n=== Shift Operators ===");
        System.out.println("Left Shift: " + (c << 1));
        System.out.println("Signed Right Shift: " + (c >> 1));
        System.out.println("Unsigned Right Shift: " + (c >>> 1));

        // 8. Ternary Operator
        System.out.println("\n=== Ternary Operator ===");
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Result: " + result);

        // 9. instanceof Operator
        System.out.println("\n=== instanceof Operator ===");
        String name = "Java";
        System.out.println(name instanceof String);

        // 10. Type Cast Operators
        System.out.println("\n=== Type Casting ===");
        double value = 9.8;
        int converted = (int) value;
        System.out.println("Double: " + value);
        System.out.println("Converted to int: " + converted);

        // 11. String Concatenation Operator
        System.out.println("\n=== String Concatenation ===");
        String first = "Hello";
        String second = "Java";
        System.out.println(first + " " + second);
    }
}