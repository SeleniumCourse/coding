package com.jalasoft.selenium.ronald.movies;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author bsronald on 4/18/17.
 */
public class NewReleaseTest {

    private final int daysRented = 2;
    private Movie batmanVsSuperman;

    @BeforeTest
    public void setup() {
        final String newRelease = "Batman vs Superman";
        final int price = 2;
        batmanVsSuperman = new NewReleaseMovie(newRelease, price);
    }


    @Test
    public void testCalculateAmount() {

        final double expected = 6;

        // When
        final double amount = batmanVsSuperman.calculateAmount(daysRented);

        // then
        Assert.assertEquals(amount, expected,"The values are not equals: " );
    }

    @Test
    public void testCalculateBonus() {
        final double expectedBonus = 2;

        // When
        final double actualBonus = batmanVsSuperman.getFrequentRenterPoint(daysRented, batmanVsSuperman.getClass().toString());

        // Then
        Assert.assertEquals(actualBonus, expectedBonus, "The bonus are not equals: ");
    }
}
