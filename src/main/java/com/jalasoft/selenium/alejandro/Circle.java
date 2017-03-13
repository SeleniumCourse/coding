package com.jalasoft.selenium.alejandro;

/**
 * Created by Alejandro Alcocer on 3/6/2017.
 */
public class Circle extends Shape {
    public double radius;
    public  Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return 2*Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
