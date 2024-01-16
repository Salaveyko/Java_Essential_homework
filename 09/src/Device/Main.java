package Device;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Dell", "111", 12);
        Device device1 = new Device("Dell", "111", 12);
        Device monitor = new Monitor("Dell", "111", 12,
                123, 123);
        Monitor monitor1 = new Monitor("Dell", "111", 12,
                123, 123);
        Device ethernetAdapter = new EthernetAdapter("Dell", "111", 12,
                123, "123");
        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("Dell", "111", 12,
                123, "123");

        System.out.println("\n\t--Equalities--");
        // true values are in the cream line
        System.out.println(
                device.equals(device1) + " " +
                device.equals(monitor) + " " + device.equals(monitor1) + " " +
                device.equals(ethernetAdapter) + " " + device.equals(ethernetAdapter1) + " " +
                device1.equals(monitor) + " " + device1.equals(monitor1) + " " +
                device1.equals(ethernetAdapter) + " " + device1.equals(ethernetAdapter1) + " " +
                monitor.equals(monitor1) + " " +
                monitor.equals(ethernetAdapter) + " " + monitor.equals(ethernetAdapter1) + " " +
                monitor1.equals(ethernetAdapter) + " " + monitor1.equals(ethernetAdapter1) + " " +
                ethernetAdapter.equals(ethernetAdapter1)
        );

        System.out.println("\n\t--Hashes--");
        System.out.println("device: " + device.hashCode());
        System.out.println("device1: " + device1.hashCode());
        System.out.println("monitor: " + monitor.hashCode());
        System.out.println("monitor1: " + monitor1.hashCode());
        System.out.println("ethernetAdapter: " + ethernetAdapter.hashCode());
        System.out.println("ethernetAdapter1: " + ethernetAdapter1.hashCode());

        System.out.println("\n\t--toStrings--");
        System.out.println("device\n" + device);
        System.out.println("device1\n" + device1);
        System.out.println("monitor\n" + monitor);
        System.out.println("monitor1\n" + monitor1);
        System.out.println("ethernetAdapter\n" + ethernetAdapter);
        System.out.println("ethernetAdapter1\n" + ethernetAdapter1);

    }
}
