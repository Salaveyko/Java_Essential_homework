package MyClass;

/**
 * Task
 * Create a MyClass<T> class containing a static factory method, T factoryMethod(),
 * which will create instances of the type specified as the type parameter
 * (pointer of the place of filling type - T)
 */
public class Main {
    public static void main(String[] args) {
        try {
            String string = MyClass.factoryMethod(String.class);
            System.out.println(string.getClass());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
