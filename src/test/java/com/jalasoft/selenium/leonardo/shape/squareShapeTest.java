package com.jalasoft.selenium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Automation on 3/6/2017.
 */
public class squareShapeTest {

    private static final int DELTA = 0;

    private baseShape square;

    @Before
    public void setUp(){
        //Given
        final double l = 5;
        square = new squareShape(l);
    }

    @Test
    /**nomenclatura 1*/
    public void testCalculateAreaWhen() {

        //when - action to test
        final double actualArea = square.calculateArea();

        //then - assertion
        final double expectedArea = 10;
        assertEquals(expectedArea, actualArea, DELTA);
    }

    @Test /**nomenclatura 2*/
    public void testCalculatePerimeterWhen() {

        //when - action to test
        final double actualPerimeter = square.calculatePerimeter();

        //then - assertion
        final double expectedPerimeter = 10;
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }

}