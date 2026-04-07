import java.util.HashSet;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs using HashSet
 */

public class UC3UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("UC3: Unique Bogie ID Tracking");
        System.out.println("=================================\n");

        // Step 1: Create HashSet
        Set<String> bogieIDs = new HashSet<>();

        // Step 2: Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        System.out.println("Bogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIDs);

        // Step 3: Show size
        System.out.println("\nTotal Unique Bogies: " + bogieIDs.size());
    }
}