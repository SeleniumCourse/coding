package com.jalasoft.selenium.ariel.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xain on 3/15/2017.
 */
public class NewReleaseTest {

    private static final int RENTAL_PERIOD = 1;
    private static final double DAILY_RENTAL_RATE = 3;
    private static final int FREQUENT_RENTER_POINTS = 1;
    private static final int FREQUENT_RENTER_BONUS = 1;
    public static final int DELTA = 0;

    private Movie newRelease;

    /**
     * Creates a new release movie object.
     */
    @Before
    public void setUp() {
        // Given
        newRelease = new NewRelease("A new released movie");

    }

    /**
     * Should return the rental fee when the movie is rented for the minimum RENTAL PERIOD.
     */
    @Test
    public void calculateAmountWhenRentalPeriodIsEqualThanTheMinimum() {
        // When
        final double actualAmount = newRelease.calculateAmount(RENTAL_PERIOD);

        // Then
        final double expectedAmount = RENTAL_PERIOD * DAILY_RENTAL_RATE;
        assertEquals(expectedAmount, actualAmount, DELTA);
    }

    /**
     * Should return the rental fee when the movie is rented for more days than the minimum.
     */
    @Test
    public void calculateAmountWhenRentalPeriodIsGreaterThanTheMinimum() {
        // Given
        final int daysRented = RENTAL_PERIOD + 1;

        // When
        final double actualAmount = newRelease.calculateAmount(daysRented);

        // Then
        final double expectedAmount = daysRented * DAILY_RENTAL_RATE;
        assertEquals(expectedAmount, actualAmount, DELTA);
    }

    /**
     * Should return the frequent renter points when the movie is rented for the minimum RENTAL PERIOD.
     */
    @Test
    public void calculateFrequentRenterPointsWhenRentalPeriodIsEqualThanTheMinimum() {
        // When
        final int actualFrequentRenterPoints = newRelease.calculateFrequentRenterPoints(RENTAL_PERIOD);

        // Then
        final int expectedFrequentRenterPoints = FREQUENT_RENTER_POINTS;
        assertEquals(expectedFrequentRenterPoints, actualFrequentRenterPoints, DELTA);
    }

    /**
     * Should return the frequent renter points plus a bonus when the movie is rented for the minimum RENTAL PERIOD.
     */
    @Test
    public void calculateFrequentRenterPointsWhenRentalPeriodIsGreaterThanTheMinimum() {
        // Given
        final int daysRented = RENTAL_PERIOD + 1;

        // When
        final int actualFrequentRenterPoints = newRelease.calculateFrequentRenterPoints(daysRented);

        // Then
        final int expectedFrequentRenterPoints = FREQUENT_RENTER_POINTS + FREQUENT_RENTER_BONUS;
        assertEquals(expectedFrequentRenterPoints, actualFrequentRenterPoints, DELTA);
    }
}
