package TryingOut;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Book {
    private final String title;
    private final String author;
    private final String ISBN;
    private boolean isBorrowed;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = false;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(StringTemplate.STR."The book \"\{title}\" has been borrowed.");
        } else {
            System.out.println(StringTemplate.STR."The book \"\{title}\" is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(StringTemplate.STR."The book \"\{title}\" has been returned.");
        } else {
            System.out.println(StringTemplate.STR."The book \"\{title}\" was not borrowed.");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice = displayMenuAndGetChoice(scanner);

            switch (choice) {
                case 1 -> addBook(books, scanner);
                case 2 -> displayBooks(books);
                case 3 -> borrowBook(books, scanner);
                case 4 -> returnBook(books, scanner);
                case 5 -> {
                    System.out.println("Exiting the program...");
                    return;
                }
                default -> System.out.println("Select a valid number.");
            }
        }
    }

    private static int displayMenuAndGetChoice(Scanner scanner) {
        int choice;
        while (true) {
            try {
                System.out.println("Library Menu:");
                System.out.println("[1] Add Book");
                System.out.println("[2] Display Books");
                System.out.println("[3] Borrow Book");
                System.out.println("[4] Return Book");
                System.out.println("[5] Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice < 1 || choice > 5) {
                    System.out.println("Please select a valid number between 1 and 5.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
        return choice;
    }

    private static void addBook(List<Book> books, Scanner scanner) {
        System.out.print("Enter the title: ");
        String title = scanner.nextLine();
        System.out.print("Enter the author: ");
        String author = scanner.nextLine();
        System.out.print("Enter the ISBN: ");
        String ISBN = scanner.nextLine();

        if (!title.isEmpty() && !author.isEmpty() && !ISBN.isEmpty()) {
            books.add(new Book(title, author, ISBN));
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Error: All fields must be filled.");
        }
    }

    private static void displayBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("There are no books in the Library.");
        } else {
            for (Book book : books) {
                String status = book.isBorrowed() ? "Borrowed" : "Available";
                System.out.println(StringTemplate.STR."Title: \{book.getTitle()}, Author: \{book.getAuthor()}, ISBN: \{book.getISBN()}, Status: \{status}");
            }
        }
    }

    private static void borrowBook(List<Book> books, Scanner scanner) {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        displayAvailableBooks(books);

        System.out.print("Enter the title of the book to borrow (or press Enter to cancel): ");
        String title = scanner.nextLine().trim();
        if (title.isEmpty()) {
            System.out.println("Borrowing cancelled.");
            return;
        }

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isBorrowed()) {
                    book.borrowBook();
                } else {
                    System.out.println(StringTemplate.STR."Sorry, \"\{book.getTitle()}\" is already borrowed.");
                }
                return;
            }
        }

        System.out.println("Book not found. Please check the title and try again.");
    }

    private static void returnBook(List<Book> books, Scanner scanner) {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("Borrowed books:");
        boolean hasBorrowedBooks = false;
        for (Book book : books) {
            if (book.isBorrowed()) {
                System.out.println(StringTemplate.STR."- \{book.getTitle()} by \{book.getAuthor()}");
                hasBorrowedBooks = true;
            }
        }

        if (!hasBorrowedBooks) {
            System.out.println("No books are currently borrowed.");
            return;
        }

        System.out.print("Enter the title of the book to return (or press Enter to cancel): ");
        String title = scanner.nextLine().trim();
        if (title.isEmpty()) {
            System.out.println("Return cancelled.");
            return;
        }

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }

        System.out.println("Book not found. Please check the title and try again.");
    }

    private static void displayAvailableBooks(List<Book> books) {
        System.out.println("Available books:");
        boolean hasAvailableBooks = false;
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(StringTemplate.STR."- \{book.getTitle()} by \{book.getAuthor()}");
                hasAvailableBooks = true;
            }
        }

        if (!hasAvailableBooks) {
            System.out.println("No books are currently available.");
        }
    }
}
