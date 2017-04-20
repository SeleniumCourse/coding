package com.jalasoft.selenium.joaquin.shape;

/**
 * Created by Joaquin Gonzales on 3/6/2017.
 */
public class Circle extends Shape{

    public double radio;
    public Circle(double radio)
    {
        this.radio=radio;
    }
    public double calculateArea() {
        return 2*Math.PI*Math.pow(radio,2);
    }

    public double calculateperimetro() {
        return 2*Math.PI*radio;
    }
}
