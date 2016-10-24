package sources;

import javax.swing.JOptionPane;

public class Animal{
    public String especie;
    
    public void nacer(){
        JOptionPane.showMessageDialog(null, "Esta especie ha nacido");
    }
    
    public void crecer(){
        JOptionPane.showMessageDialog(null, "Este animal de la especie " + especie + " ha crecido");
    }
    
    public void procrear(){
        JOptionPane.showMessageDialog(null,"dos animales de la especie " +especie +" estan procreando");
    }
    
    public void morir(){
        JOptionPane.showMessageDialog(null, "muerto");
    }
}