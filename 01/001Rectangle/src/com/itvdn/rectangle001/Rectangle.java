package com.itvdn.rectangle001;

public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide2() {
        return side2;
    }

    /**
     * Calculates area of the rectangle
     *
     * @return the area
     */
    public double areaCalc() {
        return side1 * side2;
    }

    /**
     * Calculates perimeter of the rectangle
     *
     * @return the perimeter
     */
    public double perimeterCalc() {
        return (side1 + side2) * 2;
    }
}
