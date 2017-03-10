package com.jalasoft.selenium.bruno.shape;

import static java.lang.Math.PI;

/**
 * This method represents a Circle.
 * Created by Bruno Barrios on 3/3/2017.
 */
public class Circle implements Shape {
    private final double ratio;

    /**
     * This is the contructor of a cicle.
     * @param ratio of a circle.
     */
    public Circle(final double ratio) {
        this.ratio = ratio;
    }

    /**
     * Calculate Circle area.
     * @return circle area
     */
    public double calculateArea() {
        return PI * Math.pow(ratio, 2);
    }

    /**
     * Calculate circle perimeter.
     * @return circle perimeter
     */
    public double calculatePerimeter() {
        return PI * Math.pow(ratio, 2);
    }
}
