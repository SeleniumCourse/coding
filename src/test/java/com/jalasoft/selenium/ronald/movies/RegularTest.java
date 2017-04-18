package com.jalasoft.selenium.ronald.movies;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author bsronald on 4/18/17.
 */
public class RegularTest {

    private final int daysRented = 2;
    private Movie terminator;

    @BeforeTest
    public void setup() {
        final String newRelease = "Terminator";
        final int price = 2;
        terminator = new RegularMovies(newRelease, price);
    }


    @Test
    public void testCalculateAmount() {

        final double expected = 2;

        // When
        final double amount = terminator.calculateAmount(daysRented);

        // then
        Assert.assertEquals(amount, expected,"The values are not equals: " );
    }

    @Test
    public void testCalculateBonus() {
        final double expectedBonus = 1;

        // When
        final double actualBonus = terminator.getFrequentRenterPoint(daysRented, terminator.getClass().toString());

        // Then
        Assert.assertEquals(actualBonus, expectedBonus, "The bonus are not equals: ");
    }
}
