import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Library {
    private List<User> users;
    private List<String> books;

    public Library() {
        users = new ArrayList<>();
        books = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addBook(String book) {
        books.add(book);
    }

    public boolean authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void displayBooks() {
        System.out.println("Daftar Buku yang Tersedia:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}

public class SistemPepustakaan {
    public static void main(String[] args) {
        Library library = new Library();
        library.addUser(new User("user1", "password1"));
        library.addUser(new User("user2", "password2"));

        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        if (library.authenticateUser(username, password)) {
            System.out.println("Login berhasil!");
            library.displayBooks();
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }

        scanner.close();
    }
}
