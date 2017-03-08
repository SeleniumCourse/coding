package com.jalasoft.selenium;

/**
 * Created by Automation on 3/3/2017.
 */
public class rectangleShape extends baseShape{
    private double l;
    private double w;

    public rectangleShape(double l, double w){   /**instanciar clase*/
        this.l = l;
        this.w = w;
    }

    public double calculateArea(){
        double returnValue;
        return returnValue = this.l*this.w;
    }

    public double calculatePerimeter(){
        double returnValue;
        return returnValue = 2*(this.l+this.w);
    }

}
