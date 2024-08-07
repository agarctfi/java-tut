import java.util.ArrayList;

public class TwoDArrayListExample {
    public static void main(String[] args) {
        create2DArrayList();
        addElementsTo2DArrayList();
        accessElementsIn2DArrayList();
        iterate2DArrayList();
        modifyElementsIn2DArrayList();
        removeElementsFrom2DArrayList();
    }

    // Example of creating a 2D ArrayList
    public static void create2DArrayList() {
        System.out.println("Create 2D ArrayList Example:");

        // Creating a 2D ArrayList
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();

        // Adding new rows to the 2D ArrayList
        twoDList.add(new ArrayList<Integer>());
        twoDList.add(new ArrayList<Integer>());
        twoDList.add(new ArrayList<Integer>());

        // Printing the empty 2D ArrayList
        System.out.println("Empty 2D ArrayList: " + twoDList);
        System.out.println(); // Print a new line for better readability
    }

    // Example of adding elements to a 2D ArrayList
    public static void addElementsTo2DArrayList() {
        System.out.println("Add Elements to 2D ArrayList Example:");

        // Creating and initializing a 2D ArrayList
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();
        twoDList.add(new ArrayList<Integer>());
        twoDList.add(new ArrayList<Integer>());
        twoDList.add(new ArrayList<Integer>());

        // Adding elements to each row
        twoDList.get(0).add(1);
        twoDList.get(0).add(2);
        twoDList.get(1).add(3);
        twoDList.get(1).add(4);
        twoDList.get(2).add(5);
        twoDList.get(2).add(6);

        // Printing the 2D ArrayList with elements
        System.out.println("2D ArrayList with elements: " + twoDList);
        System.out.println(); // Print a new line for better readability
    }

    // Example of accessing elements in a 2D ArrayList
    public static void accessElementsIn2DArrayList() {
        System.out.println("Access Elements in 2D ArrayList Example:");

        // Creating and initializing a 2D ArrayList
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();
        twoDList.add(new ArrayList<Integer>());
        twoDList.add(new ArrayList<Integer>());
        twoDList.add(new ArrayList<Integer>());
        twoDList.get(0).add(1);
        twoDList.get(0).add(2);
        twoDList.get(1).add(3);
        twoDList.get(1).add(4);
        twoDList.get(2).add(5);
        twoDList.get(2).add(6);

        // Accessing elements in the 2D ArrayList
        int element1 = twoDList.get(0).get(1);
        int element2 = twoDList.get(1).get(0);
        int element3 = twoDList.get(2).get(1);

        // Printing accessed elements
        System.out.println("Element at (0,1): " + element1);
        System.out.println("Element at (1,0): " + element2);
        System.out.println("Element at (2,1): " + element3);
        System.out.println(); // Print a new line for better readability
    }

    // Example of iterating through a 2D ArrayList
    public static void iterate2DArrayList() {
        System.out.println("Iterate 2D ArrayList Example:");

        // Creating and initializing a 2D ArrayList
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();
        twoDList.add(new ArrayList<Integer>());
        twoDList.add(new ArrayList<Integer>());
        twoDList.add(new ArrayList<Integer>());
        twoDList.get(0).add(1);
        twoDList.get(0).add(2);
        twoDList.get(1).add(3);
        twoDList.get(1).add(4);
        twoDList.get(2).add(5);
        twoDList.get(2).add(6);

        // Iterating through the 2D ArrayList
        for (int i = 0; i < twoDList.size(); i++) {
            for (int j = 0; j < twoDList.get(i).size(); j++) {
                System.out.print(twoDList.get(i).get(j) + " ");
            }
            System.out.println(); // New line after each row
        }
        System.out.println(); // Print a new line for better readability
    }

    // Example of modifying elements in a 2D ArrayList
    public static void modifyElementsIn2DArrayList() {
        System.out.println("Modify Elements in 2D ArrayList Example:");

        // Creating and initializing a 2D ArrayList
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();
        twoDList.add(new ArrayList<Integer>());
        twoDList.add(new ArrayList<Integer>());
        twoDList.add(new ArrayList<Integer>());
        twoDList.get(0).add(1);
        twoDList.get(0).add(2);
        twoDList.get(1).add(3);
        twoDList.get(1).add(4);
        twoDList.get(2).add(5);
        twoDList.get(2).add(6);

        // Modifying elements in the 2D ArrayList
        twoDList.get(0).set(1, 20);
        twoDList.get(1).set(0, 30);
        twoDList.get(2).set(1, 60);

        // Printing the modified 2D ArrayList
        System.out.println("Modified 2D ArrayList: " + twoDList);
        System.out.println(); // Print a new line for better readability
    }

    // Example of removing elements from a 2D ArrayList
    public static void removeElementsFrom2DArrayList() {
        System.out.println("Remove Elements from 2D ArrayList Example:");

        // Creating and initializing a 2D ArrayList
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();
        twoDList.add(new ArrayList<Integer>());
        twoDList.add(new ArrayList<Integer>());
        twoDList.add(new ArrayList<Integer>());
        twoDList.get(0).add(1);
        twoDList.get(0).add(2);
        twoDList.get(1).add(3);
        twoDList.get(1).add(4);
        twoDList.get(2).add(5);
        twoDList.get(2).add(6);

        // Removing elements from the 2D ArrayList
        twoDList.get(0).remove(1);
        twoDList.get(1).remove(0);

        // Printing the 2D ArrayList after removal
        System.out.println("2D ArrayList after removal: " + twoDList);
        System.out.println(); // Print a new line for better readability
    }
}
