package Bai6;

public class Book {
    private String title;
    private String author;
    private int quantity;
    private int year;

    public Book(String title, String author, int quantity, int year) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}