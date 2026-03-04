package library;

import java.util.ArrayList;

public class Member {
    private String id;
    private String name;
    private ArrayList<String> borrowedBooks;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getName() { return name; }

    public void borrowBook(String isbn) {
        borrowedBooks.add(isbn);
    }

    public void returnBook(String isbn) {
        borrowedBooks.remove(isbn);
    }

    @Override
    public String toString() {
        return id + "," + name;
    }

    public static Member fromString(String line) {
        String[] parts = line.split(",");
        return new Member(parts[0], parts[1]);
    }
}