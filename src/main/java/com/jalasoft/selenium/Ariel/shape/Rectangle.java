package com.jalasoft.selenium.Ariel.shape;

/**
 * Created by xain on 3/3/2017.
 */
public class Rectangle extends Shape {
    private double base;
    private double height;

    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double calculatePerimeter() {
        return 2 * (base + height);
    }

    public double calculateArea() {
        return base * height;
    }
}
