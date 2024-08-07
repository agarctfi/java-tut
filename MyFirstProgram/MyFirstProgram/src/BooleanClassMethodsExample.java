public class BooleanClassMethodsExample {
    public static void main(String[] args) {
        booleanValueMethod();
        valueOfMethod();
        parseBooleanMethod();
        compareMethod();
        logicalAndMethod();
        logicalOrMethod();
        logicalXorMethod();
        toStringMethod();
    }

    // Demonstrates the booleanValue() method
    public static void booleanValueMethod() {
        System.out.println("booleanValue() Method Example:");
        
        Boolean boolObj = Boolean.valueOf(true);
        boolean boolPrimitive = boolObj.booleanValue(); // Converts Boolean object to primitive boolean

        System.out.println("Boolean object: " + boolObj);
        System.out.println("Primitive boolean: " + boolPrimitive);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the valueOf() method
    public static void valueOfMethod() {
        System.out.println("valueOf() Method Example:");

        Boolean boolObj1 = Boolean.valueOf(true); // Converts primitive boolean to Boolean object
        Boolean boolObj2 = Boolean.valueOf("true"); // Converts String to Boolean object
        Boolean boolObj3 = Boolean.valueOf("false");

        System.out.println("Boolean object from boolean: " + boolObj1);
        System.out.println("Boolean object from String 'true': " + boolObj2);
        System.out.println("Boolean object from String 'false': " + boolObj3);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the parseBoolean() method
    public static void parseBooleanMethod() {
        System.out.println("parseBoolean() Method Example:");

        boolean boolPrimitive1 = Boolean.parseBoolean("true"); // Parses the string argument as a boolean
        boolean boolPrimitive2 = Boolean.parseBoolean("false");

        System.out.println("Parsed boolean from String 'true': " + boolPrimitive1);
        System.out.println("Parsed boolean from String 'false': " + boolPrimitive2);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the compare() method
    public static void compareMethod() {
        System.out.println("compare() Method Example:");

        int result1 = Boolean.compare(true, false); // Compares two boolean values
        int result2 = Boolean.compare(false, true);
        int result3 = Boolean.compare(true, true);

        System.out.println("Comparison of true and false: " + result1); // Outputs 1
        System.out.println("Comparison of false and true: " + result2); // Outputs -1
        System.out.println("Comparison of true and true: " + result3); // Outputs 0
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the logicalAnd() method
    public static void logicalAndMethod() {
        System.out.println("logicalAnd() Method Example:");

        boolean result = Boolean.logicalAnd(true, false); // Performs a logical AND operation

        System.out.println("Logical AND of true and false: " + result); // Outputs false
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the logicalOr() method
    public static void logicalOrMethod() {
        System.out.println("logicalOr() Method Example:");

        boolean result = Boolean.logicalOr(true, false); // Performs a logical OR operation

        System.out.println("Logical OR of true and false: " + result); // Outputs true
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the logicalXor() method
    public static void logicalXorMethod() {
        System.out.println("logicalXor() Method Example:");

        boolean result = Boolean.logicalXor(true, false); // Performs a logical XOR operation

        System.out.println("Logical XOR of true and false: " + result); // Outputs true
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the toString() method
    public static void toStringMethod() {
        System.out.println("toString() Method Example:");

        Boolean boolObj = Boolean.valueOf(true);
        String boolString = boolObj.toString(); // Converts Boolean object to String

        System.out.println("Boolean object: " + boolObj);
        System.out.println("String representation: " + boolString);
        System.out.println(); // Print a new line for better readability
    }
}
