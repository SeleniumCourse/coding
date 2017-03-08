package com.jalasoft.selenium.ronald.shape;

/**
 * @author bsronald on 3/3/17.
 */
public class Rectangulo extends AbstractFigure {

    protected float base;
    protected float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;

    }
    public float calculatePerimetro() {
        perimetro = (2*altura) + (2*base);
        return perimetro;

    }

    public float calculateArea() {
        area = base * altura;
        return area;

    }
}
