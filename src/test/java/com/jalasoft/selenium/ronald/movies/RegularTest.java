package com.jalasoft.selenium.ronald.movies;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Regular Movie test.
 * @author bsronald on 4/18/17.
 */
public class RegularTest {

    private static final int DAYS_RENTED = 2;
    private Movie terminator;

    /**
     * * Set up environment.
     */
    @BeforeTest
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
        Assert.assertEquals(amount, expected, "The values are not equals: ");
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
        Assert.assertEquals(actualBonus, expectedBonus, "The bonus are not equals: ");
    }
}
