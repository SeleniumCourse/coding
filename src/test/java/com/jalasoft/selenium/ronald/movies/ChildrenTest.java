package com.jalasoft.selenium.ronald.movies;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Children Movie.
 * @author bsronald on 4/17/17.
 */
public class ChildrenTest {

    private final int daysRented = 2;
    private Movie dragonBallZ;

    /**
     * * Set up environment.
     */
    @BeforeTest
    public void setup() {
         final String childrenMovie = "Dragon Ball Z";
         final int childrenPrice = 2;
         dragonBallZ = new ChildrenMovie(childrenMovie, childrenPrice);
    }

    /**
     * Calculate amount.
     */
    @Test
    public void testCalculateAmount() {

        final double expected = 1.5;

        // When
        final double amount = dragonBallZ.calculateAmount(daysRented);

        // then
        Assert.assertEquals(amount, expected,"The values are not equals: " );
    }

    /**
     * Calculate Bonus.
     */
    @Test
    public void testCalculateBonus() {
        final double expectedBonus = 1;

        // When
        final double actualBonus = dragonBallZ.getFrequentRenterPoint(daysRented, dragonBallZ.getClass().toString());

        // Then
        Assert.assertEquals(actualBonus, expectedBonus, "The bonus are not equals: ");
    }
}
