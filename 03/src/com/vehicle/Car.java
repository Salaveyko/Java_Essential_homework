package com.vehicle;

/**
 * Car extends Vehicle.
 */
public class Car extends Vehicle {
    public Car(){
    }
    public Car(double xCoord, double yCoord, int cost, int speed, int year) {
        super(xCoord, yCoord, cost, speed, year);
    }
}
