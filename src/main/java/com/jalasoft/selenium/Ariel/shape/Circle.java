package com.jalasoft.selenium.Ariel.shape;

/**
 * Created by xain on 3/3/2017.
 */
public class Circle extends Shape{
    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * PI * this.radius;
    }

    public double calculateArea() {
        return PI * Math.pow(this.radius, 2);
    }
}
