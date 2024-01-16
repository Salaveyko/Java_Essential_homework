package Zoo;

import java.util.LinkedList;
import java.util.List;

public class Zoo {
    private List<String> animals = new LinkedList<>();

    public Zoo() {
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Tiger");
        animals.add("Zebra");
        animals.add("Elephant");
        animals.add("Eagle");
        animals.add("Strauss");
        animals.add("Wolf");
    }

    public void remove(int index) {
        animals.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n\tAnimals list:\n");

        for (var a : animals) {
            sb.append(a);
            sb.append("\n");
        }

        return sb.toString();
    }
}
