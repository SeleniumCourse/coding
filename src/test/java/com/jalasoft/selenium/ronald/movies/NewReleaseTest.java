package com.jalasoft.selenium.ronald.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * RNew Release movie.
 * @author bsronald on 4/18/17.
 */
public class NewReleaseTest {

    private static final int DAYS_RENTED = 2;
    private Movie batmanVsSuperman;
    private static final float DELTA = 0;

    /**
     * * Set up environment.
     */
    @Before
    public void setup() {
        final String newRelease = "Batman vs Superman";
        batmanVsSuperman = new NewReleaseMovie(newRelease);
    }

    /**
     * Calculate amount.
     */
    @Test
    public void testCalculateAmount() {

        final double expected = 6;

        // When
        final double amount = batmanVsSuperman.calculateAmount(DAYS_RENTED);

        // Then
        assertEquals("The values are not equals: ", expected, amount, DELTA);
    }

    /**
     * Calculate Bonus.
     */
    @Test
    public void testCalculateBonus() {

        // When
        final double expectedBonus = 2;
        final double actualBonus = batmanVsSuperman.getFrequentRenterPoint(DAYS_RENTED);

        // Then
        assertEquals("The bonus are not equals: ", expectedBonus, actualBonus, DELTA);
    }
}
