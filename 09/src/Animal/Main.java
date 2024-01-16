package Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Chuck Norris", 5, false);

        System.out.println(animal
                        + "\nHash code: " + animal.hashCode()
                        + "\nEquals: " + animal.equals(animal));
    }
}
