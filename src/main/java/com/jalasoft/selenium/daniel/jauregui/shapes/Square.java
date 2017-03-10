package com.jalasoft.selenium.daniel.jauregui.shapes;

/**
 * Square Class.
 * @author Daniel Jauregui
 */
public class Square extends Rectangle {
    private final double altura;

    /**
     * Constructor.
     * @param altura the Height of shape .
     */
    public Square(final double altura) {
        super(altura, altura);
        this.altura = altura;
    }

    /**
     * calculateArea.
     * @return calculated Area
     */
    @Override
    public double calculateArea() {
        return roundNumber(this.altura * this.altura);
    }

    /**
     * calculatePerimeter.
     * @return calculated Perimeter
     */
    @Override
    public double calculatePerimeter() {
        int base = 2;
        return roundNumber((base * this.altura) + (base * this.altura));
    }

    /**
     * roundNumber.
     * @param formula get the formula to round
     * @return round of formula result.
     */
    @Override
    public double roundNumber(final double formula) {
        final int porcentage = 100;
        return Math.round(formula * porcentage) / porcentage;
    }
}
