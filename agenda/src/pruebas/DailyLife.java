package pruebas;
import fuentes.Person;

public class DailyLife {
    public static void main(String[] args) {
        Person person= new Person ("Steffen", 31);
        person.wakeUp();
        person.eat();
        person.work();
        person.eat();
        person.goOut();
        person.sleep();
        System.out.println("Current energylevel:"+person.getEnergyLevel());
        System.out.println("current weight:"+ person.getWeight());
    }
}
