package com.itvdn.car002;

/**
 * Car object that has all possibles constructors.
 */
public class Car {
    private int year;
    private String color;

    public Car() {
        year = 0;
        color = "";
    }

    public Car(int year) {
        this.year = year;
        color = "";
    }

    public Car(String color) {
        this.color = color;
        year = 0;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    /**
     * Prints the Car object to the console.
     */
    public void show() {
        System.out.println("Year: " + year + "\nColor: " + color);
    }
}
