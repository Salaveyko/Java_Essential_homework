package Handler;

import java.util.Scanner;

/**
 * Program simulates working with files.
 * User enters the document format and a simple factory creates the required instance.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AbstractHandler doc;
        String format;

        System.out.print("Enter doc format: ");
        format = in.next();

        if(format.equalsIgnoreCase("xml")) {
            doc = new XMLHandler();
        } else if (format.equalsIgnoreCase("txt")) {
            doc = new TXTHandler();
        } else if (format.equalsIgnoreCase("doc")) {
            doc = new DOCHandler();
        } else {
            System.out.println("Incorrect format.");
            return;
        }

        doc.open();
        doc.create();
        doc.change();
        doc.save();
    }
}
