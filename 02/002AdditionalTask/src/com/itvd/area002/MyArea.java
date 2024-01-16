package com.itvd.area002;

/**
 * MyArea has only one static method that calculates the area of the circle.
 */
public class MyArea {
    private static final double PI = Math.PI;

    public static double areaOfCircle (double r) {
        return Math.pow(PI * r, 2);
    }
}
