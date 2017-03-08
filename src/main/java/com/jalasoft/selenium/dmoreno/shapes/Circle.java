package com.jalasoft.selenium.dmoreno.shapes;

/**
 * Created by Daniel Moreno on 3/3/2017.
 */
public class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
