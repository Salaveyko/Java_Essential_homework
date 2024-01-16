package Device;

import java.util.Objects;

/**
 * Tasks:
 * 1.Create a Device class (manufactures(String), price(float), serialNumber(String)).
 * Create a Monitor subclass (resolutionX(int), resolutionY(int)).
 * Create an EthernetAdapter subclass (speed(int), mac(String)).
 * Add constructors, getters, and setters.
 * 2.Override the toString() for each class.
 * 3.Override equals() and hashCode() for each class.
 * Create a Main class in which to create objects and demonstrate their work.
 */
public class Device {
    private String manufacturer;
    private String serialNumber;
    private double price;

    public Device() {
    }

    public Device(String manufacturer, String serialNumber, double price) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Double.compare(device.price, price) == 0
                && Objects.equals(manufacturer, device.manufacturer)
                && Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, serialNumber, price);
    }

    @Override
    public String toString() {
        return "Device: " +
                "manufacturer = " + manufacturer +
                ", serialNumber = " + serialNumber +
                ", price = " + price;
    }
}
