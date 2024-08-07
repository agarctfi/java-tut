public class WrapperClassExamples {
    public static void main(String[] args) {
        // Call methods to demonstrate various wrapper class examples
        integerWrapper();
        doubleWrapper();
        booleanWrapper();
        characterWrapper();
        autoBoxingAndUnboxing();
    }

    // Wrapper class explanation:
    // Wrapper classes provide a way to use primitive data types as reference data types.
    // They contain useful methods and can be used with collections (e.g., ArrayList).
    //
    // Primitive    Wrapper
    // ---------    -------
    // boolean      Boolean
    // char         Character
    // int          Integer
    // double       Double
    //
    // Autoboxing: The automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
    // Unboxing: The reverse of autoboxing. Automatic conversion of wrapper class to primitive type.

    // Example using Integer wrapper class
    public static void integerWrapper() {
        System.out.println("Integer Wrapper Example:");

        // Creating Integer object from int
        Integer intObj = Integer.valueOf(10); // valueOf(int) converts primitive int to Integer object
        // Creating Integer object from String
        Integer intObjFromString = Integer.valueOf("20"); // valueOf(String) converts String to Integer object

        // Converting Integer to int
        int intValue = intObj.intValue(); // intValue() converts Integer object to primitive int

        // Printing values
        System.out.println("Integer object: " + intObj);
        System.out.println("Integer object from String: " + intObjFromString);
        System.out.println("int value: " + intValue);

        System.out.println(); // Print a new line for better readability
    }

    // Example using Double wrapper class
    public static void doubleWrapper() {
        System.out.println("Double Wrapper Example:");

        // Creating Double object from double
        Double doubleObj = Double.valueOf(10.5); // valueOf(double) converts primitive double to Double object
        // Creating Double object from String
        Double doubleObjFromString = Double.valueOf("20.5"); // valueOf(String) converts String to Double object

        // Converting Double to double
        double doubleValue = doubleObj.doubleValue(); // doubleValue() converts Double object to primitive double

        // Printing values
        System.out.println("Double object: " + doubleObj);
        System.out.println("Double object from String: " + doubleObjFromString);
        System.out.println("double value: " + doubleValue);

        System.out.println(); // Print a new line for better readability
    }

    // Example using Boolean wrapper class
    public static void booleanWrapper() {
        System.out.println("Boolean Wrapper Example:");

        // Creating Boolean object from boolean
        Boolean boolObj = Boolean.valueOf(true); // valueOf(boolean) converts primitive boolean to Boolean object
        // Creating Boolean object from String
        Boolean boolObjFromString = Boolean.valueOf("false"); // valueOf(String) converts String to Boolean object

        // Converting Boolean to boolean
        boolean boolValue = boolObj.booleanValue(); // booleanValue() converts Boolean object to primitive boolean

        // Printing values
        System.out.println("Boolean object: " + boolObj);
        System.out.println("Boolean object from String: " + boolObjFromString);
        System.out.println("boolean value: " + boolValue);

        System.out.println(); // Print a new line for better readability
    }

    // Example using Character wrapper class
    public static void characterWrapper() {
        System.out.println("Character Wrapper Example:");

        // Creating Character object from char
        Character charObj = Character.valueOf('a'); // valueOf(char) converts primitive char to Character object

        // Converting Character to char
        char charValue = charObj.charValue(); // charValue() converts Character object to primitive char

        // Printing values
        System.out.println("Character object: " + charObj);
        System.out.println("char value: " + charValue);

        System.out.println(); // Print a new line for better readability
    }

    // Example demonstrating autoboxing and unboxing
    public static void autoBoxingAndUnboxing() {
        System.out.println("Autoboxing and Unboxing Example:");

        // Autoboxing: converting primitive type to wrapper class object
        Integer autoboxedInt = 100; // Automatically converts int to Integer

        // Unboxing: converting wrapper class object to primitive type
        int unboxedInt = autoboxedInt; // Automatically converts Integer to int

        // Printing values
        System.out.println("Autoboxed Integer: " + autoboxedInt);
        System.out.println("Unboxed int: " + unboxedInt);

        System.out.println(); // Print a new line for better readability
    }
}
