package Fuentes;
public class Cuenta {
    protected double saldo;
    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public double consultar(){
        return saldo;
    }
    
    public void depositar(double monto){
        if(monto>0){
            System.out.println("Monto depositado: "+monto);
            saldo+=monto;
            System.out.println("Saldo actual: "+saldo);
        }else{
            System.out.println("Creo que estas intentado retirar");
        }
    }
    
    public void retirar(double monto){
        if(monto>saldo){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println("Monto retirado: "+monto);
            saldo-=monto;
            System.out.println("Saldo actual: "+saldo);
        }
    }
}