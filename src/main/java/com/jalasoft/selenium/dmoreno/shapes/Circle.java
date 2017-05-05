package com.jalasoft.selenium.dmoreno.shapes;

/**
 * Created by Daniel Moreno on 3/3/2017.
 */
public class Circle implements IShape {
    private double radius;

    /**
     * @param radius radius
     */
    public Circle(final double radius) {
        this.radius = radius;
    }

    /**
     * @return area
     */
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * @return perimeter
     */
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
