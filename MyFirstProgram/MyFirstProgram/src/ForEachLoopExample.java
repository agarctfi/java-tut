import java.util.ArrayList;

public class ForEachLoopExample {
    public static void main(String[] args) {
        forEachWithArray();
        forEachWithArrayList();
        forEachWith2DArray();
        forEachWithArrayListOfObjects();
    }

    // Example of using for-each loop with an array
    public static void forEachWithArray() {
        System.out.println("For-Each Loop with Array Example:");

        // Creating and initializing an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Iterating over the array using for-each loop
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        System.out.println(); // Print a new line for better readability
    }

    // Example of using for-each loop with an ArrayList
    public static void forEachWithArrayList() {
        System.out.println("For-Each Loop with ArrayList Example:");

        // Creating and initializing an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Iterating over the ArrayList using for-each loop
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        System.out.println(); // Print a new line for better readability
    }

    // Example of using for-each loop with a 2D array
    public static void forEachWith2DArray() {
        System.out.println("For-Each Loop with 2D Array Example:");

        // Creating and initializing a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Iterating over the 2D array using nested for-each loops
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // New line after each row
        }
        System.out.println(); // Print a new line for better readability
    }

    // Example of using for-each loop with an ArrayList of objects
    public static void forEachWithArrayListOfObjects() {
        System.out.println("For-Each Loop with ArrayList of Objects Example:");

        // Creating a class to represent a simple object
        class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return name + " (Age: " + age + ")";
            }
        }

        // Creating and initializing an ArrayList of Person objects
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Iterating over the ArrayList of objects using for-each loop
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println(); // Print a new line for better readability
    }
}
