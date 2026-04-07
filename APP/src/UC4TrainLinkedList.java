import java.util.LinkedList;

/**
 * UC4: Maintain Ordered Bogie IDs using LinkedList
 */

public class UC4TrainLinkedList {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("UC4: Ordered Train Using LinkedList");
        System.out.println("=================================\n");

        // Step 1: Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // Step 2: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Step 3: Insert Pantry at position 2
        train.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry at position 2:");
        System.out.println(train);

        // Step 4: Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogies:");
        System.out.println(train);

        // Final output
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}