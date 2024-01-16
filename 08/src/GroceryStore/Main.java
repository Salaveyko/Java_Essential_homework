package GroceryStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Data entry.
 * 2. Sort and display the collection on the console.
 * 3. Printing the products found by the store name. If there are no stores
 *    with this name, an IllegalArgumentException is thrown.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Price> prices = new ArrayList<>();

        while (true) {
            Price price = new Price();
            System.out.print("\nEnter the name of the product: ");
            price.setProductName(sc.nextLine());
            System.out.print("Enter the price of the product: ");
            price.setPrice(sc.nextDouble());
            //clear the buffer
            sc.nextLine();
            System.out.print("Enter the name of the store: ");
            price.setStoreName(sc.nextLine());
            prices.add(price);

            System.out.print("Finish entering? (y): ");
            if (sc.nextLine().charAt(0) == 'y') break;
        }

        System.out.println();

        Collections.sort(prices);
        for (var p : prices) {
            System.out.println(p);
        }

        try {
            System.out.print("\nEnter the store name to show products: ");
            String store = sc.nextLine();
            int storeCounter = 0;
            for (var p : prices) {
                if (p.getStoreName().equals(store)) {
                    System.out.println(p);
                    storeCounter++;
                }
            }
            if(storeCounter == 0){
                throw new IllegalArgumentException("There is no such store here called " + store);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
