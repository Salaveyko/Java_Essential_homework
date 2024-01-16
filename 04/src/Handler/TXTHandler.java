package Handler;

/**
 * The .txt file handler extends AbstractHandler
 */
public class TXTHandler extends AbstractHandler {
    public void open() {
        System.out.println("Opening .txt document.");
    }

    public void create() {
        System.out.println("Creating .txt document.");
    }

    public void change() {
        System.out.println("Changing .txt document.");
    }

    public void save() {
        System.out.println("Saving .txt document.");
    }
}
