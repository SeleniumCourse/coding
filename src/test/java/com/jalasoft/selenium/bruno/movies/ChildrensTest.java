package com.jalasoft.selenium.bruno.movies;

import com.jalasoft.selenium.bruno.Constants;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Bruno Barrios on 3/14/2017.
 */
public class ChildrensTest {

    private Movie movie;

    /**
     * This a setup for childrens tests.
     */
    @Before
    public void setUp() {
        movie = new Childrens("X-Men");
    }

    /**
     * This test will calculate charge rental days.
     */
    @Test
    public void testCalculateChargeMovieFor1DayRental() {
        final double expectedResult = 1.5;
        assertEquals(expectedResult, movie.calculateMovieAmount(Constants.ONE), Constants.DELTA);
    }

    /**
     * This test will calculate charge rental days.
     */
    @Test
    public void testCalculateChargeMovieFor7DayRental() {
        final double expectedResult = 6.0;
        assertEquals(expectedResult, movie.calculateMovieAmount(Constants.SEVEN), Constants.DELTA);
    }
}

