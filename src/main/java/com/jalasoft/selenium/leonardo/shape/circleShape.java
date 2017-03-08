package com.jalasoft.selenium;

/**
 * Created by Automation on 3/3/2017.
 */
public class circleShape extends baseShape {
    private double radio;

    public circleShape(double radio){   /**constructor instanciar clase*/
        this.radio = radio;
    }

    public double calculateArea(){
        double returnValue;
        return returnValue = 3.14*(this.radio*2);
    }

    public double calculatePerimeter(){
        double returnValue;
        return returnValue = 2*3.14*this.radio;
    }
}
