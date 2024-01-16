package Animal;

public enum Animals {
    CAT(10), DOG(15), STRAUSS(8), WOLF(16), ELEPHANT(35);
    int age;

    Animals (int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + this.age;
    }
}
