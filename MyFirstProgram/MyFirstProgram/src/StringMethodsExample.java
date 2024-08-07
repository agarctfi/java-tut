public class StringMethodsExample {
    public static void main(String[] args) {
        stringLength();
        stringConcat();
        stringCharAt();
        stringSubstring();
        stringIndexOf();
        stringLastIndexOf();
        stringEquals();
        stringEqualsIgnoreCase();
        stringCompareTo();
        stringTrim();
        stringReplace();
        stringSplit();
        stringToUpperCase();
        stringToLowerCase();
        stringStartsWith();
        stringEndsWith();
        stringContains();
        stringIsEmpty();
        stringJoin();
    }

    // Method to demonstrate length() method
    public static void stringLength() {
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Length: " + length);
    }

    // Method to demonstrate concat() method
    public static void stringConcat() {
        String str1 = "Hello, ";
        String str2 = "World!";
        String result = str1.concat(str2);
        System.out.println("Concatenated String: " + result);
    }

    // Method to demonstrate charAt() method
    public static void stringCharAt() {
        String str = "Hello, World!";
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);
    }

    // Method to demonstrate substring() method
    public static void stringSubstring() {
        String str = "Hello, World!";
        String substr = str.substring(7, 12);
        System.out.println("Substring (7, 12): " + substr);
    }

    // Method to demonstrate indexOf() method
    public static void stringIndexOf() {
        String str = "Hello, World!";
        int index = str.indexOf('o');
        System.out.println("Index of 'o': " + index);
    }

    // Method to demonstrate lastIndexOf() method
    public static void stringLastIndexOf() {
        String str = "Hello, World!";
        int index = str.lastIndexOf('o');
        System.out.println("Last index of 'o': " + index);
    }

    // Method to demonstrate equals() method
    public static void stringEquals() {
        String str1 = "Hello";
        String str2 = "hello";
        boolean isEqual = str1.equals(str2);
        System.out.println("Equals: " + isEqual);
    }

    // Method to demonstrate equalsIgnoreCase() method
    public static void stringEqualsIgnoreCase() {
        String str1 = "Hello";
        String str2 = "hello";
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Equals Ignore Case: " + isEqualIgnoreCase);
    }

    // Method to demonstrate compareTo() method
    public static void stringCompareTo() {
        String str1 = "Hello";
        String str2 = "World";
        int comparison = str1.compareTo(str2);
        System.out.println("Compare To: " + comparison);
    }

    // Method to demonstrate trim() method
    public static void stringTrim() {
        String str = "   Hello, World!   ";
        String trimmedStr = str.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");
    }

    // Method to demonstrate replace() method
    public static void stringReplace() {
        String str = "Hello, World!";
        String replacedStr = str.replace('o', 'a');
        System.out.println("Replaced String: " + replacedStr);
    }

    // Method to demonstrate split() method
    public static void stringSplit() {
        String str = "apple,banana,cherry";
        String[] fruits = str.split(",");
        System.out.println("Split Strings:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    // Method to demonstrate toUpperCase() method
    public static void stringToUpperCase() {
        String str = "Hello, World!";
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperStr);
    }

    // Method to demonstrate toLowerCase() method
    public static void stringToLowerCase() {
        String str = "Hello, World!";
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerStr);
    }

    // Method to demonstrate startsWith() method
    public static void stringStartsWith() {
        String str = "Hello, World!";
        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith);
    }

    // Method to demonstrate endsWith() method
    public static void stringEndsWith() {
        String str = "Hello, World!";
        boolean endsWith = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWith);
    }

    // Method to demonstrate contains() method
    public static void stringContains() {
        String str = "Hello, World!";
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);
    }

    // Method to demonstrate isEmpty() method
    public static void stringIsEmpty() {
        String str = "";
        boolean isEmpty = str.isEmpty();
        System.out.println("Is Empty: " + isEmpty);
    }

    // Method to demonstrate join() method
    public static void stringJoin() {
        String result = String.join(", ", "apple", "banana", "cherry");
        System.out.println("Joined String: " + result);
    }
}
