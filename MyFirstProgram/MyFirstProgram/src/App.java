import java.util.Scanner;

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



        /*
         * 
         * DATA TYPES EXAMPLES
         * 
         */

        // byte
        byte b = 100;
        byte minByte = -128;
        byte maxByte = 127;

        // short
        short s = 10000;
        short minShort = -32768;
        short maxShort = 32767;

        // int
        int i = 100000;
        int minInt = -2147483648;
        int maxInt = 2147483647;

        // long
        long l = 100000L;
        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;

        // float
        float f = 10.5f;
        float minFloat = 1.4E-45f;
        float maxFloat = 3.4028235E38f;

        // double
        double d = 10.5;
        double minDouble = 4.9E-324;
        double maxDouble = 1.7976931348623157E308;

        // char
        char c = 'A';
        char minChar = '\u0000';
        char maxChar = '\uffff';

        // boolean
        boolean bool = true;
        boolean boolFalse = false;

        // Print all values
        System.out.println("\n\n\nData Types Examples:");
        System.out.println("byte: " + b + ", min: " + minByte + ", max: " + maxByte);
        System.out.println("short: " + s + ", min: " + minShort + ", max: " + maxShort);
        System.out.println("int: " + i + ", min: " + minInt + ", max: " + maxInt);
        System.out.println("long: " + l + ", min: " + minLong + ", max: " + maxLong);
        System.out.println("float: " + f + ", min: " + minFloat + ", max: " + maxFloat);
        System.out.println("double: " + d + ", min: " + minDouble + ", max: " + maxDouble);
        System.out.println("char: " + c + ", min: " + (int)minChar + ", max: " + (int)maxChar);
        System.out.println("boolean: " + bool + ", " + boolFalse);



        /*
         * 
         * Swap 2 Vars Exercise
         * 
         */

         String x = "Water";
         String y = "Kool-Aid";
         String temp;
         
         temp = x;
         x = y;
         y = temp;

         System.out.println("\n\n\nSwapping Vars Exercise: ");
         System.out.println("X: "+x);
         System.out.println("Y: "+y);



         /*
          *
          * User Input Example
          *
          */
          Scanner scanner = new Scanner(System.in);
          System.out.println("What is your name? ");
          String name = scanner.nextLine();
          System.out.println("How old are you? ");
          int age = scanner.nextInt();
          scanner.nextLine(); //Clear Scanner
          System.out.println("What is your favorite food?");
          String food = scanner.nextLine();

          System.out.println("Hello "+name);
          System.out.println("You are "+age+" years old!");
          System.out.println(food+" is your favorite food!");
          
    }

}
