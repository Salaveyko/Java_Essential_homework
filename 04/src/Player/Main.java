package Player;

/**
 * The program - media player/recorder simulator.
 * Player class implements Playable, Recordable interfaces.
 * Various instances are declared here to test their behavior.
 */
public class Main {
    public static void main(String[] args) {
        Playable play = new Player();
        Recordable rec = new Player();
        Player player = new Player();

        play.play();
        play.pause();
        play.stop();

        rec.record();
        rec.pause();
        rec.stop();

        player.play();
        player.pause();
        player.stop();
        player.record();
        player.pause();
        player.stop();
    }
}
