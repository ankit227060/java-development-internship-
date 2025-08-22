import java.util.HashMap;
import java.util.Scanner;

public class FlightBookingSystem {
    public static void main(String[] args) {
        HashMap<Integer, String> flights = new HashMap<>();
        flights.put(1, "Flight A - NYC to London");
        flights.put(2, "Flight B - Mumbai to Tokyo");
        flights.put(3, "Flight C - Sydney to Paris");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Flights:");
        for (int key : flights.keySet()) {
            System.out.println(key + ". " + flights.get(key));
        }

        System.out.print("Select a flight (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (flights.containsKey(choice)) {
            System.out.print("Enter passenger name: ");
            String passenger = scanner.nextLine();
            System.out.println("Booking confirmed for " + passenger + " on " + flights.get(choice));
        } else {
            System.out.println("Invalid selection.");
        }

        scanner.close();
    }
}