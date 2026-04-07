import java.util.*;
import java.util.stream.Collectors;

/**
 * UC8: Filter Bogies using Stream API
 */

// Reuse Bogie class from UC7
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

public class UC8FilterBogiesStream {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("UC8: Filter Bogies using Streams");
        System.out.println("=================================\n");

        // Step 1: Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Luxury AC", 80));

        // Step 2: Apply Stream filter (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):\n");

        for (Bogie b : filteredBogies) {
            b.display();
        }

        // Step 4: Show original list unchanged
        System.out.println("\nOriginal Bogie List (Unchanged):\n");

        for (Bogie b : bogies) {
            b.display();
        }
    }
}