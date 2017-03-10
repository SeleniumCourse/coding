package com.jalasoft.selenium.daniel.jauregui.movies;

/**
 * Movies Class.
 * @author Daniel Jauregui
 */
class Movies {
    /**
     * Constructor.
     */
    public void movies() {
        // Nothing to do
    }
    /**
     * Initial method of application.
     * @param args : Initial Arguments.
     */
    public static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewRelease("The Revenant", 1), 2));
        customer.addRental(new Rental(new Regular("Terminator", 0), 2));
        System.out.println(customer.statement());
    }
}
