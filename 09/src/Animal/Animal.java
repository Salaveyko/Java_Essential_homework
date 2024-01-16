package Animal;

import java.util.Objects;

/**
 * 1. Create the class Animal (name(String), age(int), hasTail(boolean)).
 * 2. Override the toString(), equals(), and hashCode() methods.
 * 3. Demonstrate the work.
 */
public class Animal {
    private String name;
    private int age;
    private boolean hasTail;

    public Animal(String name, int age, boolean hasTail) {
        this.name = name;
        this.age = age;
        this.hasTail = hasTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age
                && hasTail == animal.hasTail
                && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hasTail);
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", age = " + age +
                ", tail = " + (hasTail ? "has" : "none");
    }
}
