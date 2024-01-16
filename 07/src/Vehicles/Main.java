package Vehicles;

/**
 * The essence of the task is to write a Vehicle enumeration, which should contain a constructor,
 * a getColor() method,  and overridden toString()
 */
public class Main {
    public static void main(String[] args) {
        Vehicles v = Vehicles.FERRARI;
        System.out.println(v.getColor() + " " + v);
    }
}
