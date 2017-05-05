package com.jalasoft.selenium.jose.shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jose Rioja on 4/23/2017.
 */
public class SquareTest {

    private static final double DELTA = 0;
    private static final int SIDE = 4;

    private Shape square;

    /**
     * Creates a square object.
     */
    @Before
    public void setUp() {
        // Given
        square = new Square(SIDE);
    }

    /**
     * It should return the area of a square when its sides are positive values.
     */
    @Test
    public void calculateAreaWhenSideIsPositiveValue() {
        // When
        final double actualArea = square.calculateArea();

        // Then
        final double expectedArea = SIDE * SIDE;
        assertEquals(expectedArea, actualArea, DELTA);
    }

    /**
     * It should return the perimeter of a square when its sides are positive values.
     */
    @Test
    public void calculatePerimeterWhenSideIsPositiveValue() {
        // When
        final double actualPerimeter = square.calculatePerimeter();

        // Then
        final double expectedPerimeter = 2 * (SIDE + SIDE);
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }

}
