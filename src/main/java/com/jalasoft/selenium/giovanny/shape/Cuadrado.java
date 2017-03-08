package com.jalasoft.selenium.giovanny.shape;

/**
 * Created by xianqe on 3/3/2017.
 */
public class Cuadrado extends Rectangulo
{
    private double lado;
    private double areaCuadrado;
    private double perimetroCuadrado;

    public Cuadrado(double lado)
    {
        super (double base,double altura)
        this.lado = lado;
    }
    public double getLado()
    {
        return lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }

    public double getareaCuadrado()
    {
        return areaCuadrado;
    }

    @Override
    public void area()
    {
        areaCuadrado = lado * lado;
    }
    public void perimetro()
    {
        perimetroCuadrado = 4 * lado;
    }
}
