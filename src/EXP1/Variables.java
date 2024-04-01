package EXP1;

public class Variables {
    public static void main(String[] args) {
        // Declare and initialize primitive data type variables
        int intValue = 10;
        double doubleValue = 3.14;
        char charValue = 'A';
        boolean booleanValue = true;

        // Display the values of primitive data type variables
        System.out.println("Integer Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);

        // Declare and initialize reference type variables
        String stringValue = "Hello, Java!";
        int[] arrayValue = {1, 2, 3, 4, 5};

        // Display the values of reference type variables
        System.out.println("String Value: " + stringValue);
        System.out.print("Array Values: ");
        for (int i : arrayValue) {
            System.out.print(i + " ");
        }
    }
}
