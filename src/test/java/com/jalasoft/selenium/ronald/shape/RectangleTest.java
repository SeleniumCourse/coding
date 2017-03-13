package com.jalasoft.selenium.ronald.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * RectangleTest class.
 * @author bsronald on 3/6/17.
 */
public class RectangleTest {

    private static final float DELTA = 0;
    private AbstractFigure rectangle;

    /**
     * Set up environment.
     */
    @Before
    public void setUp() {
        // Given
        final float base = 5;
        final float length = 3;
        rectangle = new Rectangle(base, length);

    }


    /**
     * Test: calculate area.
     */
    @Test
    public void testRectangleCalculateArea() {

        // When
        float actualArea = rectangle.calculateArea();

        //Then
        final float expectedArea = 15;
        Assert.assertEquals(expectedArea, actualArea, DELTA);
    }

    /**
     * Test calculate perimeter.
     */
    @Test
    public void testRectangleCalculatePerimeter() {

        // When
        float actualPerimeter = rectangle.calculatePerimeter();

        //Then
        final float expectedPerimeter = 16;
        Assert.assertEquals(actualPerimeter, expectedPerimeter, DELTA);
    }


}
