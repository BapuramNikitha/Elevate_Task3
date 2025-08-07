import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Add sample data
        library.addBook(new Book("Java Basics", "James Gosling"));
        library.addBook(new Book("OOP Concepts", "Robert Lafore"));
        library.addBook(new Book("Data Structures", "Mark Allen Weiss"));

        library.addUser(new User(1, "Alice"));
        library.addUser(new User(2, "Bob"));

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Show Books");
            System.out.println("2. Show Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    library.showUsers();
                    break;
                case 3:
                    System.out.print("Enter book title to issue: ");
                    String titleToIssue = scanner.nextLine();
                    if (library.issueBook(titleToIssue)) {
                        System.out.println("Book issued successfully!");
                    } else {
                        System.out.println("Book is not available.");
                    }
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String titleToReturn = scanner.nextLine();
                    if (library.returnBook(titleToReturn)) {
                        System.out.println("Book returned successfully!");
                    } else {
                        System.out.println("Return failed. Book was not issued.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
