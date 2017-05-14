package com.jalasoft.selenium.leonardo.movies;

import com.jalasoft.selenium.leonardo.shape.baseShape;
import com.jalasoft.selenium.leonardo.shape.circleShape;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Automation on 5/5/2017.
 */
public class moviesTest {
    private Customer customer;

    /**
     *
     */
    @Before
    public void setUp() {
        //Given
        customer = new Customer("John Doe");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
    }

    /**
     *
     */
    @Test
    public void testCalculateAreaWhen() {

        //when - action to test
        customer.generateStatement();

        //then - assertion
        System.out.println(customer.textOfStatement());
        //assertEquals(expectedArea, actualArea, DELTA);
    }
}
