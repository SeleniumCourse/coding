package com.jalasoft.selenium.jose.shape;

/**
 * Created by Jose Rioja on 3/4/2017.
 */
public class Rectangle extends Shape {
    private double side1;
    private double side2;

    /**
     * Rectangle constructor.
     * @param side1 This is the first side.
     * @param side2 This is the second side.
     */
    Rectangle(final double side1, final double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return side1 * side2;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return (2 * side1) + (2 * side2);
    }
}
