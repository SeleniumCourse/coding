package com.jalasoft.selenium.alejandro.FixPage;

/**
 * the main class.
 */
public class Main {
    /**
     *
     * @param args have no idea.
     */
    private static void main(final String[]  args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        System.out.println(customer.statement());
    }
}
