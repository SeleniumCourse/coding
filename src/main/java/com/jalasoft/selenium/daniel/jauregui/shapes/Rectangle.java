package com.jalasoft.selenium.daniel.jauregui.shapes;

public class Rectangle extends Shape{
    private double altura;
    private double longitud;
    
    public Rectangle(double altura, double longitud) {
        super();
        this.altura = altura;
        this.longitud = longitud;
    }

    @Override
    public double calculateArea(){
        return Math.round((this.altura * this.longitud) * 100.0) / 100.0;
    }
    
    @Override
    public double calculatePerimeter(){
        return Math.round(((2*this.altura) + (2*this.longitud)) * 100.0) / 100.0;
    }
}
