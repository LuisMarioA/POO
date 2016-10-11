package fuentes;
import java.util.ArrayList;

public class Group {
    ArrayList <Person> group;

    public Group() {
        group=new ArrayList <>();
    }
    
    public void agregar (Person p){
        group.add(p);   
    }

    public ArrayList<Person> getGroup() {
        return group;
    }
}