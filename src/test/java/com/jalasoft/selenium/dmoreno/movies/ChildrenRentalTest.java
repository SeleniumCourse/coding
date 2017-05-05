package com.jalasoft.selenium.dmoreno.movies;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 *
 */
public class ChildrenRentalTest {

    private static final int DEFAULT_DAYS_RENTED = 0;

    /**
     *
     */
    @Test
    public void getDaysRentedTest() {
        final int expectedDaysRented = 10;

        Rental rental = new ChildrenRental(null, expectedDaysRented);

        assertEquals(expectedDaysRented, rental.getDaysRented());
    }

    /**
     *
     */
    @Test
    public void getMovieTest() {
        final Movie expectedMovie = new Movie("");

        Rental rental = new ChildrenRental(expectedMovie, DEFAULT_DAYS_RENTED);

        assertEquals(expectedMovie, rental.getMovie());
    }

    /**
     *
     */
    @Test
    public void getFrequentRenterPointsTest() {
        final int expectedFrequentRenterPoints = 0;

        Rental rental = new ChildrenRental(null, DEFAULT_DAYS_RENTED);

        assertEquals(expectedFrequentRenterPoints, rental.getFrequentRenterPoints());
    }

    /**
     *
     */
    @Test
    public void calculateRentalAmountWhenDaysRentedIsGreaterThanRentedDaysLimitTest() {
        final int daysRented = 5;
        final double expectedRentalAmount = 4.5;

        Rental rental = new ChildrenRental(null, daysRented);

        assertEquals(expectedRentalAmount, rental.calculateRentalAmount());
    }

    /**
     *
     */
    @Test
    public void calculateRentalAmountWhenDaysRentedIsLessThanRentedDaysLimitTest() {
        final int daysRented = 3;
        final double expectedRentalAmount = 1.5;

        Rental rental = new ChildrenRental(null, daysRented);

        assertEquals(expectedRentalAmount, rental.calculateRentalAmount());
    }
}
