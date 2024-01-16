package com.itvdn.lesson002;

/**
 * The program creates Car instances and prints them on the console.
 */
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(2010);
        Car c3 = new Car(2009, 220);
        Car c4 = new Car(2015, 265.5, "Black");
        Car c5 = new Car(2015, 265.5, "Black", 1255);

        c1.show();
        c2.show();
        c3.show();
        c4.show();
        c5.show();
    }
}
