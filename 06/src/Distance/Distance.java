package Distance;

public class Distance {
    public static class Converter {
        public static double meterToKilometer(double meter) {
            return meter / 1000;
        }

        public static double kilometerToMeter(double kilometer) {
            return kilometer * 1000;
        }

        public static double milesToKilometer(double miles) {
            return miles * 1.609344;
        }

        public static double KilometerToMile(double kilometer) {
            return kilometer / 1.609344;
        }
    }

    private double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
