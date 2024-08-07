public class ArrayExamples {
    public static void main(String[] args) {
        // Call methods to demonstrate various array examples
        basicArrayExample();
        arrayInitializationExample();
        arrayIterationExample();
        multiDimensionalArrayExample();
        arrayMethodsExample();
    }

    // Basic array example
    public static void basicArrayExample() {
        System.out.println("Basic Array Example:");

        // Declare and initialize an array of integers
        int[] numbers = new int[5];

        // Assign values to the array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Access and print array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        System.out.println(); // Print a new line for better readability
    }

    // Array initialization example
    public static void arrayInitializationExample() {
        System.out.println("Array Initialization Example:");

        // Declare and initialize an array using an array literal
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        // Access and print array elements
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit at index " + i + ": " + fruits[i]);
        }

        System.out.println(); // Print a new line for better readability
    }

    // Array iteration example
    public static void arrayIterationExample() {
        System.out.println("Array Iteration Example:");

        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Iterate over the array using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Iterate over the array using an enhanced for loop (for-each loop)
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        System.out.println(); // Print a new line for better readability
    }

    // Multi-dimensional array example
    public static void multiDimensionalArrayExample() {
        System.out.println("Multi-Dimensional Array Example:");

        // Declare and initialize a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access and print elements of the 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        System.out.println(); // Print a new line for better readability
    }

    // Array methods example
    public static void arrayMethodsExample() {
        System.out.println("Array Methods Example:");

        // Declare and initialize an array of integers
        int[] numbers = {5, 3, 8, 1, 2};

        // Sort the array
        java.util.Arrays.sort(numbers);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Search for an element in the array
        int key = 3;
        int index = java.util.Arrays.binarySearch(numbers, key);
        System.out.println("Index of " + key + ": " + index);

        System.out.println(); // Print a new line for better readability
    }
}
