package com.jalasoft.selenium.giovanny.shape;

/**
 * Subclass that represents the
 * square shape.
 *
 * @author      Giovanny Uscamaita
 * @version     2.0, 4/24/2017.
 */
public class Square extends Rectangle {

    /**
     * Class constructor that extends from Rectangle,
     * the needed methods to calculate the area and the
     * perimeter will be inherited from Rectangle.
     *
     * @param side the square side to
     *             calculate formulas
     */
    public Square(double side) {
        super(side, side);
    }
}
