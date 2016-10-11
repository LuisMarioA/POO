package test;
import sources.Book;
import sources.BookStore;

public class TestBookStore {
    public static void main(String[] args) {
        Book libro1 = new Book("Libro1", "Autor1", 100);
        Book libro2 = new Book("Libro2", "Autor2", 200);
        Book libro3 = new Book("Libro3", "Autor3", 300);
        BookStore bookstore = new BookStore();
        bookstore.addBook(libro1);
        bookstore.addBook(libro2);
        bookstore.addBook(libro3);
        bookstore.showBooks();
        bookstore.modifyBook(1, "Libro4",300.5,"Autor4");
        bookstore.showBooks();
        bookstore.removeBook(1);
        bookstore.showBooks(); 
    }
}