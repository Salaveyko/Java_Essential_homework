package com.vehicle;

/**
 * Ship extends Vehicle, contains boilerplate code and a print() method that returns
 * string formatted fields addition to the parent method.
 */
public class Ship extends Vehicle {
    private int numOfPassengers;
    private String port;

    public Ship() {
    }

    public Ship(double xCoord, double yCoord, int cost, int speed,
                int year, int numOfPassengers, String port) {
        super(xCoord, yCoord, cost, speed, year);
        this.numOfPassengers = numOfPassengers;
        this.port = port;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String print() {
        return String.format("Ship:\n" + super.print()
                + "\nPort of residence: " + port
                + "\nNumber of passengers: " + numOfPassengers);
    }
}
