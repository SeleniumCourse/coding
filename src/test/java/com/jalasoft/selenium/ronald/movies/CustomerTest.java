package com.jalasoft.selenium.ronald.movies;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author bsronald on 4/18/17.
 */
public class CustomerTest {

    Customer customer;
    @BeforeMethod
    public void setUp() {

        final String  customerName = "Test";
        final String regularMovie = "Terminator";
        final int regularPrice = 0;
        final String childrenMovie = "Dragon Ball Z";
        final int childrenPrice = 2;
        final String newReleaseMovie = "Batman vs Superman";
        final int newReleasePrice = 1;

        customer = new Customer(customerName);
        Movie terminator = new RegularMovies(regularMovie, regularPrice);
        Movie dragonBallZ = new ChildrenMovie(childrenMovie, childrenPrice);
        Movie batmanVsSuperman = new NewReleaseMovie(newReleaseMovie, newReleasePrice);
        customer.addRental(new Rental(dragonBallZ, 2));
        customer.addRental(new Rental(terminator, 2));
        customer.addRental(new Rental(batmanVsSuperman, 2));
    }

    @Test
    public void testStatement() {
        StringBuilder expectedStatement = new StringBuilder("Rental Record for " + customer.getName() + "\n");
        expectedStatement
                .append("\tDragon Ball Z\t1.5\n")
                .append("\tTerminator\t2.0\n")
                .append("\tBatman vs Superman\t6.0\n")
                .append("Amount owed is 9.5\n")
                .append("You earned 4 frequent renter points");

        // Then
        Assert.assertEquals(customer.statement(), expectedStatement.toString(), "Statement are not equals");
    }

    @Test
    public void testAddMovie() {

        // Given
        final String newReleaseMovie = "Fast & Furious 8";
        final int newReleasePrice = 3;
        Movie fastAndFurious = new NewReleaseMovie(newReleaseMovie, newReleasePrice);
        final int daysRented = 3;
        final int expectedSize = 4;

        // When
        customer.addRental(new Rental(fastAndFurious, daysRented));

        // Then
        Assert.assertEquals(customer.getRentals().size(), expectedSize);
    }


}
