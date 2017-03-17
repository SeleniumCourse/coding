package com.jalasoft.selenium.daniel.jauregui.movies;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * ChildrenTest.
 * @author Daniel Jauregui
 */
public class ChildrenTest {
    private MovieAbs instance;
    private static final double DELTA = 0.0;
    /**
     * Initialize a object.
     */
    @Before
    public void setUp() {
        // Given
        instance = new Children("Big Hero", 0);
    }

    /**
     * Test of testCalculateRateWithRentedDaysMajorThan3.
     */
    @Test
    public void testCalculateRateWithRentedDaysMajorThan3() {
        //When
        final int rentedDays = 32;
        final double expResult = 45;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDaysMajorThan3");
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Test of calculattestCalculateRateWithRentedDaysLessThan3.
     */
    @Test
    public void testCalculateRateWithRentedDaysLessThan3() {
        //When
        final int rentedDays = 1;
        final double expResult = 1.5;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDaysLessThan3");
        assertEquals(expResult, result, DELTA);
    }

    /**
     * Test of testCalculateRateWithRentedDaysEqualTo3.
     */
    @Test
    public void testCalculateRateWithRentedDaysEqualTo3() {
        //when
        final int rentedDays = 3;
        final double expResult = 1.5;
        double result = instance.calculateRate(rentedDays);
        //Then
        System.out.println("testCalculateRateWithRentedDaysEqualTo3");
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
