package com.jalasoft.selenium.bruno.shape;

/**
 * This class represents a square.
 * Created by Bruno Barrios on 3/3/2017.
 */
public class Square extends Rectangle {
    /**
     * This is the constructor of a square.
     *
     * @param side of a square
     */
    public Square(final int side) {
        super(side, side);
    }

    /**
     * Calculate perimeter.
     *
     * @return perimeter
     */
    @Override
    public double calculatePerimeter() {
        return Double.parseDouble(DECIMAL_FORMAT.format(2 * (double) (this.altura + this.base)));
    }


}
