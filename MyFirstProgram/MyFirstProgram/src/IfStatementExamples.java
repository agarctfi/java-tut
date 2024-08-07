public class IfStatementExamples {
    public static void main(String[] args) {
        int number = 15;

        // Simple if statement
        if (number > 10) {
            System.out.println("Simple if: The number is greater than 10.");
        }

        // if-else statement
        if (number < 10) {
            System.out.println("if-else: The number is less than 10.");
        } else {
            System.out.println("if-else: The number is not less than 10.");
        }

        // if-else if-else ladder
        if (number > 20) {
            System.out.println("if-else if-else: The number is greater than 20.");
        } else if (number > 10) {
            System.out.println("if-else if-else: The number is greater than 10 but less than or equal to 20.");
        } else {
            System.out.println("if-else if-else: The number is 10 or less.");
        }

        // Nested if statement
        if (number > 0) {
            System.out.println("Nested if: The number is positive.");

            if (number % 2 == 0) {
                System.out.println("Nested if: The number is even.");
            } else {
                System.out.println("Nested if: The number is odd.");
            }
        } else {
            System.out.println("Nested if: The number is not positive.");
        }

        // Combining conditions with logical operators
        if (number > 10 && number < 20) {
            System.out.println("Logical AND: The number is between 10 and 20.");
        }

        if (number < 0 || number > 20) {
            System.out.println("Logical OR: The number is either less than 0 or greater than 20.");
        }
    }
}
