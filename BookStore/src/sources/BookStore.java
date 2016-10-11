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
        index-=1;
        stock.remove(index);
    }
    
    public void modifyBook(int index, String nom, double prix,String autor) {
        index-=1;
        stock.get(index).setName(nom);
        stock.get(index).setPrecio(prix);
        stock.get(index).setAuthor(autor);
    }
    
    public void showBooks() {
        for(Book book : stock) {
            System.out.println(book);
            System.out.print("\n");
        }
    }   
}