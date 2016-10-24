package test;

import sources.Ave;
import sources.El_Santo;

public class TestVoladores {
    public static void main(String[] args) { 
        El_Santo l=new El_Santo();
        System.out.println("El Santo gana gana "+l.ganarDinero());
        System.out.println(l.chocar());
        l.recuperar();
        Ave a=new Ave();
        System.out.println(a.chocar());
        a.recuperar();
    }
}