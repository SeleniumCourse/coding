package com.jalasoft.selenium.ronald.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * SquareTest class.
 * @author bsronald on 3/6/17.
 */
public class SquareTest {

    private AbstractFigure square;
    private static final float DELTA = 0;

    /**
     * Set up environment.
     */
    @Before
    public void setUp() {

        //Given
        final float side = 5;
        square = new Square(side);
    }

    /**
     * Test: calculate area.
     */
    @Test
    public void testSquareCalculateArea() {

        // When
        final float actualArea = square.calculateArea();

        // Then
        final float expectedArea = 25;
        Assert.assertEquals(expectedArea, actualArea, DELTA);
    }

    /**
     * Test calculate perimeter.
     */
    @Test
    public void testSquareCalculatePerimeter() {

        // When
        final float actualPerimeter = square.calculatePerimeter();

        // Then
        final float expectedPerimeter = 20;
        Assert.assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }
}
