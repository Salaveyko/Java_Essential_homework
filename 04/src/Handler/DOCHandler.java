package Handler;

/**
 * The .doc file handler extends AbstractHandler
 */
public class DOCHandler extends AbstractHandler {
    public void open() {
        System.out.println("Opening .doc document.");
    }

    public void create() {
        System.out.println("Creating .doc document.");
    }

    public void change() {
        System.out.println("Changing .doc document.");
    }

    public void save() {
        System.out.println("Saving .doc document.");
    }
}
