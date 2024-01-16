package com.itvdn.computer001;

import java.util.Scanner;

/**
 * The program creates an array of computers of size 5 and transmits the data received from
 * the console to each instance. Prints the array.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Computer[] comps = new Computer[5];

        for(int i = 0; i < comps.length; i++) {
            System.out.print("Enter comp: ");
            comps[i] = new Computer(in.nextLine());
        }

        for(Computer c:comps) {
            System.out.println("Computer: " + c.getName());
        }
    }
}
