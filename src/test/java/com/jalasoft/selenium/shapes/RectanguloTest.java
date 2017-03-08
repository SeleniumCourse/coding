package com.jalasoft.selenium.shapes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel jauregui
 */
public class RectanguloTest {
    
    private iShape instance;
    private final double DELTA = 0.0;
    
    public RectanguloTest() {
    }
    
    @Before
    public void setUp() {
        //Given
        final double altura = 5.2;
        final double longitud = 6.3;
        instance = new Rectangle(altura, longitud);
    }
    
    /**
     * Test of calculateArea method, of class Rectangle.
     */
    @Test
    public void testCalculateArea() {
        // When
        final double result = instance.calculateArea();

        //Then
        System.out.println("calculateArea");
        final double expResult = 32.76;
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Test of calculatePerimeter method, of class Rectangle.
     */
    @Test
    public void testCalculatePerimeter() {
        // When
        final double result = instance.calculatePerimeter();

        //Then
        System.out.println("calculatePerimeter");
        final double expResult = 23;
        assertEquals(expResult, result, DELTA);
    }
    
}
