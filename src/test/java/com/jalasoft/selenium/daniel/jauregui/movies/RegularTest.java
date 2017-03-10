package com.jalasoft.selenium.daniel.jauregui.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Jauregui
 */
public class RegularTest {
    
    private MovieAbs instance;
    private final double DELTA = 0.0;
    
    @Before
    public void setUp() {
        // Given
        instance = new Regular("Avatar",0);
    }
    
    /**
     * Test of calculateRate method, of class Regular.
     */
    @Test
    public void testCalculateRateWithRentedDaysMajorThan2() {
        //When
        int rentedDays = 12;
        double expResult = 17;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDaysMajorThan2");
        assertEquals(expResult, result, DELTA);
    }

    @Test
    public void testCalculateRateWithRentedDaysEqualTo2() {
        //When
        int rentedDays = 2;
        double expResult = 2;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDaysEqualTo2");
        assertEquals(expResult, result, DELTA);
    }

    @Test
    public void testCalculateRateWithRentedDaysLessThan2() {
        //When
        int rentedDays = 1;
        double expResult = 2;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDaysLessThan2");
        assertEquals(expResult, result, DELTA);
    }
    
    @Test
    public void testCalculateRateWithRentedDaysEqualTo0() {
        //When
        int rentedDays = 0;
        double expResult = 0;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDaysEqualTo0");
        assertEquals(expResult, result, DELTA);
    }
}
