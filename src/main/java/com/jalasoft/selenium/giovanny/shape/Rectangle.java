package com.jalasoft.selenium.giovanny.shape;

/**
 * Subclass that represents the
 * rectangle shape.
 *
 * @author      Giovanny Uscamaita
 * @version     2.0, 4/24/2017.
 */
public class Rectangle implements IShape {

    private double side1;
    private double side2;

    /**
     * Class constructor.
     *
     * @param side1 first side of the rectangle
     * @param side2 second side of the rectangle
     */
    public Rectangle(final double side1, final double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    /**
     * Method that calculates rectangle's area.
     *
     * @return the value calculated
     */
    @Override
    public double calculateArea() {
        return side1 * side2;

    }

    /**
     * Method that calculates rectangle's perimeter.
     *
     * @return the value calculated
     */
    @Override
    public double calculatePerimeter() {
        return side1 + side1 + side2 + side2;
    }
}
