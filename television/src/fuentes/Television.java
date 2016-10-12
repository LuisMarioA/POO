package fuentes;

public class Television {
    private boolean prendida;
    private int canal;
    private int volumen;
    private int canalesValidos[];
    private int indiceCanales;

    public Television() {
        prendida=true;
        canal=2;
        volumen=20;
        canalesValidos = new int[] {2,5,7,9,11,13};
        indiceCanales=0;
    }

    @Override
    public String toString() {
        String cad="";
       cad="Television{" + "prendida=" + prendida + ", canal=" + canal + ", volumen=" + volumen + ", indiceCanales=" + indiceCanales + '}';
        return cad;
    }
    public void subirVolumen(){
    if(volumen<100)
        volumen+=10;
    }
    
    public void bajarVolumen(){
    if(volumen>0)
        volumen-=10;
    }
    
    public void subirCanal(){
        if(indiceCanales<canalesValidos.length-1){
        canal = canalesValidos[++indiceCanales];
        }
        else{
            indiceCanales=0;    
            canal=canalesValidos[indiceCanales];  
        }
    }
    
    public void bajarCanal(){
        if(indiceCanales>0){
            canal=canalesValidos[--indiceCanales];
        }
        else{
            indiceCanales=canalesValidos.length-1;
            canal=canalesValidos[indiceCanales];
        }
    }
    
    public void irCanal(int canal){
        for (int i = 0; i < canalesValidos.length; i++) {
            if(canal==canalesValidos[i]){
                indiceCanales = i;
                this.canal = canal;
            }
        }
    }
}
