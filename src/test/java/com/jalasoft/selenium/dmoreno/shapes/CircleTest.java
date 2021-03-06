package com.jalasoft.selenium.dmoreno.shapes;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 *
 */
public class CircleTest {

    private IShape shape;

    /**
     *
     */
    @Before
    public void setUp() {
        final int radius = 10;
        shape = new Circle(radius);
    }

    /**
     *
     */
    @Test
    public void testCalculateAreaWhen() {
        double actualArea = shape.calculateArea();

        final double expectedArea = 314.1592653589793;
        assertEquals(expectedArea, actualArea);
    }

    /**
     *
     */
    @Test
    public void testCalculatePerimeterWhen() {
        double actualPerimeter = shape.calculatePerimeter();

        final double expectedPerimeter = 62.83185307179586;
        assertEquals(expectedPerimeter, actualPerimeter);
    }
}
