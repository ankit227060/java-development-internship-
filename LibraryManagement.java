import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
    static ArrayList<String> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        books.add("The Great Gatsby");
        books.add("1984");
        books.add("To Kill a Mockingbird");

        System.out.println("Library Management System");

        while (true) {
            System.out.println("\n1. View Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Available Books:");
                    for (String book : books) {
                        System.out.println("- " + book);
                    }
                    break;
                case 2:
                    System.out.print("Enter the book name to borrow: ");
                    String bookToBorrow = scanner.nextLine();
                    if (books.remove(bookToBorrow)) {
                        System.out.println("You borrowed: " + bookToBorrow);
                    } else {
                        System.out.println("Book not available.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the book name to return: ");
                    String bookToReturn = scanner.nextLine();
                    books.add(bookToReturn);
                    System.out.println("You returned: " + bookToReturn);
                    break;
                case 4:
                    System.out.println("Exiting the library system.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}