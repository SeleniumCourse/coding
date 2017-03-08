package com.jalasoft.selenium.dmoreno.shapes;

/**
 * Created by Daniel Moreno on 3/3/2017.
 */
public class Rectangle implements IShape {

    private double width;
    private double height;

    /**
     * @param width width
     * @param height height
     */
    public Rectangle(final double width, final double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * @return area
     */
    public double calculateArea() {
        return this.width * this.height;
    }

    /**
     * @return perimeter
     */
    public double calculatePerimeter() {
        return this.width * 2 + this.height * 2;
    }
}
