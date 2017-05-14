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
public class RectangleTest {

    private static final int AREA = 20;

    private static final int PERIMETER = 18;

    private IShape rectangle;

    /**
     * Method that sets the prerequisites for the test.
     */
    @Before
    public void setUp() {

        //Given a base 4 and a height 5
        final int base = 2;
        final int height = 3;
        rectangle = new Rectangle(base, height);
    }

    /**
     * Method that tests the calculateArea method.
     */
    @Test
    public void testCalculateRectangleAreaWhen() {

        //When
        final double actualArea = rectangle.calculateArea();


        //Then
        final double expectedArea = 20;
        assertEquals(expectedArea, actualArea, AREA);

    }

    /**
     * Method that tests the calculatedPerimeter method.
     */
    @Test
    public void testCalculateRectanglePerimeterWhen() {

        //When
        final double actualPerimeter = rectangle.calculatePerimeter();


        //Then
        final double expectedPerimeter = 18;
        assertEquals(expectedPerimeter, actualPerimeter, PERIMETER);

    }

}
