package com.jalasoft.selenium.alex.movies;

/**
 * Created by Alex Alvarez on 3/7/2017.
 */
public final class Main {

    /**
     * Delete when unit test are done.
     */
    private Main() {

    }

    /**
     * main method.
     * @param args empty
     */
    public static void main(final String[] args) {
        Movie theReverant = new NewRelease("The Reverant");
        Movie terminator = new Regular("Terminator");

        Customer customer = new Customer("Test");

        Rental rental1 = new Rental(theReverant, 2);
        Rental rental2 = new Rental(terminator, 2);

        customer.addRental(rental1);
        customer.addRental(rental2);

        System.out.println(customer.statement());
    }
}
