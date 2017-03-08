/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jalasoft.selenium.daniel.jauregui.shapes;

/**
 *
 * @author Daniel Jauregui
 */
public class Main {
    
    public static void main(String[] args) {
        iShape c = new Circle(5.2);
        System.out.print(" ===> El Area del Circulo es: " + c.calculateArea());
    }
}
