package com.jalasoft.selenium.leonardo.movies;

/**
 *
 */
public class Main {
    /**
     *
     * @param args program execution options from command line
     */
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        System.out.println(customer.statement2());
    }
}
