package com.itvdn.javaEssential.lesson1;

/**
 * The program creates an instance of Address and passes data to the constructor.
 * After - displays the fields value.
 */
public class Main {
    public static void main(String[] args) {
        Address ad = new Address(
                33000
                ,"Ukraine"
                ,"Rivne"
                ,"Soborna"
                ,15
                ,23
        );
        System.out.println("Index: " + ad.getIndex()
                        + "\nCountry: " + ad.getCountry()
                        + "\nCity: " + ad.getCity()
                        + "\nStreet: " + ad.getStreet()
                        + "\nHouse: " + ad.getHouse()
                        + "\nApartment: " + ad.getApartment()
                );
    }
}
