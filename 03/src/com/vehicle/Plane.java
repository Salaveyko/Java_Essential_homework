package com.vehicle;

/**
 * Plane extends Vehicle, contains boilerplate code and a print() method that returns
 * string formatted fields addition to the parent method.
 */
public class Plane extends Vehicle {
    private double height;
    private int numOfPassengers;

    public Plane(){
    }
    public Plane (double xCoord, double yCoord, int cost, int speed, int year, double height, int numOfPassengers) {
        super(xCoord, yCoord, cost, speed, year);
        this.height = height;
        this.numOfPassengers = numOfPassengers;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public String print() {
        return String.format("Plane:\n" + super.print()
                + "\nFlight altitude: " + height
                + "\nNumber of passengers: " + numOfPassengers);
    }
}
