package com.jalasoft.selenium.Ariel.movies;

public final class Main {

    private Main() {

    }

    public static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
        System.out.println(customer.statement());
    }
}
