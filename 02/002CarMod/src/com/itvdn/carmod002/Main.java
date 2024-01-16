package com.itvdn.carmod002;

/**
 * The program creates Car instances and puts them to the array.
 * Also, prints all instances to the console.
 */
public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[15];

        cars[0] = new Car();
        cars[1] = new Car(2000);
        cars[2] = new Car(180.0);
        cars[3] = new Car("Red");
        cars[4] = new Car(1993, 160.0);
        cars[5] = new Car(2015, "Red");
        cars[6] = new Car(1990, 1100);
        cars[7] = new Car(220.0, "Black");
        cars[8] = new Car(260.0, 910);
        cars[9] = new Car("Grey", 1400);
        cars[10] = new Car(2022, 320.0, 1150);
        cars[11] = new Car(2018, 280.0, "White");
        cars[12] = new Car(2015, "Yellow", 1250);
        cars[13] = new Car(220.0, "Red", 1100);
        cars[14] = new Car(2022, 455.6, "Black/White", 1600);

        for(Car c:cars) {
            c.show();
            System.out.println();
        }
    }
}
