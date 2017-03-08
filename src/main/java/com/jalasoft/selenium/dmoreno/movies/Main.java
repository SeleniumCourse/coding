package com.jalasoft.selenium.dmoreno.movies;

/**
 *
 */
public final class Main {

    /**
     *
     */
    private Main() {
    }

    /**
     * @param args arguments
     */
    public static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new NewReleaseRental(new Movie("The Revenant"), 2));
        customer.addRental(new RegularRental(new Movie("Terminator"), 2));
        System.out.println(customer.statement());
    }
}
