package com.jalasoft.selenium.ariel.shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xain on 3/3/2017.
 */
public class CircleTest {

    private static final double DELTA = 0;
    private static final int RADIUS = 5;

    private Shape circle;

    /**
     * Creates a circle object.
     */
    @Before
    public void setUp() {
        // Given
        circle = new Circle(RADIUS); // Always instantiate through the abstract class
    }

    /**
     * Should return the area of the circle when a positive radius is supplied.
     */
    @Test
    public void testCalculateAreaWhenRadiusIsPositive() {
        // When
        final double actualArea = circle.calculateArea();

        // Then
        final double expectedArea = Math.PI * Math.pow(RADIUS, 2);
        assertEquals(expectedArea, actualArea, DELTA);
    }

    /**
     * Should return the perimeter of the circle when a positive radius is supplied.
     */
    @Test
    public void testCalculatePerimeterWhenRadiusIsPositive() {
        // When
        final double actualPerimeter = circle.calculatePerimeter();

        // Then
        final double expectedPerimeter = 2 * Math.PI * RADIUS;
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }

}
