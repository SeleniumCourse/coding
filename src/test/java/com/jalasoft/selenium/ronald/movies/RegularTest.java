package com.jalasoft.selenium.ronald.movies;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Regular Movie test.
 * @author bsronald on 4/18/17.
 */
public class RegularTest {

    private final int daysRented = 2;
    private Movie terminator;

    /**
     * * Set up environment.
     */
    @BeforeTest
    public void setup() {
        final String newRelease = "Terminator";
        final int price = 2;
        terminator = new RegularMovies(newRelease, price);
    }

    /**
     * Calculate amount.
     */
    @Test
    public void testCalculateAmount() {

        final double expected = 2;

        // When
        final double amount = terminator.calculateAmount(daysRented);

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
        final double actualBonus = terminator.getFrequentRenterPoint(daysRented, terminator.getClass().toString());

        // Then
        Assert.assertEquals(actualBonus, expectedBonus, "The bonus are not equals: ");
    }
}
