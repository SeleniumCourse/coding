package com.jalasoft.selenium.jose.shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jose Rioja on 4/23/2017.
 */
public class RectangleTest {

    private static final double DELTA = 0;
    private static final int BASE = 3;
    private static final int HEIGHT = 2;

    private Shape rectangle;

    /**
     * Creates a rectangle object.
     */
    @Before
    public void setUp() {
        // Given
        rectangle = new Rectangle(BASE, HEIGHT);
    }

    /**
     * It should return the area of a rectangle when its base and height are positive values.
     */
    @Test
    public void calculateAreaWhenBaseAndHeightArePositiveNumbers() {
        // When
        final double actualArea = rectangle.calculateArea();

        // Then
        final double expectedArea = BASE * HEIGHT;
        assertEquals(expectedArea, actualArea, DELTA);
    }

    /**
     * It should return the perimeter of a rectangle when its base and height are positive values.
     */
    @Test
    public void calculatePerimeterWhenBaseAndHeightArePositiveValues() {
        // When
        final double actualPerimeter = rectangle.calculatePerimeter();

        // Then
        final double expectedPerimeter = 2 * (BASE + HEIGHT);
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }

}
