package com.jalasoft.selenium.dmoreno.movies;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 *
 */
public class CustomerTest {

    /**
     *
     */
    @Test
    public void getNameTest() {
        final String expectedCustomerName = "Test Customer01";

        Customer customer = new Customer(expectedCustomerName);

        assertEquals(expectedCustomerName, customer.getName());
    }

    /**
     *
     */
    @Test
    public void calculateTotalAmountTest() {
        Customer customer = new Customer("");

        FakeRental rental = new FakeRental();

        final double testRentalAmount1 = 2;
        rental.setTestRentalAmount(testRentalAmount1);
        customer.addRental(rental);
        rental = new FakeRental();

        final double testRentalAmount2 = 3;
        rental.setTestRentalAmount(testRentalAmount2);
        customer.addRental(rental);

        final double expectedTotalAmount = 5;

        assertEquals(expectedTotalAmount, customer.calculateTotalAmount());
    }

    /**
     *
     */
    @Test
    public void calculateFrequentRenterPointsTest() {
        Customer customer = new Customer("");

        FakeRental rental = new FakeRental();

        final int testFrequentPoints1 = 2;
        rental.setTestFrequentRenterPoints(testFrequentPoints1);
        customer.addRental(rental);
        rental = new FakeRental();

        final int testFrequentPoints2 = 3;
        rental.setTestFrequentRenterPoints(testFrequentPoints2);
        customer.addRental(rental);

        final int expectedFrequentPoints = 7;

        assertEquals(expectedFrequentPoints, customer.calculateFrequentRenterPoints());
    }

    /**
     *
     */
    @Test
    public void getStatementTest() {
        String expectedStatement =
                "Rental Record for \n"
                + "\t\t0.0\n"
                + "Amount owed is 0.0\n"
                + "You earned 1 frequent renter points";

        Customer customer = new Customer("");
        customer.addRental(new FakeRental(new Movie("")));

        assertEquals(expectedStatement, customer.getStatement());
    }
}
