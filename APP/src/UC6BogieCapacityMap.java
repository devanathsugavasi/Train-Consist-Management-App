import java.util.HashMap;
import java.util.Map;

/**
 * UC6: Map Bogie to Capacity using HashMap
 */

public class UC6BogieCapacityMap {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("UC6: Bogie Capacity Mapping");
        System.out.println("=================================\n");

        // Step 1: Create HashMap
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Step 2: Add bogie-capacity pairs
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);
        bogieCapacity.put("Cargo", 100);

        // Step 3: Display mapping
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey()
                    + " | Capacity: " + entry.getValue());
        }
    }
}