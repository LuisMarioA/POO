
package sources;

import java.util.ArrayList;

public class BookStore {
    private ArrayList<Book> stock;
    
    public BookStore() {
        stock = new ArrayList<>();
    }
    
    public void addBook(Book book){
        stock.add(book);
    }
    
    public void removeBook(int index) {
        stock.remove(index);
    }
    
    public void modifyBook(int index, String name, String author, float precio) {
        Book book=new Book(name,author,precio);
        book.setId(index--);
        stock.set(index,book);
    }
    
    public void showBooks() {
        for(Book book : stock) {
            System.out.println(book);
            System.out.print("\n");
        }
    }
    
}
