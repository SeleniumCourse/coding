package com.jalasoft.selenium.leonardo.shape;

/**
 * Created by Automation on 3/3/2017.
 */
public class rectangleShape extends baseShape {
    private double l;
    private double w;

    /**
     *
     * @param l length
     * @param w width
     */
    public rectangleShape(double l, double w) {   //constructor
        this.l = l;
        this.w = w;
    }

    /**
     *
     * @return rectangle area
     */
    public double calculateArea() {
        double returnValue;
        return returnValue = this.l * this.w;
    }

    /**
     *
     * @return rectanble perimeter
     */
    public double calculatePerimeter() {
        double returnValue;
        return returnValue = 2 * (this.l + this.w);
    }

}
