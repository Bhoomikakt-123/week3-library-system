package library;

import java.time.LocalDate;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean available;
    private LocalDate dueDate;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = true;
        this.dueDate = null;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return available; }
    public LocalDate getDueDate() { return dueDate; }

    public void borrowBook() {
        available = false;
        dueDate = LocalDate.now().plusDays(14);
    }

    public void returnBook() {
        available = true;
        dueDate = null;
    }

    @Override
    public String toString() {
        return isbn + "," + title + "," + author + "," + available;
    }

    public static Book fromString(String line) {
        String[] parts = line.split(",");
        Book book = new Book(parts[0], parts[1], parts[2]);
        book.available = Boolean.parseBoolean(parts[3]);
        return book;
    }
}