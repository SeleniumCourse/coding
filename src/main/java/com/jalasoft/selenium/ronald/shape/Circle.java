package com.jalasoft.selenium.ronald.shape;

/**
 * Circle class.
 * @author bsronald on 3/3/17.
 */
public class Circle extends AbstractFigure {
    private float radio;

    /**
     * Constructor.
     * @param radio value
     */
    Circle(final float radio) {
        this.radio = radio;
    }

    /**
     * This method calculate Perimeter.
     *
     * @return perimeter value
     */
    public float calculatePerimeter() {
        perimeter = (float) (2 * Math.PI * radio);
        return perimeter;
    }

    /**
     * This method calculate Area.
     *
     * @return area value
     */
    public float calculateArea() {
        double value = (double) radio;
        area = (float) (Math.PI * value * value);
        return area;

    }

}
