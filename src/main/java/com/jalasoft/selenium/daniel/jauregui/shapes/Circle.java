package com.jalasoft.selenium.daniel.jauregui.shapes;

public class Circle extends Shape {
    private double Pi;
    private double radio;
    
    public Circle(double radio){
        this.Pi = 3.1416;
        this.radio = radio;
    }    

    public double getPi() {
        return Pi;
    }

    public void setPi(double Pi) {
        this.Pi = Pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double calculateArea(){
        return Math.round((this.Pi * Math.pow(this.radio, 2)) * 100.0) / 100.0;
    }
    
    @Override
    public double calculatePerimeter(){
        return Math.round(((2 * this.Pi) * this.radio) * 100.0) / 100.0;  
    }
}