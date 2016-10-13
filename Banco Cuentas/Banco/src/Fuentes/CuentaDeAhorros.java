package Fuentes;
public class CuentaDeAhorros extends Cuenta {
    private double tasaDeInteres;

    public CuentaDeAhorros(double saldoIni,double tasaInteres) {
        super(saldoIni);
        tasaDeInteres = tasaInteres;
    }
    
    
    public double consultar(){
        double dado=0;
        dado=saldo*tasaDeInteres;
        System.out.println("Dado= "+dado);
        saldo+=dado;
        System.out.println("Saldo: " +saldo);
        
        return saldo;
    }
}
