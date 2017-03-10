package com.jalasoft.selenium.Ariel.shape;

/**
 * Created by xain on 3/3/2017.
 */
public class Rectangle extends Shape {
    private double base;
    private double height;

    /**
     * Creates a rectangle object with the given base and height.
     * @param base          the base of the rectangle.
     * @param height        the height of the rectangle.
     */
    public Rectangle(final double base, final double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return 2 * (base + height);
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return base * height;
    }
}
