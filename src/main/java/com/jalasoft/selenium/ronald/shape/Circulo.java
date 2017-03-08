package com.jalasoft.selenium.ronald.shape;

/**
 * @author bsronald on 3/3/17.
 */
public class Circulo extends AbstractFigure {
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float calculatePerimetro() {
        perimetro = (float) (2 * Math.PI * radio);
        return perimetro;
    }

    public float calculateArea() {
        double value = (double) radio;
        area = (float) (Math.PI * value * value);
        return area;

    }

}
