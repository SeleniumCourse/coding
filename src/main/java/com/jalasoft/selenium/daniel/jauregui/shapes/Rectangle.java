package com.jalasoft.selenium.daniel.jauregui.shapes;

/**
 * Rectangle Class.
 * @author Daniel Jauregui
 */
public class Rectangle extends Shape {
    private final double altura;
    private final double longitud;

    /**
     * Constructor.
     * @param altura the Height of shape .
     * @param longitud the length of shape.
     */
    public Rectangle(final double altura, final double longitud) {
        super();
        this.altura = altura;
        this.longitud = longitud;
    }

    /**
     * calculateArea.
     * @return calculated Area
     */
    @Override
    public double calculateArea() {
        return roundNumber(this.altura * this.longitud);
    }

    /**
     * calculatePerimeter.
     * @return calculated Perimeter
     */
    @Override
    public double calculatePerimeter() {
        int base = 2;
        return roundNumber((base * this.altura) + (base * this.longitud));
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
