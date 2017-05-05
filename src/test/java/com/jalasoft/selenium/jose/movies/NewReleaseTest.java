package com.jalasoft.selenium.jose.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jose Rioja on 4/22/2017.
 */
public class NewReleaseTest {
    private static final int RENTAL_PERIOD = 1;
    private static final double DAILY_RENTAL_RATE = 3;
    private static final int FREQUENT_RENTER_POINTS = 1;
    private static final int FREQUENT_RENTER_BONUS = 1;
    private static final int DELTA = 0;
    private static final int ONE_EXTRA_DAY = 1;
    private static final int TWENTY_EXTRA_DAYS = 20;

    private Movie newRelease;

    /**
     * Creates a New Release movie object.
     */
    @Before
    public void setUp() {
        // Given
        newRelease = new NewRelease("New Release movie");
    }

    /**
     * It should return the base rental fee when the movie is rented for the same days than the minimum.
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
     * It should return the base rental fee when the movie is rented for 1 extra day.
     */
    @Test
    public void calculateAmountFor1ExtraDayRental() {
        calculateAmountForExtraRentalDays(ONE_EXTRA_DAY);
    }

    /**
     * It should return the base rental fee when the movie is rented for 20 extra days.
     */
    @Test
    public void calculateAmountFor20ExtraDaysRental() {
        calculateAmountForExtraRentalDays(TWENTY_EXTRA_DAYS);
    }

    /**
     * This method execute the tests for extra rental days.
     * @param extraDays Extra rental days.
     */
    private void calculateAmountForExtraRentalDays(final int extraDays) {
        // Given
        final int daysRented = RENTAL_PERIOD + extraDays;

        // When
        final double actualAmount = newRelease.calculateAmount(daysRented);

        // Then
        final double expectedAmount = daysRented * DAILY_RENTAL_RATE;
        assertEquals(expectedAmount, actualAmount, DELTA);
    }

    /**
     * It should return the frequent renter points when the movie is rented with less days than the minimum.
     */
    @Test
    public void calculateFrequentRenterPointsWhenRentalPeriodIsLessThanTheMinimum() {
        // Given
        final int daysRented = RENTAL_PERIOD - 1;

        // When
        final int actualFrequentRenterPoints = newRelease.calculateFrequentRenterPoints(daysRented);

        // Then
        final int expectedFrequentRenterPoints = FREQUENT_RENTER_POINTS;
        assertEquals(expectedFrequentRenterPoints, actualFrequentRenterPoints, DELTA);
    }

    /**
     * It should return the frequent renter points when the movie is rented for the same days than the minimum.
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
     * It should return the frequent renter points plus a bonus when the movie is rented for more days
     * than the minimum, this test is for 1 more day.
     */
    @Test
    public void calculateFrequentRenterPointsFor1ExtraDay() {
        calculateFrequentRenterPointsWithBonus(ONE_EXTRA_DAY);
    }

    /**
     * It should return the frequent renter points plus a bonus when the movie is rented for more days
     * than the minimum, this test is for 20 more day.
     */
    @Test
    public void calculateFrequentRenterPointsFor20ExtraDay() {
        calculateFrequentRenterPointsWithBonus(TWENTY_EXTRA_DAYS);
    }

    /**
     * This method calculates the Frequent Renter Points with bonus for extra days.
     * @param extraDays Extra rental days.
     */
    private void calculateFrequentRenterPointsWithBonus(final int extraDays) {
        // Given
        final int daysRented = RENTAL_PERIOD + extraDays;

        // When
        final int actualFrequentRenterPoints = newRelease.calculateFrequentRenterPoints(daysRented);

        // Then
        final int expectedFrequentRenterPoints = FREQUENT_RENTER_POINTS + FREQUENT_RENTER_BONUS;
        assertEquals(expectedFrequentRenterPoints, actualFrequentRenterPoints, DELTA);
    }
}
