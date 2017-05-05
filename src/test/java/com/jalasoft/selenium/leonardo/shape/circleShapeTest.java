package com.jalasoft.selenium.leonardo.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Automation on 3/3/2017.
 */
public class circleShapeTest {

    private static final int DELTA = 0;

    private baseShape circle;

    /**
     *
     */
    @Before
    public void setUp() {
        //Given
        final int radio = 5;
        circle = new circleShape(radio);
    }

    /**
     *
     */
    @Test /**nomenclatura 1*/
    public void testCalculateAreaWhen() {

        //when - action to test
        final double actualArea = circle.calculateArea();

        //then - assertion
        final double expectedArea = 78.5;
        assertEquals(expectedArea, actualArea, DELTA);
    }

    /**
     *
     */
    @Test /**nomenclatura 2*/
    public void test_calculatePerimeter_when() {

        //when - action to test
        final double actualPerimeter = circle.calculatePerimeter();

        //then - assertion
        final double expectedPerimeter = 31.400000000000002;
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }
}