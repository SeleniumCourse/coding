package com.jalasoft.selenium.giovanny.shape;

/**
 * Created by xianqe on 3/3/2017.
 */
public class Circulo implements FiguraGeometrica
{
    private double radio;
    private double areaRadio;
    private double perimetroRadio;
    static final double pi = 3.1415;

    public Circulo(double radio)
    {
        this.radio = radio;
    }

    public double getRadio()
    {
        return radio;
    }

    public void setRadio(double radio)
    {
        this.radio = radio;
    }

    public double getAreaRadio()
    {
        return areaRadio;
    }

    public double getPerimetroRadio()
    {
        return perimetroRadio;
    }

    public void area()
    {
        areaRadio = pi * radio * radio;
    }

    public void perimetro()
    {
        perimetroRadio = 2 * pi * radio;
    }
}
