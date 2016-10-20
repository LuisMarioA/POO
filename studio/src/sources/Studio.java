package sources;

public class Studio {
    public static void main(String[] args) {
    Player p=new TapePlayer();
    ((Recorder) p).record();
    p.play();
    p.stop();
    p.play();
    p.pause();
    p.reverse();
    }
}