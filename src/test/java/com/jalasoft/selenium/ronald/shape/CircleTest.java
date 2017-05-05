package com.jalasoft.selenium.ronald.shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * CircleTest class.
 * @author bsronald on 3/3/17.
 */
public class CircleTest {

    private static final float DELTA = 0;
    private AbstractFigure circle;

    /**
     * Set up environment.
     */
    @Before
    public void setUp() {

        //Given
        final float radio = 5;
        circle = new Circle(radio);
    }

    /**
     * Test: calculate area.
     */
    @Test
    public void testCircleArea() {

        // When
        final float actualArea = circle.calculateArea();

        // Then
        final float expectedArea = (float) 78.53982;
        assertEquals(expectedArea, actualArea, DELTA);
    }

    /**
     * Test calculate perimeter.
     */
    @Test
    public void testCirclePerimeter() {

        // When
        final float actualPerimeter = circle.calculatePerimeter();

        // Then
        final float expectedArea = (float) 31.415926;
        assertEquals(expectedArea, actualPerimeter, DELTA);
    }
}
