package com.jalasoft.selenium.dmoreno.shapes;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 *
 */
public class RectangleTest {

    private IShape shape;

    /**
     *
     */
    @Before
    public void setUp() {
        //Given
        final int width = 2;
        final int height = 2;

        shape = new Rectangle(width, height);
    }

    /**
     *
     */
    @Test
    public void testCalculatePerimeterWhen() {
        // When
        final double actualPerimeter = shape.calculatePerimeter();

        // Then
        final double expectedPerimeter = 8.0;
        assertEquals(expectedPerimeter, actualPerimeter);
    }

    /**
     *
     */
    @Test
    public void testCalculateAreaWhen() {
        // When
        final double actualArea = shape.calculateArea();

        // Then
        final double expectedArea = 4.0;
        assertEquals(expectedArea, actualArea);
    }
}
