package com.jalasoft.selenium.daniel.jauregui.shapes;

import com.jalasoft.selenium.daniel.jauregui.shapes.Rectangle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.jalasoft.selenium.daniel.jauregui.shapes.ShapeInt;

/**
 *
 * @author daniel jauregui
 */
public class RectanguloTest {
    
    private ShapeInt instance;
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
