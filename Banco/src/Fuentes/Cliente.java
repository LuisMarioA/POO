package Fuentes;

import java.util.Random;

public class Cliente {
    private String nombre;
    private Cuenta cuenta;
    private String numCuenta;

    public Cliente(String nombre) {
        this.nombre = nombre;
        numCuenta=""+Math.abs(new Random().nextInt());
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Cuenta obtenerCuenta() {
        return cuenta;
    }

    public String obtenerNumCuenta() {
        return numCuenta;
    }

    public void establecerCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }   

    public void establecerNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    
}
