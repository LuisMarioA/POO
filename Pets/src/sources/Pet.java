package sources;

public interface Pet {
    //Todos los metodos son public y abtract
    //Todos los atributos son static y final
    int age=0;
    public abstract String getName();
    public abstract void setName(String name);
    public abstract void play();
}