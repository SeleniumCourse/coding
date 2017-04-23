package com.jalasoft.selenium.bruno.movies;

import com.jalasoft.selenium.bruno.Constants;
import org.junit.Test;

import static com.jalasoft.selenium.bruno.Constants.THERTY;
import static junit.framework.TestCase.assertEquals;


/**
 * Created by Bruno Barrios on 3/14/2017.
 */
public class CustomerTest {


    /**
     * This method will verify that all rentals are saved.
     */
    @Test
    public void testCustomerCanBeAddMovieInList() {
        Customer customer = new Customer("Juan");
        customer.addRental(new Rental(new Regular("Rocky"), THERTY));
        customer.addRental(new Rental(new Regular("Rocky II"), THERTY));
        customer.addRental(new Rental(new NewRelease("Rocky III"), THERTY));
        final int expectedResult = Constants.THREE;
        assertEquals(expectedResult, customer.getRentalList().size());
    }
}
