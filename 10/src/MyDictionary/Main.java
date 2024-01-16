package MyDictionary;

/**
 * Simple dictionary.
 * 1. Create a generic class MyDictionary<K, V> with a few methods to work with.
 * 2. The put() method for adding pairs.
 * 3. A method that gets the value by the key.
 * 4. A readonly method for getting the length of the dictionary;
 * Undercover of the Dictionary class is the Entry<K, V> array and all manipulations are
 * performed with it.
 */
public class Main {
    public static void main(String[] args) {
        MyDictionary<String, String> dictionary = new MyDictionary<String, String>();
        dictionary.put("Alex", "Solovey");
        dictionary.put("Robot", "T300");

        System.out.println(dictionary);
        System.out.println("Length: " + dictionary.getLength());

        System.out.println(dictionary.get("Alex"));
        System.out.println(dictionary.get("Robot"));
        System.out.println(dictionary.get("sd"));
    }
}
