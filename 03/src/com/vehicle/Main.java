package com.vehicle;

/**
 * The program creates and prints a couple of Vehicle instances.
 * Vehicle is an abstract class, so we can create a different types of it.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(14.54,
                17.34,
                15000,
                280,
                2018);
        Vehicle ship = new Ship(20.76,
                56.74,
                3000000,
                60,
                1993,
                200,
                "Odesa");
        Vehicle plane = new Plane(20.76,
                56.74,
                3000000,
                995,
                1993,
                12000,
                350);

        System.out.println(car.print() + "\n");
        System.out.println(plane.print() + "\n");
        System.out.println(ship.print());
    }
}
