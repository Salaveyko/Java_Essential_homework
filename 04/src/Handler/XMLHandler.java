package Handler;

/**
 * The .xml file handler extends AbstractHandler
 */
public class XMLHandler extends AbstractHandler {
    public void open() {
        System.out.println("Opening .xml document.");
    }

    public void create() {
        System.out.println("Creating .xml document.");
    }

    public void change() {
        System.out.println("Changing .xml document.");
    }

    public void save() {
        System.out.println("Saving .xml document.");
    }
}
