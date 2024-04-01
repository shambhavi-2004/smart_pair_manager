package EXP1;

public class ControlStatements {

    public static void main(String[] args) {
        // If-else statement
        int num1 = 10;
        int num2 = 20;

        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        } else {
            System.out.println("num2 is greater than or equal to num1");
        }

        // If-elseif-else statement
        int score = 75;

        if (score >= 90) {
            System.out.println("Excellent!");
        } else if (score >= 70) {
            System.out.println("Good job!");
        } else {
            System.out.println("Keep trying!");
        }

        // Switch statement
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Average.");
                break;
            default:
                System.out.println("Keep trying!");
        }

        // For loop
        System.out.print("For loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While loop
        System.out.print("While loop: ");
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        // Do-while loop
        System.out.print("Do-while loop: ");
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 5);
        System.out.println();

        // Break statement
        System.out.print("Break statement: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Continue statement
        System.out.print("Continue statement: ");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }
    }


}
