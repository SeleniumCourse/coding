package com.jalasoft.selenium.giovanny.shape;

/**
 * Created by xianqe on 3/3/2017.
 */
public class Rectangle implements Shape
{
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    public double calculateArea(){
        return side1 * side2;

    }

    public double calculatePerimeter() {
        return side1 + side1 + side2 + side2;
    }
}
