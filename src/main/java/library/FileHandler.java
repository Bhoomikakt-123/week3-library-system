package library;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    public ArrayList<Book> loadBooks() {
        ArrayList<Book> books = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data/books.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                books.add(Book.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading books.");
        }
        return books;
    }

    public void saveBooks(ArrayList<Book> books) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("data/books.txt"))) {
            for (Book book : books) {
                pw.println(book);
            }
        } catch (IOException e) {
            System.out.println("Error saving books.");
        }
    }

    public ArrayList<Member> loadMembers() {
        ArrayList<Member> members = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data/members.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                members.add(Member.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading members.");
        }
        return members;
    }

    public void saveMembers(ArrayList<Member> members) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("data/members.txt"))) {
            for (Member member : members) {
                pw.println(member);
            }
        } catch (IOException e) {
            System.out.println("Error saving members.");
        }
    }
}