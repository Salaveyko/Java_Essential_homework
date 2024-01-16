package Distance;

/**
 * Practice creating and using static nested classes.
 */
public class Main {
    public static void main(String[] args) {
        Distance distance = new Distance();
        distance.setDistance(1325);

        System.out.println(
                "Meter to kilometer: " +
                Distance.Converter.meterToKilometer(distance.getDistance()) +
                "\nKilometer to meter: " +
                Distance.Converter.kilometerToMeter(distance.getDistance()) +
                "\nKilometer to mile: " +
                Distance.Converter.KilometerToMile(distance.getDistance()) +
                "\nMile to kilometer: " +
                Distance.Converter.milesToKilometer(distance.getDistance())
        );
    }
}
