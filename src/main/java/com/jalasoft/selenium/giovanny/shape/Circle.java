package com.jalasoft.selenium.giovanny.shape;

import static java.lang.Math.PI;

/**
 * Subclass that represents the
 * circle shape.
 *
 * @author      Giovanny Uscamaita
 * @version     2.0, 4/24/2017.
 */
public class Circle implements IShape {

    private double radio;

    /**
     * Class constructor.
     * @param radio the radio for the circle
     */
    public Circle(final double radio) {
        this.radio = radio;
    }

    /**
     * Method that calculates circle's area.
     *
     * @return the value calculated
     */
    @Override
    public double calculateArea() {
        return PI * radio * radio;
    }

    /**
     * Method that calculates circle's perimeter.
     *
     * @return the value calculated
     */
    @Override
    public double calculatePerimeter() {
        return 2 * PI * radio;
    }
}
