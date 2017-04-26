package com.jalasoft.selenium.giovanny.shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for Circle Test.
 *
 * @author      Giovanny Uscamaita
 * @version     2.0, 4/24/2017
 */
public class SquareTest {

    private static final int DELTA = 16;

    private IShape square;

    /**
     * Method that sets the prerequisites for the test.
     */
    @Before
    public void setUp() {

        //Given a side of 4
        final int side = 4;
        square = new Square(side);
    }

    /**
     * Method that tests the calculateArea method.
     */
    @Test
    public void testCalculateSquareAreaWhen() {

        //When
        final double actualArea = square.calculateArea();


        //Then
        final double expectedArea = 16;
        assertEquals(expectedArea, actualArea, DELTA);

    }

    /**
     * Method that tests the calculatedPerimeter method.
     */
    @Test
    public void testCalculateSquarePerimeterWhen() {

        //When
        final double actualPerimeter = square.calculatePerimeter();


        //Then
        final double expectedPerimeter = 16;
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);

    }
}
