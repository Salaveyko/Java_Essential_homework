package Device;

import java.util.Objects;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter() {
        super();
    }

    public EthernetAdapter(String manufacturer, String serialNumber, double price,
                           int speed, String mac) {
        super(manufacturer, serialNumber, price);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed &&
                Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }

    @Override
    public String toString() {
        return "EthernetAdapter: " +
                "manufacturer = " + super.getManufacturer() +
                ", serialNumber = " + super.getSerialNumber() +
                ", price = " + super.getPrice() +
                ", speed = " + speed +
                ", mac = " + mac;
    }
}
