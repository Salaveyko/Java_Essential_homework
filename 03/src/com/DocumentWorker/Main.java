package com.DocumentWorker;

import java.util.Scanner;

/**
 * The program simulates work with a files.
 * User must enter a "key" and using if-else construction he`ll receive a correct instance of
 * the DocumentWorker.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DocumentWorker doc;
        String key;

        System.out.print("Enter product key: ");
        key = in.next();

        if (key.equalsIgnoreCase("PRO")) {
            System.out.println("Welcome to the Pro version.");
            doc = new ProDocumentWorker();
        } else if (key.equalsIgnoreCase("EXP")) {
            System.out.println("Welcome to the Exp version.");
            doc = new ExpDocumentWorker();
        } else {
            System.out.println("Hello in the Free version.");
            doc = new DocumentWorker();
        }

        doc.openDocument();
        doc.editDocument();
        doc.saveDocument();
    }
}
