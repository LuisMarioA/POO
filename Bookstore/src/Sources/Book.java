
package Sources;

public class Book {
    private int id;
    private String titulo;
    private String autor;
    private float precio;
    private static int contador=0;

    public Book(String titulo, String autor, float precio) {
        this.id=contador++;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + '}';
    }
    
    
}
