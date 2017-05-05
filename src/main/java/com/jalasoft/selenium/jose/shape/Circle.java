package com.jalasoft.selenium.jose.shape;

/**
 * Created by Jose Rioja on 3/4/2017.
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Circle constructor.
     * @param radius It is the radius of the circle.
     */
    Circle(final double radius) {
        this.radius = radius;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
