package Bai6;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooksByYear(int year) {
        System.out.println("Books published in " + year + ":");
        for (Book book : books) {
            if (book.getYear() == year) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + ", " + book.getQuantity() + " copies");
            }
        }
    }
}