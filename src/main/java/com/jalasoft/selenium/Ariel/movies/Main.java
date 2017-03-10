package com.jalasoft.selenium.Ariel.movies;

/**
 * Created by Ariel Mattos on 3/6/2017.
 */
public final class Main {

    /**
     * Creates an object of the entry point Main class.
     */
    private Main() {

    }

    /**
     * Program entry point.
     * @param args          commandline arguments sent to the program.
     */
    public static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
        System.out.println(customer.statement());
    }
}
