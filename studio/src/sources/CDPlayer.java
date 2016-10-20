package sources;

public class CDPlayer implements Player{

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void reverse() {
        System.out.println("Reverse");
    }
}