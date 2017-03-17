package com.jalasoft.selenium.daniel.jauregui.shapes;

/**
 * ShapesCalculator.
 * @author Daniel Jauregui
 */
class ShapesCalculator {
    /**
     * Constructor.
     */
    public void shapescalculator() {
        // Nothing to do
    }
    /**
     * Main of Application.
     * @param args that initial method will have.
     */
    public static void main(final String[] args) {
        final double radio = 5.2;
        ShapeInt c = new Circle(radio);
        System.out.print(" ===> El Area del Circulo es: " + c.calculateArea());
    }
}
