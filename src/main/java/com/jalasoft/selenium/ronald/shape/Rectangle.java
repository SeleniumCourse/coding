package com.jalasoft.selenium.ronald.shape;

/**
 * Rectangle class.
 * @author bsronald on 3/3/17.
 */
public class Rectangle extends AbstractFigure {

    protected float base;
    protected float length;

    /**
     * Constructor.
     * @param base value
     * @param length value
     */
    Rectangle(final float base, final float length) {
        this.base = base;
        this.length = length;

    }

    /**
     * This method calculate Perimeter.
     *
     * @return perimeter value
     */
    public float calculatePerimeter() {
        perimeter = (2 * length) + (2 * base);

        return perimeter;
    }

    /**
     * This method calculate Area.
     *
     * @return area value
     */
    public float calculateArea() {
        area = base * length;

        return area;
    }
}
