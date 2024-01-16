package com.vehicle;

/**
 * Vehicle is an abstract class, contains boilerplate code and a print() method which returns
 * string formatted fields.
 */
public abstract class Vehicle {
    private double xCoord;
    private double yCoord;
    private int cost;
    private int speed;
    private int year;

    public Vehicle() {
    }

    public Vehicle(double xCoord, double yCoord, int cost, int speed, int year) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.cost = cost;
        this.speed = speed;
        this.year = year;
    }

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String print() {
        return String.format("Coordinates: " + xCoord + ", " + yCoord
                + "\nCost: " + cost
                + "\nSpeed: " + speed
                + "\nYear: " + year);
    }
}
