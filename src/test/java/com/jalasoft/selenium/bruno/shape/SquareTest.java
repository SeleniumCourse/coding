package com.jalasoft.selenium.bruno.shape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Bruno Barrios on 3/6/2017.
 */
public class SquareTest {


    private Shape rectangle;

    /**
     * This test verifies if square area is 30.
     */
    @Test
    public void tetsCalculateAreaWhen() {

        //Given
        rectangle = new Rectangle(RectangleTest.FIVE, RectangleTest.SIX);

        //When
        final double actualArea = rectangle.calculateArea();
        final double expectedArea = 30;

        //then

        assertEquals(expectedArea, actualArea, RectangleTest.DELTA);
    }

    /**
     * This test verifies if square perimeter is 6.0.
     */
    @Test
    public void testCalculatePerimeterWhen() {

        //Given
        rectangle = new Rectangle(RectangleTest.ONE, RectangleTest.SIX);

        //When
        final double actualPerimeter = rectangle.calculateArea();
        final double expectePerimeter = 6.0;

        //then
        assertEquals(expectePerimeter, actualPerimeter, RectangleTest.DELTA);
    }
}
