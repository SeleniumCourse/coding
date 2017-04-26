package com.jalasoft.selenium.giovanny.shape;

import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.PI;
import static org.junit.Assert.assertEquals;

/**
 * Test class for Circle Test.
 *
 * @author      Giovanny Uscamaita
 * @version     2.0, 4/24/2017
 */
public class CircleTest {

    private static final double DELTA = PI * 25;

    private static final double GAMMA = 2 * PI * 5;

    private IShape circle;

    /**
     * Method that sets the prerequisites for the test.
     */
    @Before
    public void setUp() {

        //Given a Circle radio of 5
        final int radio = 5;
        circle = new Circle(radio);
    }

    /**
     * Method that tests the calculateArea method.
     */
    @Test
    public void testCalculateCircleAreaWhen() {

        //When
        final double actualArea = circle.calculateArea();


        //Then
        final double expectedArea = 25 * PI;
        assertEquals(expectedArea, actualArea, DELTA);

    }

    /**
     * Method that tests the calculatedPerimeter method.
     */
    @Test
    public void testCalculateCirclePerimeterWhen() {

        //When
        final double actualPerimeter = circle.calculatePerimeter();


        //Then
        final double expectedPerimeter = 2 * PI * 5;
        assertEquals(expectedPerimeter, actualPerimeter, GAMMA);

    }
}
