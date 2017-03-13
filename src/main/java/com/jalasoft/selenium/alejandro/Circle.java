package com.jalasoft.selenium.alejandro;

/**
 * Created by Alejandro Alcocer on 3/6/2017.
 */
public class Circle extends Shape {
    private double radius;
    private int constant = 2;
    public  Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return constant * Math.PI * Math.pow(radius, constant);
    }

    @Override
    public double calculatePerimeter() {
        return constant * Math.PI * radius;
    }
}
