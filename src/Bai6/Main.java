package Bai6;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Java Programming", "John Doe", 5, 2020);
        Book book2 = new Book("Python Programming", "Jane Smith", 3, 2020);
        Book book3 = new Book("C++ Programming", "Joe Bloggs", 2, 2019);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooksByYear(2020);
    }

}
