package com.jalasoft.selenium;

/**
 * Created by Daniel Moreno on 3/3/2017.
 */
public class Rectangle implements IShape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return this.width * this.height;
    }

    public double calculatePerimeter() {
        return this.width * 2 + this.height * 2;
    }
}
