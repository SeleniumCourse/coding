package com.jalasoft.selenium.bruno.movies;

import org.junit.Before;
import org.junit.Test;

import static com.jalasoft.selenium.bruno.Constants.DELTA;
import static com.jalasoft.selenium.bruno.Constants.THREE;
import static com.jalasoft.selenium.bruno.Constants.ONE;
import static com.jalasoft.selenium.bruno.Constants.NINE;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by Bruno Barrios on 3/14/2017.
 */
public class RegularTest {
    private Movie movie;

    /**
     * This test will be used as a setup for regular tests.
     */
    @Before
    public void setUp() {
        movie = new NewRelease("Rocky I");
    }

    /**
     * This test will calculate charge rental days.
     */
    @Test
    public void testCalculateRegularMovieFor1DayRental() {
        final double expectedResult = THREE;
        assertEquals(expectedResult, movie.calculateMovieAmount(ONE), DELTA);
    }

    /**
     * This test will calculate charge rental days.
     */
    @Test
    public void testCalculateRegularMovieFor9DayRental() {
        final double expectedResult = 27;
        assertEquals(expectedResult, movie.calculateMovieAmount(NINE), DELTA);
    }
}
