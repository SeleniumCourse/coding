package com.jalasoft.selenium.jose.shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jose Rioja on 3/6/2017.
 */
public class CircleTest {

    private static final int DELTA = 0;
    private static final int RADIUS = 5;
    private Shape circle;

    /**
     * Creates a Circle object.
     */
    @Before
    public void setUp() {
        //Given
        circle = new Circle(RADIUS);  //Always instantiate through the abstract class
    }

    /**
     * It should return the area of a circle when a positive radius is provided.
     */
    @Test
    public void testCalculateAreaWhenTheRadiusIsPositive() {
        //When
        final double actualArea = circle.calculateArea();

        //Then
        final double expectedArea = Math.PI * RADIUS * RADIUS;
        assertEquals(expectedArea, actualArea, DELTA);
    }

    /**
     * It should return the perimeter of a circle when a positive radius is provided.
     */
    @Test
    public void testCalculatePerimeterWhenTheRadiusIsPositive() {
        //When
        final double actualPerimeter = circle.calculatePerimeter();

        //Then
        final double expectedPerimeter = 2 * Math.PI * RADIUS;
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }
}
