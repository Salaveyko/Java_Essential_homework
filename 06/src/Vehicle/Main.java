package Vehicle;

/**
 * Practice of creating instances of nested classes.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle.Wheel w = new Vehicle().new Wheel();
        Vehicle.Door d = new Vehicle().new Door();
        Vehicle v = new Vehicle();

        v.print();
        d.print();
        w.print();
    }
}
