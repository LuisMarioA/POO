
package sources;

public interface Volador {
   public final double GRAVEDAD = 9.81;
    public String Despegar();
    public String Volar();
    public String Aterrizar();
    default String chocar(){
        return "Oops chocó!";
    }
   default void recuperar(){
        System.out.println("Despegando de Nuevo!");
    }
}