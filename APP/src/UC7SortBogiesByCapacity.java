import java.util.*;

/**
 * UC7: Sort Bogies by Capacity using Comparator
 */

// Step 1: Create Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

public class UC7SortBogiesByCapacity {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("UC7: Sort Bogies by Capacity");
        System.out.println("=================================\n");

        // Step 2: Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Step 3: Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("Bogies sorted by capacity (Ascending):\n");

        for (Bogie b : bogies) {
            b.display();
        }

        // Step 4: Descending order (optional advanced)
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        System.out.println("\nBogies sorted by capacity (Descending):\n");

        for (Bogie b : bogies) {
            b.display();
        }
    }
}