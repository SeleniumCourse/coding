package com.jalasoft.selenium.Ariel.shape;

/**
 * Created by xain on 3/3/2017.
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Creates a circle object with the given radius.
     * @param radius        the radius of the circle
     */
    public Circle(final double radius) {
        this.radius = radius;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
