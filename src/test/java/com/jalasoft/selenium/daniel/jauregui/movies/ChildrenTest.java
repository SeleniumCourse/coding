package com.jalasoft.selenium.daniel.jauregui.movies;

import com.jalasoft.selenium.daniel.jauregui.movies.aMovie;
import com.jalasoft.selenium.daniel.jauregui.movies.Children;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Jauregui
 */
public class ChildrenTest {
    
    private aMovie instance;
    private final double thisAmount = 0.0;
    private final double DELTA = 0.0;
    
    @Before
    public void setUp() {
        // Given
        instance = new Children("Big Hero",0);
    }
    
    /**
     * Test of calculateRate method, of class Children.
     */
    @Test
    public void testCalculateRateWithRentedDaysMajorThan3() {
        //When
        int rentedDays = 32;
        double expResult = 45;
        double result = instance.calculateRate(rentedDays, thisAmount);
        //Then
        System.out.println("testCalculateRateWithRentedDaysMajorThan3");
        assertEquals(expResult, result, DELTA);
    }
    
    @Test
    public void testCalculateRateWithRentedDaysLessThan3() {
        //When
        int rentedDays = 1;
        double expResult = 1.5;
        double result = instance.calculateRate(rentedDays, thisAmount);
        //Then
        System.out.println("testCalculateRateWithRentedDaysLessThan3");
        assertEquals(expResult, result, DELTA);
    }
    
    @Test
    public void testCalculateRateWithRentedDaysEqualTo3() {
        //when
        int rentedDays = 3;
        double expResult = 1.5;
        double result = instance.calculateRate(rentedDays, thisAmount);
        //Then
        System.out.println("testCalculateRateWithRentedDaysEqualTo3");
        assertEquals(expResult, result, DELTA);
    }
    
    @Test
    public void testCalculateRateWithRentedDaysEqualTo0() {
        //When
        int rentedDays = 0;
        double expResult = 0;
        double result = instance.calculateRate(rentedDays, thisAmount);
        //Then
        System.out.println("testCalculateRateWithRentedDaysEqualTo0");
        assertEquals(expResult, result, DELTA);
    }
    
}
