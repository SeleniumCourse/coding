package com.jalasoft.selenium.daniel.jauregui.shapes;

import com.jalasoft.selenium.daniel.jauregui.shapes.Circle;
import com.jalasoft.selenium.daniel.jauregui.shapes.iShape;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel jauregui
 */
public class CirculoTest {
    
    private iShape instance;
    private final double DELTA = 0.0;
    
    public CirculoTest() {
    }
    
    @Before
    public void setUp() {
        //Given
        final double radio = 5.2;
        instance = new Circle(radio);
        
    }

    /**
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateArea() {
        // When
        final double result = instance.calculateArea();

        //Then
        System.out.println("calculateArea");
        final double expResult = 84.95;
        assertEquals(expResult, result, DELTA);
    }

    @Test
    public void testCalculatePerimeter() {
        // When
        final double result = instance.calculatePerimeter();

        //Then
        System.out.println("calculatePerimeter");
        final double expResult = 32.67;
        assertEquals(expResult, result, DELTA);
    }
}
