package com.jalasoft.selenium.giovanny.shape;

/**
 * Class interface for Shape figures,
 * it will define the abstract methods to
 * define the area and the perimeter.
 *
 * @author  Giovanny Uscamaita
 * @version 2.0, 4/24/2017.
 */

public interface IShape {

    /**
     * Method that calculates the area of
     * the shape inside subclasses.
     *
     * @return the value for area
     */
    double calculateArea();

    /**
     * Method that calculates the perimeter of
     * the shape inside subclasses.
     *
     * @return the value for the perimeter
     */
    double calculatePerimeter();
}
