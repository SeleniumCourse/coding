/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jalasoft.selenium.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Jauregui
 */
public class CustomerTest {
    
    private Customer instance;
    
    @Before
    public void setUp() {
        //Given
        instance = new Customer("TestClient");
    }
    
    /**
     * Test of addRental method, of class Customer.
     */
    @Test
    public void testAddRental() {
        //When
        instance.addRental(new Rental(new NewRelease("Lego Batman",0), 7));
        instance.addRental(new Rental(new Regular("Civil War",0), 2));
        instance.addRental(new Rental(new Children("Trolls",0), 3));
        int expResult = 3;
        //Then
        System.out.println("addRental");
        assertEquals(expResult, instance.getRentals().size());
    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatementWithoutBonus() {
        //When
        instance.addRental(new Rental(new NewRelease("Lego Batman",0), 7));
        instance.addRental(new Rental(new Regular("Civil War",0), 2));
        instance.addRental(new Rental(new Children("Trolls",0), 3));
        String result = instance.statement();
        System.out.println(result);
        String expResult = "Rental Record for TestClient\n";
        expResult += "\tLego Batman\t21.0\n";
        expResult += "\tCivil War\t2.0\n";
        expResult += "\tTrolls\t1.5\n";
        expResult += "Amount owed is 24.5\n";
        expResult += "You earned 3 frequent renter points";
        //Then
        System.out.println("testStatementWithoutBonus");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStatementWithBonus() {
        //When
        instance.addRental(new Rental(new NewRelease("Lego Batman",1), 7));
        instance.addRental(new Rental(new Regular("Civil War",1), 2));
        instance.addRental(new Rental(new Children("Trolls",1), 3));
        String result = instance.statement();
        System.out.println(result);
        String expResult = "Rental Record for TestClient\n";
        expResult += "\tLego Batman\t21.0\n";
        expResult += "\tCivil War\t2.0\n";
        expResult += "\tTrolls\t1.5\n";
        expResult += "Amount owed is 24.5\n";
        expResult += "You earned 6 frequent renter points";
        //Then
        System.out.println("testStatementWithBonus");
        assertEquals(expResult, result);
    }
}
