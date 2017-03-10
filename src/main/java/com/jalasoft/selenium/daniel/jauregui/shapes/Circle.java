package com.jalasoft.selenium.daniel.jauregui.shapes;

/**
 * Circle Class.
 * @author Daniel Jauregui
 */
public class Circle extends Shape {
    private final double pi = 3.1416;
    private double radio;
    /**
     * Constructor.
     * @param radio will get the radio of circle.
     */
    public Circle(final double radio) {
        this.radio = radio;
    }

    /**
     * Get the Pi.
     * @return Pi number;
     */
    public double getPi() {
        return pi;
    }

    /**
     * GetRadio.
     * @return Radio of circle.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * SetRadio.
     * @param radio set new value of Radio.
     */
    public void setRadio(final double radio) {
        this.radio = radio;
    }

    /**
     * CalculateArea.
     * @return Return the calculated area.
     */
    @Override
    public double calculateArea() {
        int exp = 2;
        return roundNumber(this.pi * Math.pow(this.radio, exp));
    }

    /**
     * CalculatePerimeter.
     * @return the calculated perimeter.
     */
    @Override
    public double calculatePerimeter() {
        int exp = 2;
        return roundNumber((exp * this.pi) * this.radio);
    }

    /**
     * roundNumber.
     * @param formula get the formula to round
     * @return round of formula result.
     */
    public double roundNumber(final double formula) {
        final int porcentage = 100;
        return Math.round(formula * porcentage) / porcentage;
    }
}
