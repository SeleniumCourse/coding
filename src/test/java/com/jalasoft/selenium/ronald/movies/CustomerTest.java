package com.jalasoft.selenium.ronald.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Customer.
 * @author bsronald on 4/18/17.
 */
public class CustomerTest {

    private Customer customer;

    /**
     * Set up environment.
     */
    @Before
    public void setUp() {

        final String  customerName = "Test";
        final String regularMovie = "Terminator";
        final String childrenMovie = "Dragon Ball Z";
        final String newReleaseMovie = "Batman vs Superman";

        customer = new Customer(customerName);
        Movie terminator = new RegularMovies(regularMovie);
        Movie dragonBallZ = new ChildrenMovie(childrenMovie);
        Movie batmanVsSuperman = new NewReleaseMovie(newReleaseMovie);
        customer.addRental(new Rental(dragonBallZ, 2));
        customer.addRental(new Rental(terminator, 2));
        customer.addRental(new Rental(batmanVsSuperman, 2));
    }

    /**
     * Statement test.
     */
    @Test
    public void testStatement() {

        String expectedStatement = "Rental Record for " + customer.getName() + "\n";
        expectedStatement += ("\tDragon Ball Z\t1.5\n");
        expectedStatement += ("\tTerminator\t2.0\n");
        expectedStatement += ("\tBatman vs Superman\t6.0\n");
        expectedStatement += ("Amount owed is 9.5\n");
        expectedStatement += ("You earned 4 frequent renter points");

        // Then
        assertEquals("Statement are not equals", expectedStatement, customer.statement());
    }

    /**
     * Add new movie test.
     */
    @Test
    public void testAddMovie() {

        // Given
        final String newReleaseMovie = "Fast & Furious 8";
        Movie fastAndFurious = new NewReleaseMovie(newReleaseMovie);
        final int daysRented = 3;
        final int expectedSize = 4;

        // When
        customer.addRental(new Rental(fastAndFurious, daysRented));

        // Then
        assertEquals(expectedSize, customer.getRentals().size());
    }
}
