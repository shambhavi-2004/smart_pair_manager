package EXP1;

public class DataTypes {

    public static void main(String[] args) {
        // Primitive Data Types
        byte byteValue = 120;
        short shortValue = 30000;
        int intValue = 123456789;
        long longValue = 9876543210L;
        float floatValue = 123.45f;
        double doubleValue = 456.789;
        char charValue = 'A';
        boolean booleanValue = true;

        // Displaying primitive data types
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        // Reference Data Types
        String stringValue = "Hello, Java!";
        int[] intArray = {1, 2, 3, 4, 5};

        // Displaying reference data types
        System.out.println("\nReference Data Types:");
        System.out.println("String: " + stringValue);

        System.out.print("intArray: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Various ways of printing
        System.out.println("\nVarious Ways of Printing:");
        System.out.printf("Formatted String: %s%n", stringValue);

        System.out.println("Using print method in a loop:");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Concatenation
        System.out.println("Concatenation: " + intValue + doubleValue);

        // Using newline character
        System.out.print("Newline character: ");
        System.out.print("Line 1\nLine 2\nLine 3\n");

        // Using println
        System.out.println("println: Line 1");
        System.out.println("         Line 2");
        System.out.println("         Line 3");
    }

}