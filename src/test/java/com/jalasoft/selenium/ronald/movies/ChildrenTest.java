package com.jalasoft.selenium.ronald.movies;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Children Movie.
 * @author bsronald on 4/17/17.
 */
public class ChildrenTest {

    private static final int DAYS_RENTED = 2;
    private Movie dragonBallZ;

    /**
     * * Set up environment.
     */
    @BeforeTest
    public void setup() {
         final String childrenMovie = "Dragon Ball Z";
         dragonBallZ = new ChildrenMovie(childrenMovie);
    }

    /**
     * Calculate amount.
     */
    @Test
    public void testCalculateAmount() {

        final double expected = 1.5;
        // When
        final double amount = dragonBallZ.calculateAmount(DAYS_RENTED);

        // Then
        Assert.assertEquals(amount, expected, "The values are not equals: ");
    }

    /**
     * Calculate Bonus.
     */
    @Test
    public void testCalculateBonus() {

        // When
        final double expectedBonus = 1;
        final double actualBonus = dragonBallZ.getFrequentRenterPoint(DAYS_RENTED, dragonBallZ.getClass().toString());

        // Then
        Assert.assertEquals(actualBonus, expectedBonus, "The bonus are not equals: ");
    }
}
