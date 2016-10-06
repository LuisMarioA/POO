package Sources;

import java.util.ArrayList;

public class BookStore {
   ArrayList <Book> stock;
   public BookStore(){
       stock = new ArrayList<>();
   }
public void agreagarLibro(Book element){
    stock.add(element);
}

public void borrarLibro(Book e){
    stock.remove(e);
}

public void modificarLibro(int id,Book element){
    stock.set(id, element);
}

public void mostrarLibros(){
    stock.toString();
}

    @Override
    public String toString() {
        for (int i = 0; i < stock.size(); i++) {
            String cad="";
            Book e=stock.get(i);
            cad+=("Libro: "+e);
            
        }
        return "BookStore{" + "stock=" + stock + '}';
    }

}

