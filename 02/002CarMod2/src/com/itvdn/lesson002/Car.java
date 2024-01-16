package com.itvdn.lesson002;

public class Car {
    private int year;
    private double speed;
    private String color;
    private int weight;

    public Car() {
        this(0, 0.0, "", 0);
    }

    public Car(int year) {
        this(year, 0.0, "", 0);
    }

    public Car(int year, double speed) {
        this(year, speed, "", 0);
    }

    public Car(int year, double speed, String color) {
        this(year, speed, color, 0);
    }

    public Car(int year, double speed, String color, int weight) {
        this.year = year;
        this.speed = speed;
        this.color = color;
        this.weight = weight;
    }

    /**
     * Prints the Car object to the console.
     */
    public void show() {
        System.out.println("Year: " + year + "\nSpeed: " + speed
                + "\nColor: " + color + "\nWeight: " + weight + "\n");
    }
}
