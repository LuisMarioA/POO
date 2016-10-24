package sources;

public class El_Santo extends Luchador implements Volador {

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
    
    public int matarVampiros(){
        return  (int) Math.round(Math.random())%10;
    }
    
    public int matarMomiasGto(){
        return  (int) Math.round(Math.random())%10;
    }
}