package com.jalasoft.selenium.giovanny.shape;

/**
 * Subclass that represents the
 * square shape.
 *
 * @author      Giovanny Uscamaita
 * @version     2.0, 4/24/2017.
 */
public class Square implements IShape {

    private double side;

    /**
     * Class constructor.
     *
     * @param side the square side to
     *             calculate formulas
     */
    public Square(final double side) {
        this.side = side;
    }

    /**
     * Method that calculates square's area.
     *
     * @return the value calculated
     */
    @Override
    public double calculateArea() {
        return side * side;
    }

    /**
     * Method that calculates square's perimeter.
     *
     * @return the value calculated
     */
    @Override
    public double calculatePerimeter() {
        return side + side + side + side;
    }
}
