package com.DocumentWorker;

/**
 * ProDocumentWorker extends DocumentWorker.
 * Overrides saveDocument() and editDocument() methods.
 * Simulates work in the Pro version of the program.
 */
public class ProDocumentWorker extends DocumentWorker {
    public void editDocument() {
        System.out.println("The document has been edited.");
    }

    public void saveDocument() {
        System.out.println("The document is saved in old format, " +
                "saving in other formats is available in EXP version.");
    }
}
