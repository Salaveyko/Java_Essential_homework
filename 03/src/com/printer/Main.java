package com.printer;

/**
 * Just a practice mimicking classes.
 * Each child class is printed in a different color.
 */
public class Main {
    public static void main(String[] args) {
        SuperClass s = new SuperClass();
        SuperClass a = new ClassA();
        SuperClass b = new ClassB();

        s.print();
        a.print();
        b.print();
    }
}
