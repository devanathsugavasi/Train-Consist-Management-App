import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UC5: Preserve Insertion Order with LinkedHashSet
 */

public class UC5LinkedHashSetTrain {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("UC5: Ordered + Unique Train Formation");
        System.out.println("=================================\n");

        // Step 1: Create LinkedHashSet
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 3: Attempt duplicate
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // Step 4: Display formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);

        // Step 5: Show count
        System.out.println("\nTotal Bogies: " + trainFormation.size());
    }
}