package sources;

public class TapePlayer implements Recorder{

    @Override
    public void record() {
        System.out.println("Record");
    }

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