package com.jalasoft.selenium.jose.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jose Rioja on 4/22/2017.
 */
public class ChildrenTest {
    private static final double BASE_RENTAL_FEE = 1.5;
    private static final int RENTAL_PERIOD = 3;
    private static final double DAILY_RENTAL_RATE = 1.5;
    private static final int DELTA = 0;
    private static final int ONE_EXTRA_DAY = 1;
    private static final int TWENTY_EXTRA_DAYS = 20;

    private Movie children;

    /**
     * Creates a Children movie object.
     */
    @Before
    public void setUp() {
        // Given
        children = new Children("Children movie");
    }

    /**
     * It should return the base rental fee when the movie is rented for less days than the minimum.
     */
    @Test
    public void calculateAmountWhenRentalPeriodIsLessThanTheMinimum() {
        // Given
        final int daysRented = RENTAL_PERIOD - 1;

        // When
        final double actualAmount = children.calculateAmount(daysRented);

        // Then
        final double expectedAmount = BASE_RENTAL_FEE;
        assertEquals(expectedAmount, actualAmount, DELTA);
    }

    /**
     * It should return the base rental fee when the movie is rented for the same days than the minimum.
     */
    @Test
    public void calculateAmountWhenRentalPeriodIsEqualThanTheMinimum() {
        // When
        final double actualAmount = children.calculateAmount(RENTAL_PERIOD);

        // Then
        final double expectedAmount = BASE_RENTAL_FEE;
        assertEquals(expectedAmount, actualAmount, DELTA);
    }

    /**
     * It should return the base rental plus 1.5 per additional day if the movie is rented for more days
     * than the minimum, for this test is just for 1 extra day.
     */
    @Test
    public void calculateAmountFor1ExtraDayRental() {
        calculateAmountForExtraRentalDays(ONE_EXTRA_DAY);
    }

    /**
     * It should return the base rental plus 1.5 per additional day if the movie is rented for more days
     * than the minimum, for this test is just for 20 extra day.
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
        final double actualAmount = children.calculateAmount(daysRented);

        // Then
        final int additionalDays = daysRented - RENTAL_PERIOD;
        final double expectedAmount = BASE_RENTAL_FEE + DAILY_RENTAL_RATE * additionalDays;
        assertEquals(expectedAmount, actualAmount, DELTA);
    }
}
