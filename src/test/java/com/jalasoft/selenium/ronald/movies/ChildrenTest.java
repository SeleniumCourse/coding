package com.jalasoft.selenium.ronald.movies;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Children Movie.
 * @author bsronald on 4/17/17.
 */
public class ChildrenTest {

    private static final int DAYS_RENTED = 2;
    private Movie dragonBallZ;
    private static final float DELTA = 0;


    /**
     * * Set up environment.
     */
    @Before
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
        assertEquals("The values are not equals: ", expected, amount, DELTA);
    }

    /**
     * Calculate Bonus.
     */
    @Test
    public void testCalculateBonus() {

        // When
        final double expectedBonus = 1;
        final double actualBonus = dragonBallZ.getFrequentRenterPoint(DAYS_RENTED);

        // Then
        assertEquals("The bonus are not equals: ", expectedBonus, actualBonus, DELTA);
    }
}
