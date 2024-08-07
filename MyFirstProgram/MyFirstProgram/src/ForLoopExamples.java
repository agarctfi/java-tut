public class ForLoopExamples {
    public static void main(String[] args) {
        // Call methods to demonstrate various for loop examples
        basicForLoop();
        enhancedForLoop();
        nestedForLoop();
        multipleInitUpdateForLoop();
        infiniteForLoopWithBreak();
    }

    // Basic for loop example
    public static void basicForLoop() {
        System.out.println("Basic For Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
        System.out.println(); // Print a new line for better readability
    }

    // Enhanced for loop (for-each loop) example
    public static void enhancedForLoop() {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Enhanced For Loop Example:");
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        System.out.println(); // Print a new line for better readability
    }

    // Nested for loop example (multiplication table)
    public static void nestedForLoop() {
        System.out.println("Nested For Loop Example (Multiplication Table):");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(); // New line after each row
        }
    }

    // For loop with multiple initialization and update statements
    public static void multipleInitUpdateForLoop() {
        System.out.println("For Loop with Multiple Initialization and Update Statements:");

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }
        System.out.println(); // Print a new line for better readability
    }

    // Infinite for loop with break example
    public static void infiniteForLoopWithBreak() {
        System.out.println("Infinite For Loop with Break Example:");

        for (int i = 0; ; i++) { // Infinite loop
            if (i == 5) {
                break; // Exit the loop when i reaches 5
            }
            System.out.println("i: " + i);
        }
        System.out.println("Loop terminated.");
    }
}
