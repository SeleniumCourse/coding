package com.jalasoft.selenium.jose.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jose Rioja on 4/28/2017.
 */
public class CustomerTest {
    private static final String CUSTOMER_NAME = "Customer1";
    private static final String CHILDREN_MOVIE = "Fast and Furious 8";
    private static final String REGULAR_MOVIE = "Street Fight 2";
    private Customer customer;

    /**
     * Method to initialize the customer object.
     */
    @Before
    public void setUp() {
        // Given
        final int fourDaysRented = 4;
        final int eightDaysRented = 8;
        customer = new Customer(CUSTOMER_NAME);
        customer.addRental(new Rental(new Children(CHILDREN_MOVIE), fourDaysRented));
        customer.addRental(new Rental(new Regular(REGULAR_MOVIE), eightDaysRented));
    }

    /**
     * Test to verify that the amount of movies rented for the customer.
     */
    @Test
    public void testAddRental() {
        // When
        final int actualRentals = 2;
        final int expectedRentals = customer.getRentals().size();
        // Then
        assertEquals(expectedRentals, actualRentals);
    }

    /**
     * Test to verify the result obtained from statement method.
     */
    @Test
    public void testStatement() {
        // When
        final String actualStatement = customer.statement();
        StringBuilder expectedStatement = new StringBuilder();
        expectedStatement.append("Rental Record for ").append(CUSTOMER_NAME).append('\n');
        expectedStatement.append('\t').append(CHILDREN_MOVIE).append('\t').append("3.0").append('\n');
        expectedStatement.append('\t').append(REGULAR_MOVIE).append('\t').append("11.0").append('\n');
        expectedStatement.append("Amount owed is 14.0").append('\n');
        expectedStatement.append("You earned 2 frequent renter points");
        // Then
        assertEquals(expectedStatement.toString(), actualStatement);
    }
}
