package com.jala.selenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author bsronald on 3/6/17.
 */
public class RectangleTest {

    private static final float DELTA = 0;
    private AbstractFigure rectangle;

    @Before
    public void setUp() {
        // Given
        final float base = 5;
        final float altura = 3;
        rectangle = new Rectangulo(base, altura);

    }


    @Test
    public void testRectangleCalculateArea() {

        // When
        float actualArea = rectangle.calculateArea();

        //Then
        final float expectedArea = 15;
        Assert.assertEquals(expectedArea, actualArea, DELTA);

    }

    @Test
    public void testRectangleCalculatePerimeter() {

        // When
        float actualPerimetro = rectangle.calculatePerimetro();

        //Then
        final float expectedPerimetro = 16;
        Assert.assertEquals(actualPerimetro, expectedPerimetro, DELTA);
    }


}
