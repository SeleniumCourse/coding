package com.jalasoft.selenium.movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewRelease("The Revenant",1), 2));
        customer.addRental(new Rental(new Regular("Terminator",0), 2));
        System.out.println(customer.statement());
    }
}
