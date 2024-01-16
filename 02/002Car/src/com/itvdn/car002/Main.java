package com.itvdn.car002;

/**
 * The program creates Car instances and prints them on the console.
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2021);
        Car car3 = new Car("Black");
        Car car4 = new Car(2022, "Grey");

        car1.show();
        car2.show();
        car3.show();
        car4.show();
    }
}
