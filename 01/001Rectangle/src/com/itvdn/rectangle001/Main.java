package com.itvdn.rectangle001;

import java.util.Scanner;

/**
 * The program gets the sides of a rectangle. Prints area and perimeter.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectangle rect;
        double s1, s2;

        System.out.println("Enter the sides of rectangle:");
        s1 = in.nextDouble();
        s2 = in.nextDouble();
        rect = new Rectangle(s1, s2);

        System.out.println();

        System.out.println("The area of rectangle = " + rect.areaCalc());
        System.out.println("The perimeter of rectangle = " + rect.perimeterCalc());
    }
}
