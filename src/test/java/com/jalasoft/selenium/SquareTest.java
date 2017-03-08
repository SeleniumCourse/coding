package com.jalasoft.selenium;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Daniel Moreno on 3/3/2017.
 */
public class SquareTest {

    private IShape square;

    @Before
    public void setUp(){
        // Given
        final int side = 2;
        square = new Square(side);
    }

    @Test
    public void test_calculatePerimeter_when(){
        //When
        double actualPerimeter = square.calculatePerimeter();

        //Then
        final double expectedPerimeter = 8.0;
        assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    public void test_calculateArea_when(){
        //When
        double actualArea = square.calculateArea();

        //Then
        final double expectedArea = 4.0;
        assertEquals(expectedArea, actualArea);
    }
}
