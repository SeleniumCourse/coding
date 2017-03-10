package com.jalasoft.selenium.daniel.jauregui.shapes;

/**
 * Circle Class.
 * @author Daniel Jauregui
 */
public class Circle extends Shape {
    private double radio;
    /**
     * Constructor.
     * @param radio will get the radio of circle.
     */
    Circle(final double radio) {
        this.radio = radio;
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
        return roundNumber(Math.PI * Math.pow(this.radio, exp));
    }

    /**
     * CalculatePerimeter.
     * @return the calculated perimeter.
     */
    @Override
    public double calculatePerimeter() {
        int exp = 2;
        return roundNumber((exp * Math.PI) * this.radio);
    }

    /**
     * roundNumber.
     * @param formula get the formula to round
     * @return round of formula result.
     */
    public double roundNumber(final double formula) {
        final double porcentage = 100;
        return Math.round(formula * porcentage) / porcentage;
    }
}
