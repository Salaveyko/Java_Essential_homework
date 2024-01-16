package Zoo;

import java.util.*;

/**
 * Practice with Lists.
 * 1. Create a Zoo class with a list of animals inside, put 8 beasts into and print zoo.
 * 2. Remove animals with indices 7, 5, 3 and print zoo.
 * 3. Create a list of integers, using an iterator to fill the list and increment each element by 1.
 * +. Get indices of the max/min values and print them.
 */
public class Main {
    public static void main(String[] args) {
        //Task 1
        Zoo zoo = new Zoo();

        System.out.println(zoo);

        //Task 2
        zoo.remove(7);
        zoo.remove(5);
        zoo.remove(3);
        System.out.println(zoo);

        //Task 3
        List<Integer> integers = new ArrayList<>();
        ListIterator<Integer> iterator = integers.listIterator();

        Random rnd = new Random();
        for (int i = 0; i < 19; i++) {
            int n = rnd.nextInt(100) - 50;
            iterator.add(n);
        }
        System.out.println(integers);

        while (iterator.hasPrevious()) {
            iterator.set(iterator.previous() + 1);
        }
        System.out.println(integers);

        //Additional task
        System.out.println("Index of the max value: " + integers.indexOf(Collections.max(integers)));
        System.out.println("Index of the min value: " + integers.indexOf(Collections.min(integers)));
    }
}
