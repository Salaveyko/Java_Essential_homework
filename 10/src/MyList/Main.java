package MyList;

/**
 * The essence of the task is to crate a generic class MyList with minimal functionality for its use.
 * 1. Add items and increase the size of the list, if necessary.
 * 2. Get the item by index.
 * 3. Get the size and length of the list.
 */
public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        for (int i = 0; i < 12; i++) {
            myList.add(i);
        }

        System.out.println("Size - " + myList.getSize() + "\tLength - " + myList.getLength());
        System.out.println(myList);
        System.out.println(myList.get(11));
        System.out.println(myList.get(12));
    }
}
