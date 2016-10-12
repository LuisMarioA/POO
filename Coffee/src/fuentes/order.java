package fuentes;

import java.util.Scanner;

public class order {
    private int largeBox;
    private int mediumBox;
    private int smallBox;
    private static final double LARGE_BOX=2;
    private static final double MEDIUM_BOX=1;
    private static final double SMALL_BOX=0.5;
    private static final double BOLSA=5.5;
    private double costo_cajas;
    private double costo_bolsas;
    private double costo_total;
    private int bolsas;

    public order(int bolsas) {
        this.bolsas=bolsas;
        costo_cajas=cajas(bolsas);
        costo_bolsas=costoBolsas(bolsas);
        costo_total=costoTotal();
    }

public double cajas(int numerito){
    while(numerito>0){
        if(numerito>15){
            numerito-=20;
            largeBox++;
            costo_cajas+=LARGE_BOX;
        }else{
            if(numerito<15 && numerito>=10){
                numerito-=10;
                mediumBox++;
                costo_cajas+=MEDIUM_BOX;
            }else{
                if(numerito<10){
                    numerito-=5;
                    smallBox++;
                    costo_cajas+=SMALL_BOX;
                }
            }
        }
    }
    return costo_cajas;
}

    public double costoBolsas(int numeroB){
        costo_bolsas=numeroB*BOLSA;
        return costo_bolsas;
    }
    
    public double costoTotal(){
        costo_total=costo_bolsas+costo_cajas;
        return costo_total;
    }

    @Override
    public String toString() {
        String cad="";
        Scanner s=new Scanner(System.in);
        System.out.println("Insert Date (MM/dd/yyyy)");
        String fecha=s.nextLine();
        String fechas[]=fecha.split("/");
        int mes=Integer.parseInt(fechas[0]);
        int dia=Integer.parseInt(fechas[1]);
        cad="Number of Bags Ordered: "+bolsas+" - $ "+costo_bolsas+"\n";
        cad+="Boxes used: \n\t"+largeBox+" Large - $"+(LARGE_BOX*largeBox);
        cad+="\n\t"+mediumBox+" Medium - $"+(MEDIUM_BOX*mediumBox);
        cad+="\n\t"+smallBox+" Small - $"+(SMALL_BOX*smallBox);
        cad+="\n Your total cost is : $"+costo_total;
        cad+="\nDate of Order: "+ month(mes)+" "+dia+", "+fechas[2];
        cad+="\nExpected Date of Arrival: "+ month(mes)+" "+(dia+14)+", "+fechas[2];
        return cad;
    }
      
    public String month(int num){
        String cad="";
        switch(num){
            case 1:
                cad="January";
                break;
            case 2:
                cad="February";
                break;
            case 3:
                cad="March";
                break;
            case 4:
                cad="April";
                break;
            case 5:
                cad="May";
                break;
            case 6:
                cad="June";
                break;
            case 7:
                cad="July";
                break;
            case 8:
                cad="August";
                break;
            case 9:
                cad="September";
                break;
            case 10:
                cad="October";
                break;
            case 11:
                cad="November";
                break;
            case 12:
                cad="December";
                break;
        }
        return cad;
    }
}