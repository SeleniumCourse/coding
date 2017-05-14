package com.jalasoft.selenium.leonardo.shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Automation on 3/6/2017.
 */
public class rectangleShapeTest {

    private static final int DELTA = 0;

    private baseShape rectangle;

    /**
     *
     */
    @Before
    public void setUp() {
        //Given
        final double l = 5;
        final double w = 7;
        rectangle = new rectangleShape(l, w);
    }

    /**
     *
     */
    @Test /**nomenclatura 1*/
    public void testCalculateAreaWhen() {

        //when - action to test
        final double actualArea = rectangle.calculateArea();

        //then - assertion
        final double expectedArea = 35;
        assertEquals(expectedArea, actualArea, DELTA);
    }

    /**
     *
     */
    @Test /**nomenclatura 2*/
    public void testCalculatePerimeterWhen() {

        //when - action to test
        final double actualPerimeter = rectangle.calculatePerimeter();

        //then - assertion
        final double expectedPerimeter = 24;
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }
}