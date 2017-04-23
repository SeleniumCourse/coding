package com.jalasoft.selenium.bruno.movies;

import com.jalasoft.selenium.bruno.Constants;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Bruno Barrios on 3/14/2017.
 */
public class RentalTest {

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testRentalCanBeCreatedWithParameters() {
        Movie newMovie = new Regular("Rocky");
        Rental rental = new Rental(newMovie, Constants.ONE);
        Assert.assertNotNull(rental);
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testRentalCreateWithMovieAndRentalDayShouldReturnThem() {
        Movie movie = new Regular("Rocky");
        Rental rental = new Rental(movie, Constants.TWO);
        final int daysRental = Constants.TWO;
        assertEquals(daysRental, rental.getDaysRented());

    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testRentalReturnWithTitleAndPriceParamsShouldReturnThem() {
        Movie movie = new Regular("Rocky");
        Rental rental = new Rental(movie, Constants.ONE);
        final int daysRental = Constants.ONE;
        assertEquals(daysRental, rental.getDaysRented());
        assertEquals(movie, rental.getMovie());
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testCalculateChargeRegularMovie() {
        Movie movie = new Regular("Rocky");
        Rental rental = new Rental(movie, Constants.ONE);
        final double expectedResult = Constants.ONE;
        assertEquals(expectedResult, rental.getDaysRented(), Constants.DELTA);
        assertEquals(movie, rental.getMovie());
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testCalculateChargeRegularPriceWhitRentalMoreThat4Day() {
        Movie movie = new Regular("Rocky");
        Rental rental = new Rental(movie, Constants.NINE);
        final double expectedResult = 10.5;
        assertEquals(expectedResult, rental.getMovie().calculateMovieAmount(Constants.NINE), Constants.DELTA);
        assertEquals(movie, rental.getMovie());
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testCalculateChargeNewReleasePrice() {
        Movie movie = new NewRelease("Rocky");
        Rental rental = new Rental(movie, Constants.ONE);
        final double expectedResult = Constants.THREE;
        assertEquals(expectedResult, rental.getMovie().calculateMovieAmount(Constants.ONE), Constants.DELTA);
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testCalculateChargeNewReleasePriceWhitRentalMoreThat4Day() {
        Movie movie = new NewRelease("Rocky");
        Rental rental = new Rental(movie, Constants.FIVE);
        final double expectedResult = Constants.TWELVE;
        assertEquals(expectedResult, rental.getMovie().calculateMovieAmount(Constants.FOUR), Constants.DELTA);
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testCalculateChildrenPrice() {
        Movie movie = new Childrens("Lion King");
        Rental rental = new Rental(movie, Constants.ONE);
        final double expectedResult = 1.5;
        assertEquals(expectedResult, rental.getMovie().calculateMovieAmount(Constants.ONE), Constants.DELTA);
    }

    /**
     * This test will calculate rental creation.
     */
    @Test
    public void testCalculateChildrenPriceWhitRentalMoreThat3Days() {
        Movie movie = new Childrens("Lion King");
        Rental rental = new Rental(movie, Constants.FIVE);
        final double expectedResult = 3.0;
        assertEquals(expectedResult, rental.getMovie().calculateMovieAmount(Constants.FIVE), Constants.DELTA);
    }
}
