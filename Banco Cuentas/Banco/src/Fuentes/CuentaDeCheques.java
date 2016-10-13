package Fuentes;
public class CuentaDeCheques extends Cuenta {
    private double montoSobregiro;

    public CuentaDeCheques(double saldoIni) {
        super(saldoIni);
        montoSobregiro=1000;
    }

    public CuentaDeCheques(double saldoIni, double sobregiro){
        super(saldoIni);
        montoSobregiro=sobregiro;
    }
    
    @Override
    public void retirar(double monto){
        if(monto>(saldo+montoSobregiro)){
            System.out.println("No puedes retirar esa cantidad");
        }else{
            saldo-=monto;
            System.out.println("Monto retirado: "+monto);
            System.out.println("Saldo actual: "+saldo);
        }
    }
}