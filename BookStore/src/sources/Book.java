package sources;

public class Book {
    private static int contador = 0;
    private String name;
    private String author;
    private double price;
    private int id;

    public Book(String name, String author, float precio) {
        this.name = name;
        this.author = author;
        this.price = precio;
        id = ++Book.contador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrecio() {
        return price;
    }

    public void setPrecio(double precio) {
        this.price = precio;
    }
    
    @Override
    public String toString() {
        String cadena = "Libro: " + name + "\nAutor: " + author + "\nPrecio: " + price + "\nID:" + id;
        return cadena;
    }
}