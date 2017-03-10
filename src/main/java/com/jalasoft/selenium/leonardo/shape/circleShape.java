package com.jalasoft.selenium.leonardo.shape;

/**
 * Created by Automation on 3/3/2017.
 */
public class circleShape extends baseShape {
    private double radio;

    public circleShape(double radio){   /**constructor instanciar clase*/
        this.radio = radio;
    } /** constructor */

    public double calculateArea(){
        double returnValue;
        return returnValue = PI*(this.radio*this.radio);
    }

    public double calculatePerimeter(){
        double returnValue;
        return returnValue = 2*PI*this.radio;
    }
}
