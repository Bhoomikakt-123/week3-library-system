package library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private FileHandler fileHandler;

    public Library() {
        fileHandler = new FileHandler();
        books = fileHandler.loadBooks();
        members = fileHandler.loadMembers();
    }

    public void addBook(Book book) {
        books.add(book);
        fileHandler.saveBooks(books);
        System.out.println("Book added successfully.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book.getIsbn() + " | " + book.getTitle() + " | " + book.getAuthor() +
                    (book.isAvailable() ? " | Available" : " | Borrowed"));
        }
    }

    public void registerMember(Member member) {
        members.add(member);
        fileHandler.saveMembers(members);
        System.out.println("Member registered successfully.");
    }

    public Book findBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) return book;
        }
        return null;
    }

    public void borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null && book.isAvailable()) {
            book.borrowBook();
            fileHandler.saveBooks(books);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }

    public void returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null && !book.isAvailable()) {
            book.returnBook();
            fileHandler.saveBooks(books);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Invalid return.");
        }
    }
}