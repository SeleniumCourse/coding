package com.jalasoft.selenium.shapes;

public class Square extends Rectangle {
    private double altura;

    public Square(double altura){
        super(altura,altura);
        this.altura = altura;
    }
    
    @Override
    public double calculateArea(){
        return Math.round((Math.pow(this.altura, 2)) * 100.0) / 100.0;
    }
    
    @Override
    public double calculatePerimeter(){
        return Math.round((((2*this.altura) + (2*this.altura))) * 100.0) / 100.0;
    }
}
