//Archivo Fecha.java
package fuentes;
import java.util.Calendar;
import javax.swing.JOptionPane;
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    public void mayorDeEdad(){
        Calendar c1 = Calendar.getInstance();
        int añoActual=c1.get(Calendar.YEAR);
        int mesActual=c1.get(Calendar.MONTH)+1;
        int diaActual=c1.get(Calendar.DATE);
        
        if(añoActual-año>18){
            JOptionPane.showMessageDialog(null, "Eres Mayor de edad");
        }else{
        if(añoActual-año==18){
            if(mes<mesActual){
               JOptionPane.showMessageDialog(null, "Eres Mayor de edad"); 
            }else{
                if(mes==mesActual){
                    if(dia<diaActual){
                       JOptionPane.showMessageDialog(null, "Eres Mayor de edad");
                    }else{
                        if(dia==diaActual){
                            JOptionPane.showMessageDialog(null, "Feliz cumpleaños! Eres Mayor de edad");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Eres Menor de edad");
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Eres Menor de edad");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Eres Menor de edad");
        }   
        }
    }
}