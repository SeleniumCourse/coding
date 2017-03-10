package com.jalasoft.selenium.daniel.jauregui.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * RegularTest.
 * @author Daniel Jauregui
 */
public class RegularTest {
    private MovieAbs instance;
    private static final double DELTA = 0.0;
    /**
     * Initialized object.
     */
    @Before
    public void setUp() {
        // Given
        instance = new Regular("Avatar", 0);
    }

    /**
     * Test of calculateRate method, of class Regular.
     */
    @Test
    public void testCalculateRateWithRentedDaysMajorThan2() {
        //When
        final int rentedDays = 12;
        final double expResult = 17;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDaysMajorThan2");
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Test of testCalculateRateWithRentedDaysEqualTo2.
     */
    @Test
    public void testCalculateRateWithRentedDaysEqualTo2() {
        //When
        final int rentedDays = 2;
        final double expResult = 2;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDaysEqualTo2");
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Test of testCalculateRateWithRentedDaysLessThan2.
     */
    @Test
    public void testCalculateRateWithRentedDaysLessThan2() {
        //When
        final int rentedDays = 1;
        final double expResult = 2;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDaysLessThan2");
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Test of testCalculateRateWithRentedDaysEqualTo0.
     */
    @Test
    public void testCalculateRateWithRentedDaysEqualTo0() {
        //When
        final int rentedDays = 0;
        final double expResult = 0;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDaysEqualTo0");
        assertEquals(expResult, result, DELTA);
    }
}
