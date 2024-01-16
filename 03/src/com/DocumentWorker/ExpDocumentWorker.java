package com.DocumentWorker;

/**
 * ExpDocumentWorker extends ProDocumentWorker and overrides the saveDocument() method.
 * Simulates work in the Exp version of the program.
 */
public class ExpDocumentWorker extends ProDocumentWorker {
    public void saveDocument() {
        System.out.println("The document is saved in new format.");
    }
}
