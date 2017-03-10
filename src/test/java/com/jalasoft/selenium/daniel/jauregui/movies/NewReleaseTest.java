package com.jalasoft.selenium.daniel.jauregui.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * NewReleaseTest.
 * @author Daniel Jauregui
 */
public class NewReleaseTest {
    private MovieAbs instance;
    private static final double DELTA = 0.0;
    /**
     * Initialized object.
     */
    @Before
    public void setUp() {
        // Given
        instance = new NewRelease("Dr Strange", 0);
    }

    /**
     * Test of calculateRate method, of class NewRelease.
     */
    @Test
    public void testCalculateRateWithRentedDays1Day() {
        //When
        final int rentedDays = 1;
        final double expResult = 3;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDays1Day");
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Test of testCalculateRateWithRentedDays1Week.
     */
    @Test
    public void testCalculateRateWithRentedDays1Week() {
        //When
        final int rentedDays = 7;
        final double expResult = 21;
        final double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDays1Week");
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Test of testCalculateRateWithRentedDays1Month.
     */
    @Test
    public void testCalculateRateWithRentedDays1Month() {
        //When
        final int rentedDays = 30;
        final double expResult = 90;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDays1Month");
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Test of testCalculateRateWithRentedDays0Days.
     */
    @Test
    public void testCalculateRateWithRentedDays0Days() {
        //When
        final int rentedDays = 0;
        final double expResult = 0;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDays0d");
        assertEquals(expResult, result, DELTA);
    }
}
