package fuentes;
public class Helicopter extends Airplane{
    @Override
    public void takeOff() {
        System.out.println("Turbines Advancing then Taking Off ...");
    }
    @Override
    public void land() {
        System.out.println("Land then Advance  ...");
    }
}
