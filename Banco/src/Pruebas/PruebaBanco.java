package Pruebas;

import Fuentes.Banco;

public class PruebaBanco {
    public static void main(String[] args) {
       Banco banco = new Banco();
       banco.agregarCliente("Pedro1","101520");
       banco.agregarCliente("Pedro2","101521");
       banco.agregarCliente("Pedro3","101522");
       banco.agregarCliente("Pedro4","101523");
       banco.agregarCliente("Pedro5","101524");
       banco.agregarCliente("Pedro6","101525");
       banco.eliminarCliente(3);
       banco.obtenerClientes(0).obtenerCuenta().depositar(500);
       banco.obtenerClientes(0).obtenerCuenta().depositar(-500);
       banco.obtenerClientes(1).obtenerCuenta().retirar(500);
       banco.obtenerClientes(2).obtenerCuenta().retirar(100000);
       banco.imprimirClientes();
    }
}
