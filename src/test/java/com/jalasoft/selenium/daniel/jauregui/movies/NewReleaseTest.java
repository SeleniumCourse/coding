package com.jalasoft.selenium.daniel.jauregui.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Jauregui
 */
public class NewReleaseTest {
    
    private MovieAbs instance;
    private final double DELTA = 0.0;

    @Before
    public void setUp() {
        // Given
        instance = new NewRelease("Dr Strange",0);
    }
    
    /**
     * Test of calculateRate method, of class NewRelease.
     */
    @Test
    public void testCalculateRateWithRentedDays1Day() {
        //When
        int rentedDays = 1;
        double expResult = 3;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDays1Day");
        assertEquals(expResult, result, DELTA);
        
    }
    
    @Test
    public void testCalculateRateWithRentedDays1Week() {
        //When
        int rentedDays = 7;
        double expResult = 21;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDays1Week");
        assertEquals(expResult, result, DELTA);
        
    }
    
    @Test
    public void testCalculateRateWithRentedDays1Month() {
        //When
        int rentedDays = 30;
        double expResult = 90;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDays1Month");
        assertEquals(expResult, result, DELTA);
        
    }
    
    @Test
    public void testCalculateRateWithRentedDays0Days() {
        //When
        int rentedDays = 0;
        double expResult = 0;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDays0d");
        assertEquals(expResult, result, DELTA);
        
    }
}
