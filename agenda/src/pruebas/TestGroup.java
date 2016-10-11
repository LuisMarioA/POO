package pruebas;
import fuentes.Group;
import fuentes.Person;

public class TestGroup {    
    public static void main(String[] args) {
        Person p= new Person ("Luis", 25);
        Person p1=new Person ("Mario",19);
        Group g =new Group();
        g.agregar(p);
        g.agregar(p1);
        for (int i = 0; i < g.getGroup().size(); i++) {
            System.out.println("Persona "+i+" "+g.getGroup().get(i).getWeight());//Muestra el peso de cada persona en el array
        }
    }
    
}
