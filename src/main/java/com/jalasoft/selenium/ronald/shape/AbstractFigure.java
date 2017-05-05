package com.jalasoft.selenium.ronald.shape;

/**
 * Abstract class.
 * @author bsronald on 3/3/17.
 */
public abstract class AbstractFigure {
    protected float perimeter;
    protected float area;

    /**
     * This method calculate Perimeter.
     *
     * @return perimeter value
     */
    abstract float calculatePerimeter();

    /**
     * This method calculate Area.
     *
     * @return area value
     */
    abstract float calculateArea();
}
