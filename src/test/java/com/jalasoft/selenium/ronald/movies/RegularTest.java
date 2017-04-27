package com.jalasoft.selenium.ronald.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Regular Movie test.
 * @author bsronald on 4/18/17.
 */
public class RegularTest {

    private static final int DAYS_RENTED = 2;
    private Movie terminator;
    private static final float DELTA = 0;

    /**
     * * Set up environment.
     */
    @Before
    public void setup() {
        final String newRelease = "Terminator";
        terminator = new RegularMovies(newRelease);
    }

    /**
     * Calculate amount.
     */
    @Test
    public void testCalculateAmount() {

        final double expected = 2;

        // When
        final double amount = terminator.calculateAmount(DAYS_RENTED);

        // then
        assertEquals("The values are not equals: ", expected, amount, DELTA);
    }

    /**
     * Calculate Bonus.
     */
    @Test
    public void testCalculateBonus() {
        final double expectedBonus = 1;

        // When
        final double actualBonus = terminator.getFrequentRenterPoint(DAYS_RENTED, terminator.getClass().toString());

        // Then
        assertEquals("The bonus are not equals: ", expectedBonus, actualBonus, DELTA);
    }
}
