package com.jalasoft.selenium.dmoreno.movies;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 *
 */
public class RegularRentalTest {

    private static final int DEFAULT_DAYS_RENTED = 0;

    /**
     *
     */
    @Test
    public void getDaysRentedTest() {
        final int expectedDaysRented = 10;

        Rental rental = new RegularRental(null, expectedDaysRented);

        assertEquals(expectedDaysRented, rental.getDaysRented());
    }

    /**
     *
     */
    @Test
    public void getMovieTest() {
        final Movie expectedMovie = new Movie("");

        Rental rental = new RegularRental(expectedMovie, DEFAULT_DAYS_RENTED);

        assertEquals(expectedMovie, rental.getMovie());
    }

    /**
     *
     */
    @Test
    public void getFrequentRenterPointsTest() {
        final int expectedFrequentRenterPoints = 0;

        Rental rental = new RegularRental(null, DEFAULT_DAYS_RENTED);

        assertEquals(expectedFrequentRenterPoints, rental.getFrequentRenterPoints());
    }

    /**
     *
     */
    @Test
    public void calculateRentalAmountTest() {
        final int daysRented = 5;
        final double expectedRentalAmount = 15;

        Rental rental = new RegularRental(null, daysRented);

        assertEquals(expectedRentalAmount, rental.calculateRentalAmount());
    }
}
