
package arrays;

import javax.swing.JOptionPane;

public class Arrays {
    public static void main(String[] args) {
    //EJERCICIO: El usuario ingresara 3 nombres, el programa debera mostrar solo el mas largo de los 3
        String nombre[]= new String [3];
        nombre[0] = JOptionPane.showInputDialog("Inserte un nombre");
        nombre[1] = JOptionPane.showInputDialog("Inserte un nombre");
        nombre[2] = JOptionPane.showInputDialog("Inserte un nombre");
        if (nombre[0].length()> nombre[1].length() & nombre[0].length()> nombre[2].length()) {
            System.out.println("nombre="+nombre[0]);   
        }
        if (nombre[1].length()> nombre[0].length() & nombre[1].length()> nombre[2].length()) {
            System.out.println("nombre="+nombre[1]);   
        }
        if (nombre[2].length()> nombre[1].length() & nombre[2].length()> nombre[0].length()) {
            System.out.println("nombre="+nombre[2]);   
        }
    }  
}

/*EJERCICIO: Arreglos con tipo de Dato Byte
    byte niveles[]=new byte [10];
    byte niveles[]= new byte []{1};
    byte niveles[]={1,2,3};
    for (int i = 0; i < niveles.length; i++) {
        System.out.println("niveles="+niveles [i]);
    }
    byte niveles2[]=niveles.clone();
    for (int i = 0; i < niveles2.length; i++) {
        System.out.println("niveles2="+niveles2[i]);
    }
*/