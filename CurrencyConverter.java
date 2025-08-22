import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("------------------");

        double usdToInr = 83.0;
        double usdToEur = 0.91;

        System.out.println("1. USD to INR");
        System.out.println("2. USD to EUR");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        if (choice == 3) {
            System.out.println("Exiting the converter.");
            return;
        }

        System.out.print("Enter amount in USD: ");
        double amount = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Converted Amount: " + (amount * usdToInr) + " INR");
                break;
            case 2:
                System.out.println("Converted Amount: " + (amount * usdToEur) + " EUR");
                break;
            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }
}