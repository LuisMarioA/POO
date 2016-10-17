package sources;

public class Fish extends Animal implements Pet{
    private String name;
    public Fish() {
        super(0);
        name="";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println("Playing...");
    }
    
    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void walk() {
        System.out.println("A fish doesn't have legs and can't walk");
    }
}