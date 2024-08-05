public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! + new Line:");
        System.out.print("Another way to print!");
        System.out.print(" - No New Line.");
        System.out.print("Hello, World! + new Line:\n");
        System.out.println("Other Escape Sequences - Backslash t  \twill add a tab.");
        System.out.println("To add a double quotes, you need a backslash in front of the dobule quotes \"example\"");
        System.out.println("To add a backslash, you need a double-backslash \\example\\");

        //This is a comment

        /*
         * This 
         * Is 
         * A 
         * Multi-Line
         * Comment
         */

       
         // New Line
        System.out.println("\n\nMore Examples: This is the 1st Line.\nThis is the second line.");

        // Tab
        System.out.println("Column1\tColumn2\tColumn3");

        // Backspace
        System.out.println("Hello\b World!"); // Removes the 'o' from "Hello"

        // Carriage Return
        System.out.println("Hello\rWorld!"); // "World!" will overwrite "Hello"

        // Form Feed (not visible in most modern environments)
        System.out.println("This is a form feed\fexample.");

        // Single Quote
        System.out.println("This is a single quote: \'");

        // Double Quote
        System.out.println("This is a double quote: \"");

        // Backslash
        System.out.println("This is a backslash: \\");
       
    }
}
