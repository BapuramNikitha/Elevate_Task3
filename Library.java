import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void showBooks() {
        System.out.println("\nBook List:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void showUsers() {
        System.out.println("\nUser List:");
        for (User user : users) {
            System.out.println(user);
        }
    }

    public boolean issueBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.issueBook();
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.returnBook();
                return true;
            }
        }
        return false;
    }
}
