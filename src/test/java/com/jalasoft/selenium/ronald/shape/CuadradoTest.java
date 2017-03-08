package com.jala.selenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author bsronald on 3/6/17.
 */
public class CuadradoTest {

    private AbstractFigure square;
    private static final float DELTA = 0;


    @Before
    public void setUp() {

        //Given
        final float lado = 5;
        square = new Cuadrado(lado);
    }
    @Test
    public void testSquareCalculateArea() {

        // When
        final float actualArea = square.calculateArea();

        // Then
        final float expectedArea = 25;
        Assert.assertEquals(expectedArea, actualArea, DELTA);

    }

    @Test
    public void testSquareCalculatePerimeter() {

        // When
        final float actualPerimeter = square.calculatePerimetro();

        // Then
        final float expectedPerimeter = 20;
        Assert.assertEquals(expectedPerimeter, actualPerimeter, DELTA);

    }

}