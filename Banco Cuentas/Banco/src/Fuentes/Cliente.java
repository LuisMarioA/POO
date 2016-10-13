package Fuentes;

public class Cliente {
    private String nombre;
    private Cuenta[] cuentas;
    private int numCuentas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        cuentas=new Cuenta[2];
        numCuentas=0;
    }

    public void obtenerInfo() {
        System.out.println("Nombre: "+nombre+", Numero de Cuentas: "+numCuentas);
        for (int i = 0; i < numCuentas; i++) {
        System.out.println("Cuenta: "+(i+1)+" Saldo: "+cuentas[i].consultar());
        }
    }
    
    public Cuenta obtenerCuenta(int index){
        Cuenta cuenta = cuentas[index];
        return cuenta;
    }
    
    public void agregarCuenta(Cuenta cta){
        if(numCuentas<2){
            cuentas[numCuentas]=cta;
            numCuentas++;
        }else{
            System.out.println("Limite de cuentas alcanzado");
        }
    }
    
    public int numCuentas(){
        return numCuentas;
    }
}