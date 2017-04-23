package com.jalasoft.selenium.ariel.shape;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by xain on 3/6/2017.
 */
public class RectangleTest {

    private static final double DELTA = 0;
    private Shape rectangle;
    private static final int BASE = 3;
    private static final int HEIGHT = 2;

    /**
     * Creates a rectangle object.
     */
    @Before
    public void setUp() {
        // Given
        rectangle = new Rectangle(BASE, HEIGHT); // Always instantiate through the abstract class
    }


    /**
     * Should return the perimeter of the rectangle when its base and height properties are positive numbers.
     */
    @Test
    public void calculatePerimeterWhenBaseAndHeightArePositiveNumbers() {
        // When
        final double actualPerimeter = rectangle.calculatePerimeter();

        // Then
        final double expectedPerimeter = 2 * (BASE + HEIGHT);
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }

    /**
     * Should return the area of the rectangle when its base and height properties are positive numbers.
     */
    @Test
    public void calculateAreaPerimeterWhenBaseAndHeightArePositiveNumbers() {
        // When
        final double actualArea = rectangle.calculateArea();

        // Then
        final double expectedArea = BASE * HEIGHT;
        assertEquals(expectedArea, actualArea, DELTA);
    }

}
