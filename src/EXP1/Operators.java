package EXP1;

public class Operators {

    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise operators
        int num1 = 5, num2 = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("num1 & num2: " + (num1 & num2));
        System.out.println("num1 | num2: " + (num1 | num2));
        System.out.println("num1 ^ num2: " + (num1 ^ num2));
        System.out.println("~num1: " + (~num1));

        // Assignment operators
        System.out.println("\nAssignment Operators:");
        Integer result = 0;
        result += 5;
        System.out.println("result += 5: " + result);
        result -= 3;
        System.out.println("result -= 3: " + result);
        result *= 2;
        System.out.println("result *= 2: " + result);
        result /= 4;
        System.out.println("result /= 4: " + result);

        // Miscellaneous operators
        System.out.println("\nMiscellaneous Operators:");
        int number = 15;
        System.out.println("Conditional Operator (Ternary): " + ((number % 2 == 0) ? "Even" : "Odd"));
        System.out.println("Instanceof Operator: " + (result instanceof Integer));
    }

}
