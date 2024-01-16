package com.itvdn.carmod002;

/**
 * Car object that has all possibles constructors.
 */
public class Car {
    private int year;
    private int weight;
    private double speed;
    private String color;

    public Car() {
        this.year = 0;
        this.weight = 0;
        this.speed = 0;
        this.color = "";
    }

    public Car(int year) {
        this.year = year;
        this.weight = 0;
        this.speed = 0;
        this.color = "";
    }

    public Car(double speed) {
        this.year = 0;
        this.weight = 0;
        this.speed = speed;
        this.color = "";
    }

    public Car(String color) {
        this.year = 0;
        this.weight = 0;
        this.speed = 0;
        this.color = color;
    }

    public Car(int year, int weight) {
        this.year = year;
        this.weight = weight;
        this.speed = 0;
        this.color = "";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.weight = 0;
        this.speed = speed;
        this.color = "";
    }

    public Car(int year, String color) {
        this.year = year;
        this.weight = 0;
        this.speed = 0;
        this.color = color;
    }

    public Car(double speed, int weight) {
        this.year = 0;
        this.weight = weight;
        this.speed = speed;
        this.color = "";
    }

    public Car(double speed, String color) {
        this.year = 0;
        this.weight = 0;
        this.speed = speed;
        this.color = color;
    }

    public Car(String color, int weight) {
        this.year = 0;
        this.weight = weight;
        this.speed = 0;
        this.color = color;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.weight = weight;
        this.speed = speed;
        this.color = "";
    }

    public Car(int year, String color, int weight) {
        this.year = year;
        this.weight = weight;
        this.speed = 0;
        this.color = color;
    }

    public Car(int year, double speed, String color) {
        this.year = year;
        this.weight = 0;
        this.speed = speed;
        this.color = color;
    }

    public Car(double speed, String color, int weight) {
        this.year = 0;
        this.weight = weight;
        this.speed = speed;
        this.color = color;
    }

    public Car(int year, double speed, String color, int weight) {
        this.year = year;
        this.weight = weight;
        this.speed = speed;
        this.color = color;
    }

    /**
     * Prints the Car object to the console.
     */
    public void show() {
        System.out.println("Year: " + year
                + "\nSpeed: " + speed
                + "\nColor: " + color
                + "\nWeight: " + weight);
    }
}
