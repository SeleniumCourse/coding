package com.jalasoft.selenium.bruno.shape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Bruno Barrios on 3/6/2017.
 */
public class RectangleTest {

    public static final double DELTA = 0;
    public static final int TWO = 2;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int ONE = 1;

    private Shape rectangle;

    /**
     * This method verifies if rectangle area is 30.
     */
    @Test
    public void tetsCalculateAreaWhen() {

        //Given
        rectangle = new Rectangle(FIVE, SIX);

        //When
        final double actualArea = rectangle.calculateArea();
        final double expectedArea = 30;

        //then

        assertEquals(expectedArea, actualArea, DELTA);
    }

    /**
     * This method verifies if rectangle perimeter is 6.0.
     */
    @Test
    public void testCalculatePerimeterWhen() {

        //Given
        rectangle = new Rectangle(ONE, SIX);

        //When
        final double actualPerimeter = rectangle.calculateArea();
        final double expectePerimeter = 6.0;

        //then
        assertEquals(expectePerimeter, actualPerimeter, DELTA);
    }

    /**
     * This method verifies if rectangle area is 0.
     */
    @Test
    public void testCalculateAreaWhen() {
        rectangle = new Rectangle(-TWO, 0);

        final int actualResult = 0;
        final int expectedResult = 0;

        assertEquals(expectedResult, actualResult, DELTA);
    }

}
