/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jalasoft.selenium.daniel.jauregui.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * CustomerTest.
 * @author Daniel Jauregui
 */
public class CustomerTest {
    private Customer instance;
    /**
     * Initialize a object.
     */
    @Before
    public void setUp() {
        //Given
        final int days7 = 7;
        final int days2 = 2;
        final int days3 = 3;
        instance = new Customer("TestClient");
        instance.addRental(new Rental(new NewRelease("Lego Batman", 0), days7));
        instance.addRental(new Rental(new Regular("Civil War", 0), days2));
        instance.addRental(new Rental(new Children("Trolls", 0), days3));
    }

    /**
     * Test of addRental method, of class Customer.
     */
    @Test
    public void testAddRental() {
        //When
        final int expResult = 3;
        //Then
        assertEquals(expResult, instance.getRentals().size());
    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatementWithoutBonus() {
        //When
        String result = instance.printStatement();
        String expResult = "Rental Record for TestClient\n";
        expResult += "\tLego Batman\t21.0\n";
        expResult += "\tCivil War\t2.0\n";
        expResult += "\tTrolls\t1.5\n";
        expResult += "Amount owed is 24.5\n";
        expResult += "You earned 3 frequent renter points";
        //Then
        assertEquals(expResult, result);
    }

    /**
     * Test of testStatementWithBonus.
     */
    @Test
    public void testStatementWithBonus() {
        //When
        final int bonus = 1;
        for (Rental rental : instance.getRentals()) {
            rental.getMovie().setBonus(bonus);
        }
        String result = instance.printStatement();
        String expResult = "Rental Record for TestClient\n";
        expResult += "\tLego Batman\t21.0\n";
        expResult += "\tCivil War\t2.0\n";
        expResult += "\tTrolls\t1.5\n";
        expResult += "Amount owed is 24.5\n";
        expResult += "You earned 6 frequent renter points";
        //Then
        assertEquals(expResult, result);
    }
}
