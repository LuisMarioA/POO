package sources;

public abstract class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }
    
    public void walk(){
        System.out.println("Im an animal walking in "+legs+" legs.");
    }
    
    public abstract void eat();
}