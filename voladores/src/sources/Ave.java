package sources;

import javax.swing.JOptionPane;

public class Ave extends Animal implements Volador {
    public boolean depredador;
    public String tipoAlas;
    
    @Override
    public String Despegar() {
        return "Despegando...";
    }

    @Override
    public String Volar() {
        return "volando alto";
    }

    @Override
    public String Aterrizar() {
        return "Aterrizando";
    }
    
    public int ponerHuevos(){
        return 2;
    }
    
    public void empollar(){
        JOptionPane.showMessageDialog(null, "Empollando");
    }

    @Override
    public String chocar() {
        return Volador.super.chocar(); 
    }
    
    
}