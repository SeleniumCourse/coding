package com.jalasoft.selenium.dmoreno.movies;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 *
 */
public class NewReleaseRentalTest {

    private static final int DEFAULT_DAYS_RENTED = 0;

    /**
     *
     */
    @Test
    public void getDaysRentedTest() {
        final int expectedDaysRented = 10;

        Rental rental = new NewReleaseRental(null, expectedDaysRented);

        assertEquals(expectedDaysRented, rental.getDaysRented());
    }

    /**
     *
     */
    @Test
    public void getMovieTest() {
        final Movie expectedMovie = new Movie("");

        Rental rental = new NewReleaseRental(expectedMovie, DEFAULT_DAYS_RENTED);

        assertEquals(expectedMovie, rental.getMovie());
    }

    /**
     *
     */
    @Test
    public void getFrequentRenterPointsWhenDaysRentedIsGreaterThanRequiredDaysRentedTest() {
        final int daysRented = 2;
        final int expectedFrequentRenterPoints = 1;

        Rental rental = new NewReleaseRental(null, daysRented);

        assertEquals(expectedFrequentRenterPoints, rental.getFrequentRenterPoints());
    }

    /**
     *
     */
    @Test
    public void getFrequentRenterPointsWhenDaysRentedIsLessThanRequiredDaysRentedTest() {
        final int daysRented = 1;
        final int expectedFrequentRenterPoints = 0;

        Rental rental = new NewReleaseRental(null, daysRented);

        assertEquals(expectedFrequentRenterPoints, rental.getFrequentRenterPoints());
    }

    /**
     *
     */
    @Test
    public void calculateRentalAmountWhenDaysRentedIsGreaterThanDaysRentedLimitTest() {
        final int daysRented = 2;
        final double expectedRentalAmount = 2;

        Rental rental = new NewReleaseRental(null, daysRented);

        assertEquals(expectedRentalAmount, rental.calculateRentalAmount());
    }
}
