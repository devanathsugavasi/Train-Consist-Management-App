import java.util.ArrayList;
import java.util.List;

/**
 * UC2: Add Passenger Bogies using ArrayList
 */

public class UC2AddPassengerBogies {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Train Consist Management App");
        System.out.println("UC2: Passenger Bogie Operations");
        System.out.println("=================================\n");

        // Step 1: Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Bogies after addition:");
        System.out.println(passengerBogies);

        // Step 3: Remove a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // Step 4: Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie NOT found.");
        }

        // Step 5: Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}