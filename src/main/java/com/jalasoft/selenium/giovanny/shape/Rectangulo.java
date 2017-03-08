package com.jalasoft.selenium.giovanny.shape;

/**
 * Created by xianqe on 3/3/2017.
 */
public class Rectangulo implements FiguraGeometrica {
    private double base;
    private double altura;
    private double areaRectangulo;
    private double perimetroRectangulo;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAreaRectangulo() {
        return areaRectangulo;
    }

    @Override
    public void area() {
        areaRectangulo = base * altura;
    }

    public void perimetro()
    {
        perimetroRectangulo = (2 * base) + (2 * altura);
    }

}