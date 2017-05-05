package com.jalasoft.selenium.giovanny.movies;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Test class for movie Test.
 *
 * @author      Giovanny Uscamaita
 * @version     2.0, 4/24/2017
 */
public class MoviesTaskTest {

    private RentalStatement statement;
    private Movie newRelease1;
    private Movie newRelease2;
    private Movie childrens;
    private Movie regular1;
    private Movie regular2;
    private Movie regular3;
    private static final int THREE = 3;
    private static final double NINE = 9.0;
    private static final int TWO = 2;
    private static final double EIGHTEEN = 18.0;
    private static final int ONE = 1;
    private static final int FOUR = 4;
    private static final double SEVEN_AND_HALF = 7.5;
    private static final double ONE_AND_HALF = 1.5;

    /**
     * Method that sets the prerequisites for the test.
     */
    @Before
    public void setUp() {
        statement = new RentalStatement("Customer Name");
        newRelease1 = new NewRelease("New Release 1");
        newRelease2 = new NewRelease("New Release 2");
        childrens = new Childrens("Childrens");
        regular1 = new Regular("Regular 1");
        regular2 = new Regular("Regular 2");
        regular3 = new Regular("Regular 3");
    }

    /**
     * Method that compares the amount and the renter points.
     *
     * @param expectedAmount the amount expected
     * @param expectedPoints the renter points expected
     */

    public void assertAmountAndPointsForReport(final double expectedAmount, final int expectedPoints) {
        Assert.assertEquals(expectedAmount, statement.getAmountOwed(), expectedAmount);
        assertEquals(expectedPoints, statement.getFrequentRenterPoints());
    }

    /**
     * Method that tests a new release entry.
     */
    @Test
    public void testSingleNewReleaseType() {
        statement.addRental(new Rental(newRelease1, THREE));
        statement.makeRentalStatement();
        assertAmountAndPointsForReport(NINE, TWO);
    }

    /**
     * Method that tests a dual new release entries.
     */
    @Test
    public void testDualNewReleaseType() {
        statement.addRental(new Rental(newRelease1, THREE));
        statement.addRental(new Rental(newRelease2, THREE));
        statement.makeRentalStatement();
        assertAmountAndPointsForReport(EIGHTEEN, FOUR);
    }

    /**
     * Method that tests a new children entry.
     */
    @Test
    public void testSingleChildrensType() {
        statement.addRental(new Rental(childrens, THREE));
        statement.makeRentalStatement();
        assertAmountAndPointsForReport(ONE_AND_HALF, ONE);
    }

    /**
     * Method that tests multiple regular entries.
     */
    @Test
    public void testMultipleRegularType() {
        statement.addRental(new Rental(regular1, ONE));
        statement.addRental(new Rental(regular2, TWO));
        statement.addRental(new Rental(regular3, THREE));
        statement.makeRentalStatement();
        assertAmountAndPointsForReport(SEVEN_AND_HALF, THREE);
    }
}
