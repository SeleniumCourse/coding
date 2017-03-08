package com.jalasoft.selenium.Ariel.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xain on 3/3/2017.
 */
public class CircleTest {

    private final double DELTA = 0;
    private final double PI = 3.14;
    final int radius = 5;

    private Shape circle;

    @Before
    public void setUp() {
        // Given
        circle = new Circle(radius); // Always instanciate through the abstract class
    }

    @Test
    public void test_calculateArea_when() {
        // When
        final double actualArea = circle.calculateArea();

        // Then
        final double expectedArea = PI * Math.pow(radius, 2);
        assertEquals(expectedArea, actualArea, DELTA);
    }

    @Test
    public void test_calculatePerimeter_when() {
        // When
        final double actualPerimeter = circle.calculatePerimeter();

        // Then
        final double expectedPerimeter = 2 * PI * radius;
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }

}