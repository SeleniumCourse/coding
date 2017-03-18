package com.jalasoft.selenium.ariel.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xain on 3/14/2017.
 */
public class ChildrenTest {
    private static final double BASE_RENTAL_FEE = 1.5;
    private static final int RENTAL_PERIOD = 3;
    private static final double DAILY_RENTAL_RATE = 1.5;
    public static final int DELTA = 0;

    private Movie children;

    /**
     * Creates a Regular movie object.
     */
    @Before
    public void setUp() {
        // Given
        children = new Children("A children movie");

    }

    /**
     * Should return the base rental fee when the movie is rented for less days than the minimum.
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
     * Should return the base rental fee when the movie is rented for the minimum RENTAL PERIOD.
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
     * Should return the base rental plus 1.5 per additional day if the movie is rented for more days than the minimum.
     */
    @Test
    public void calculateAmountWhenRentalPeriodIsGreaterThanTheMinimum() {
        // Given
        final int daysRented = RENTAL_PERIOD + 1;

        // When
        final double actualAmount = children.calculateAmount(daysRented);

        // Then
        final int additionalDays = daysRented - RENTAL_PERIOD;
        final double expectedAmount = BASE_RENTAL_FEE + DAILY_RENTAL_RATE * additionalDays;
        assertEquals(expectedAmount, actualAmount, DELTA);
    }
}
