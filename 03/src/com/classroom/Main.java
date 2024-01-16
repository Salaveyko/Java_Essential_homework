package com.classroom;

/**
 * The program creates and prints an instance of Classroom.
 * The Classroom contains an abstract Pupils array and a method getJournal() that returns
 * the pupils` performance journal formatted as a String.
 */
public class Main {
    public static void main(String[] args) {
        Classroom cr = new Classroom();

        System.out.println(cr.getJournal());
    }
}
