public class CharacterClassMethodsExample {
    public static void main(String[] args) {
        charValueMethod();
        isLetterMethod();
        isDigitMethod();
        isWhitespaceMethod();
        isUpperCaseMethod();
        isLowerCaseMethod();
        toUpperCaseMethod();
        toLowerCaseMethod();
        toStringMethod();
    }

    // Demonstrates the charValue() method
    public static void charValueMethod() {
        System.out.println("charValue() Method Example:");

        Character charObj = Character.valueOf('a');
        char charPrimitive = charObj.charValue(); // Converts Character object to primitive char

        System.out.println("Character object: " + charObj);
        System.out.println("Primitive char: " + charPrimitive);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the isLetter() method
    public static void isLetterMethod() {
        System.out.println("isLetter() Method Example:");

        char ch1 = 'a';
        char ch2 = '1';

        boolean isLetter1 = Character.isLetter(ch1); // Checks if the character is a letter
        boolean isLetter2 = Character.isLetter(ch2); // Checks if the character is a letter

        System.out.println("Is 'a' a letter: " + isLetter1);
        System.out.println("Is '1' a letter: " + isLetter2);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the isDigit() method
    public static void isDigitMethod() {
        System.out.println("isDigit() Method Example:");

        char ch1 = 'a';
        char ch2 = '1';

        boolean isDigit1 = Character.isDigit(ch1); // Checks if the character is a digit
        boolean isDigit2 = Character.isDigit(ch2); // Checks if the character is a digit

        System.out.println("Is 'a' a digit: " + isDigit1);
        System.out.println("Is '1' a digit: " + isDigit2);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the isWhitespace() method
    public static void isWhitespaceMethod() {
        System.out.println("isWhitespace() Method Example:");

        char ch1 = ' ';
        char ch2 = 'a';

        boolean isWhitespace1 = Character.isWhitespace(ch1); // Checks if the character is whitespace
        boolean isWhitespace2 = Character.isWhitespace(ch2); // Checks if the character is whitespace

        System.out.println("Is ' ' a whitespace: " + isWhitespace1);
        System.out.println("Is 'a' a whitespace: " + isWhitespace2);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the isUpperCase() method
    public static void isUpperCaseMethod() {
        System.out.println("isUpperCase() Method Example:");

        char ch1 = 'A';
        char ch2 = 'a';

        boolean isUpperCase1 = Character.isUpperCase(ch1); // Checks if the character is uppercase
        boolean isUpperCase2 = Character.isUpperCase(ch2); // Checks if the character is uppercase

        System.out.println("Is 'A' uppercase: " + isUpperCase1);
        System.out.println("Is 'a' uppercase: " + isUpperCase2);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the isLowerCase() method
    public static void isLowerCaseMethod() {
        System.out.println("isLowerCase() Method Example:");

        char ch1 = 'A';
        char ch2 = 'a';

        boolean isLowerCase1 = Character.isLowerCase(ch1); // Checks if the character is lowercase
        boolean isLowerCase2 = Character.isLowerCase(ch2); // Checks if the character is lowercase

        System.out.println("Is 'A' lowercase: " + isLowerCase1);
        System.out.println("Is 'a' lowercase: " + isLowerCase2);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the toUpperCase() method
    public static void toUpperCaseMethod() {
        System.out.println("toUpperCase() Method Example:");

        char ch = 'a';
        char upperCh = Character.toUpperCase(ch); // Converts character to uppercase

        System.out.println("Uppercase of 'a': " + upperCh);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the toLowerCase() method
    public static void toLowerCaseMethod() {
        System.out.println("toLowerCase() Method Example:");

        char ch = 'A';
        char lowerCh = Character.toLowerCase(ch); // Converts character to lowercase

        System.out.println("Lowercase of 'A': " + lowerCh);
        System.out.println(); // Print a new line for better readability
    }

    // Demonstrates the toString() method
    public static void toStringMethod() {
        System.out.println("toString() Method Example:");

        Character charObj = Character.valueOf('a');
        String charString = charObj.toString(); // Converts Character object to String

        System.out.println("Character object: " + charObj);
        System.out.println("String representation: " + charString);
        System.out.println(); // Print a new line for better readability
    }
}
