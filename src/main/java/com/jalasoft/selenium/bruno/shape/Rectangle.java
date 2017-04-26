package com.jalasoft.selenium.bruno.shape;

import java.text.DecimalFormat;

import static java.lang.Double.parseDouble;

/**
 * This class represents a Rectangle.
 * Created by Bruno Barrios on 3/3/2017.
 */
public class Rectangle implements Shape {
    protected final double base;
    protected final double altura;
    public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");
    /**
     * This the constructor of a Rectangle.
     *
     * @param sideA of a rectangle.
     * @param sideB of a rectangle.
     */
    public Rectangle(final double sideA, final double sideB) {
        this.base = sideA;
        this.altura = sideB;
    }

    /**
     * Calculate rectangle area.
     *
     * @return area
     */
    @Override
    public double calculateArea() {
        return parseDouble(DECIMAL_FORMAT.format(this.base * this.altura));
    }

    /**
     * Calculate parameter.
     *
     * @return perimeter
     */
    @Override
    public double calculatePerimeter() {
        return parseDouble(DECIMAL_FORMAT.format(2 * (this.base * this.altura)));
    }
}
