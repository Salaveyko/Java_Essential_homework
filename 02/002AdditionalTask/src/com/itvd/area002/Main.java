package com.itvd.area002;

import java.util.Scanner;

/**
 * The program calculates the area of the circle.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter R:");
        double r = scan.nextDouble();

        System.out.println("S = " + MyArea.areaOfCircle(r));
    }
}
