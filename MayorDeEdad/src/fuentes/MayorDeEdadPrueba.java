package fuentes;
import javax.swing.JOptionPane;

/**
 * @author Luis
 */
public class MayorDeEdadPrueba {
    public static void main(String[] args) {
    String fecha = JOptionPane.showInputDialog("¿Cual es tu fecha de nacimiento?\n(DD/MM/AAAA)\n Ejemplo==>(15/07/1997)");;
    String[] partes = fecha.split("/");
    int dia =Integer.parseInt(partes[0]);
    int mes =Integer.parseInt(partes[1]);
    int año =Integer.parseInt(partes[2]);
         Fecha f1=new Fecha(dia,mes,año);
         f1.mayorDeEdad();
    } 
}
