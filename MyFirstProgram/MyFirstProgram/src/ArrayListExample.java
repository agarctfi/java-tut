import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        addElements();
        accessElements();
        iterateElements();
        modifyElements();
        removeElements();
        arrayListSize();
        containsElement();
        arrayListClear();
    }

    // Example of adding elements to an ArrayList
    public static void addElements() {
        System.out.println("Add Elements Example:");

        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Printing the ArrayList
        System.out.println("ArrayList: " + list);
        System.out.println(); // Print a new line for better readability
    }

    // Example of accessing elements from an ArrayList
    public static void accessElements() {
        System.out.println("Access Elements Example:");

        // Creating and initializing an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements from the ArrayList
        String firstElement = list.get(0);
        String secondElement = list.get(1);

        // Printing accessed elements
        System.out.println("First Element: " + firstElement);
        System.out.println("Second Element: " + secondElement);
        System.out.println(); // Print a new line for better readability
    }

    // Example of iterating through an ArrayList
    public static void iterateElements() {
        System.out.println("Iterate Elements Example:");

        // Creating and initializing an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Iterating through the ArrayList using a for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Iterating through the ArrayList using a for-each loop
        System.out.println("Using for-each loop:");
        for (String element : list) {
            System.out.println(element);
        }

        System.out.println(); // Print a new line for better readability
    }

    // Example of modifying elements in an ArrayList
    public static void modifyElements() {
        System.out.println("Modify Elements Example:");

        // Creating and initializing an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Modifying elements in the ArrayList
        list.set(1, "Blueberry");

        // Printing the modified ArrayList
        System.out.println("Modified ArrayList: " + list);
        System.out.println(); // Print a new line for better readability
    }

    // Example of removing elements from an ArrayList
    public static void removeElements() {
        System.out.println("Remove Elements Example:");

        // Creating and initializing an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Removing elements from the ArrayList
        list.remove("Banana");
        list.remove(0);

        // Printing the ArrayList after removal
        System.out.println("ArrayList after removal: " + list);
        System.out.println(); // Print a new line for better readability
    }

    // Example of getting the size of an ArrayList
    public static void arrayListSize() {
        System.out.println("ArrayList Size Example:");

        // Creating and initializing an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Getting the size of the ArrayList
        int size = list.size();

        // Printing the size
        System.out.println("Size of ArrayList: " + size);
        System.out.println(); // Print a new line for better readability
    }

    // Example of checking if an element exists in an ArrayList
    public static void containsElement() {
        System.out.println("Contains Element Example:");

        // Creating and initializing an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Checking if the ArrayList contains specific elements
        boolean containsApple = list.contains("Apple");
        boolean containsGrapes = list.contains("Grapes");

        // Printing the results
        System.out.println("ArrayList contains 'Apple': " + containsApple);
        System.out.println("ArrayList contains 'Grapes': " + containsGrapes);
        System.out.println(); // Print a new line for better readability
    }

    // Example of clearing all elements from an ArrayList
    public static void arrayListClear() {
        System.out.println("ArrayList Clear Example:");

        // Creating and initializing an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Clearing all elements from the ArrayList
        list.clear();

        // Printing the ArrayList after clearing
        System.out.println("ArrayList after clearing: " + list);
        System.out.println(); // Print a new line for better readability
    }
}
