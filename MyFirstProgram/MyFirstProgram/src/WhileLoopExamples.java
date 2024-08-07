import java.util.Scanner;

public class WhileLoopExamples {
    public static void main(String[] args) {
        // Call the basic while loop example method
        basicWhileLoop();
        // Call the while loop with user input example method
        whileLoopWithUserInput();
        // Call the infinite while loop with break example method
        infiniteWhileLoopWithBreak();
    }

    // Basic while loop example
    public static void basicWhileLoop() {
        int number = 1;

        System.out.println("Basic While Loop Example:"); 
        while (number <= 5) {
            System.out.println("Number: " + number);
            number++; // Increment the number
        }
        System.out.println(); // Print a new line for better readability
    }

    // While loop with user input example
    public static void whileLoopWithUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("While Loop with User Input Example:");
        while (!input.equalsIgnoreCase("exit")) {
            System.out.print("Enter a word (type 'exit' to quit): ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        }
        System.out.println("Goodbye!");
        System.out.println(); // Print a new line for better readability

        // Note: Closing the scanner here can close the System.in stream, 
        // which can cause issues if using it again. So, not closing here.
    }

    // Infinite while loop with break example
    public static void infiniteWhileLoopWithBreak() {
        int counter = 0;

        System.out.println("Infinite While Loop with Break Example:");
        while (true) { // Infinite loop
            System.out.println("Counter: " + counter);
            counter++;

            if (counter >= 10) {
                break; // Exit the loop when counter reaches 10
            }
        }
        System.out.println("Loop terminated.");
    }
}
