package com.jalasoft.selenium.ronald.shape;

/**
 * @author bsronald on 3/3/17.
 */
public abstract class AbstractFigure {
    protected String name;
    protected float perimetro;
    protected float area;
    abstract float calculatePerimetro();
    abstract float calculateArea();
}
