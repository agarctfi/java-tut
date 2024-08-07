public class DoubleClassMethodsExample {
    public static void main(String[] args) {
        doubleValueMethod();
        valueOfMethod();
        parseDoubleMethod();
        compareMethod();
        toStringMethod();
        doubleMaxValueMethod();
        doubleMinValueMethod();
        sumMethod();
        minMethod();
        maxMethod();
        isNaNMethod();
        isInfiniteMethod();
    }

    // Demonstrates the doubleValue() method
    public static void doubleValueMethod() {
        System.out.println("doubleValue() Method Example:");

        Double doubleObj = Double.valueOf(10.5);
        double doublePrimitive = doubleObj.doubleValue(); // Converts Double object to primitive double

        System.out.println("Double object: " + doubleObj);
        System.out.println("Primitive double: " + doublePrimitive);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the valueOf() method
    public static void valueOfMethod() {
        System.out.println("valueOf() Method Example:");

        Double doubleObj1 = Double.valueOf(10.5); // Converts primitive double to Double object
        Double doubleObj2 = Double.valueOf("20.5"); // Converts String to Double object

        System.out.println("Double object from double: " + doubleObj1);
        System.out.println("Double object from String '20.5': " + doubleObj2);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the parseDouble() method
    public static void parseDoubleMethod() {
        System.out.println("parseDouble() Method Example:");

        double doublePrimitive1 = Double.parseDouble("30.5"); // Parses the string argument as a double
        double doublePrimitive2 = Double.parseDouble("40.5");

        System.out.println("Parsed double from String '30.5': " + doublePrimitive1);
        System.out.println("Parsed double from String '40.5': " + doublePrimitive2);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the compare() method
    public static void compareMethod() {
        System.out.println("compare() Method Example:");

        int result1 = Double.compare(10.5, 20.5); // Compares two double values
        int result2 = Double.compare(20.5, 10.5);
        int result3 = Double.compare(10.5, 10.5);

        System.out.println("Comparison of 10.5 and 20.5: " + result1); // Outputs -1
        System.out.println("Comparison of 20.5 and 10.5: " + result2); // Outputs 1
        System.out.println("Comparison of 10.5 and 10.5: " + result3); // Outputs 0
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the toString() method
    public static void toStringMethod() {
        System.out.println("toString() Method Example:");

        Double doubleObj = Double.valueOf(50.5);
        String doubleString = doubleObj.toString(); // Converts Double object to String

        System.out.println("Double object: " + doubleObj);
        System.out.println("String representation: " + doubleString);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the Double.MAX_VALUE constant
    public static void doubleMaxValueMethod() {
        System.out.println("Double.MAX_VALUE Example:");

        double maxValue = Double.MAX_VALUE; // Maximum value a double can have
        System.out.println("Double.MAX_VALUE: " + maxValue);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the Double.MIN_VALUE constant
    public static void doubleMinValueMethod() {
        System.out.println("Double.MIN_VALUE Example:");

        double minValue = Double.MIN_VALUE; // Minimum value a double can have
        System.out.println("Double.MIN_VALUE: " + minValue);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the sum() method
    public static void sumMethod() {
        System.out.println("sum() Method Example:");

        double sum = Double.sum(10.5, 20.5); // Returns the sum of two double values
        System.out.println("Sum of 10.5 and 20.5: " + sum);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the min() method
    public static void minMethod() {
        System.out.println("min() Method Example:");

        double min = Double.min(10.5, 20.5); // Returns the smaller of two double values
        System.out.println("Minimum of 10.5 and 20.5: " + min);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the max() method
    public static void maxMethod() {
        System.out.println("max() Method Example:");

        double max = Double.max(10.5, 20.5); // Returns the larger of two double values
        System.out.println("Maximum of 10.5 and 20.5: " + max);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the isNaN() method
    public static void isNaNMethod() {
        System.out.println("isNaN() Method Example:");

        Double doubleObj = Double.valueOf(0.0 / 0.0); // NaN (Not a Number)
        boolean isNaN = doubleObj.isNaN(); // Checks if the value is NaN

        System.out.println("Is NaN: " + isNaN);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the isInfinite() method
    public static void isInfiniteMethod() {
        System.out.println("isInfinite() Method Example:");

        Double doubleObj = Double.valueOf(1.0 / 0.0); // Infinity
        boolean isInfinite = doubleObj.isInfinite(); // Checks if the value is infinite

        System.out.println("Is Infinite: " + isInfinite);
        System.out.println(); // Print a new line for better readability
    }
}
