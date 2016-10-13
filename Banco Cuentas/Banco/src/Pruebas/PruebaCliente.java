package Pruebas;

import Fuentes.Cliente;
import Fuentes.Cuenta;
import Fuentes.CuentaDeAhorros;
import Fuentes.CuentaDeCheques;

public class PruebaCliente {
    public static void main(String[] args) {
        Cliente c1=new Cliente("Pedro1");
        Cliente c2=new Cliente("Pedro2");
        Cuenta cta1=new Cuenta(50000);
        Cuenta cta2=new CuentaDeCheques(60000);
        Cuenta cta3=new CuentaDeAhorros(70000,0.10);
        c1.agregarCuenta(cta1);
        c1.agregarCuenta(cta3);
        c2.agregarCuenta(cta2);
        c1.obtenerCuenta(0).retirar(50000);
        c1.obtenerInfo();
        c2.obtenerCuenta(0).retirar(81000);
        c2.obtenerInfo();
    }
}