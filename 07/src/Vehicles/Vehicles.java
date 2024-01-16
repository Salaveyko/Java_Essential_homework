package Vehicles;

public enum Vehicles {
    BMW(45000, "black")
    ,MERCEDES(47000, "Gray")
    ,VOLVO(44000, "Blue")
    ,FERRARI(100000, "Red")
    ,AUDI(43000, "Green");

    private int cost;
    private String color;

    Vehicles (int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + this.cost + "$";
    }
}
