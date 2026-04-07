import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize Train and Display Consist Summary
 */

public class UC1TrainInitialization {

    public static void main(String[] args) {

        // Step 1: Welcome message
        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("=================================\n");

        // Step 2: Initialize train consist (empty list)
        List<String> trainConsist = new ArrayList<>();

        // Step 3: Display initial state
        System.out.println("Train initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        System.out.println("\nTrain consist is currently empty.");
    }
}