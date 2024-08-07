public class IntegerClassMethodsExample {
    public static void main(String[] args) {
        intValueMethod();
        valueOfMethod();
        parseIntMethod();
        compareMethod();
        toStringMethod();
        intMaxValueMethod();
        intMinValueMethod();
        sumMethod();
        minMethod();
        maxMethod();
    }

    // Demonstrates the intValue() method
    public static void intValueMethod() {
        System.out.println("intValue() Method Example:");

        Integer intObj = Integer.valueOf(10);
        int intPrimitive = intObj.intValue(); // Converts Integer object to primitive int

        System.out.println("Integer object: " + intObj);
        System.out.println("Primitive int: " + intPrimitive);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the valueOf() method
    public static void valueOfMethod() {
        System.out.println("valueOf() Method Example:");

        Integer intObj1 = Integer.valueOf(10); // Converts primitive int to Integer object
        Integer intObj2 = Integer.valueOf("20"); // Converts String to Integer object

        System.out.println("Integer object from int: " + intObj1);
        System.out.println("Integer object from String '20': " + intObj2);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the parseInt() method
    public static void parseIntMethod() {
        System.out.println("parseInt() Method Example:");

        int intPrimitive1 = Integer.parseInt("30"); // Parses the string argument as a signed decimal integer
        int intPrimitive2 = Integer.parseInt("40");

        System.out.println("Parsed int from String '30': " + intPrimitive1);
        System.out.println("Parsed int from String '40': " + intPrimitive2);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the compare() method
    public static void compareMethod() {
        System.out.println("compare() Method Example:");

        int result1 = Integer.compare(10, 20); // Compares two int values
        int result2 = Integer.compare(20, 10);
        int result3 = Integer.compare(10, 10);

        System.out.println("Comparison of 10 and 20: " + result1); // Outputs -1
        System.out.println("Comparison of 20 and 10: " + result2); // Outputs 1
        System.out.println("Comparison of 10 and 10: " + result3); // Outputs 0
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the toString() method
    public static void toStringMethod() {
        System.out.println("toString() Method Example:");

        Integer intObj = Integer.valueOf(50);
        String intString = intObj.toString(); // Converts Integer object to String

        System.out.println("Integer object: " + intObj);
        System.out.println("String representation: " + intString);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the Integer.MAX_VALUE constant
    public static void intMaxValueMethod() {
        System.out.println("Integer.MAX_VALUE Example:");

        int maxValue = Integer.MAX_VALUE; // Maximum value an int can have
        System.out.println("Integer.MAX_VALUE: " + maxValue);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the Integer.MIN_VALUE constant
    public static void intMinValueMethod() {
        System.out.println("Integer.MIN_VALUE Example:");

        int minValue = Integer.MIN_VALUE; // Minimum value an int can have
        System.out.println("Integer.MIN_VALUE: " + minValue);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the sum() method
    public static void sumMethod() {
        System.out.println("sum() Method Example:");

        int sum = Integer.sum(10, 20); // Returns the sum of two int values
        System.out.println("Sum of 10 and 20: " + sum);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the min() method
    public static void minMethod() {
        System.out.println("min() Method Example:");

        int min = Integer.min(10, 20); // Returns the smaller of two int values
        System.out.println("Minimum of 10 and 20: " + min);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the max() method
    public static void maxMethod() {
        System.out.println("max() Method Example:");

        int max = Integer.max(10, 20); // Returns the larger of two int values
        System.out.println("Maximum of 10 and 20: " + max);
        System.out.println(); // Print a new line for better readability
    }
}
