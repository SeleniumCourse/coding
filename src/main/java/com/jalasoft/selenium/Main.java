package com.jalasoft.selenium;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new NewReleaseRental(new Movie("The Revenant"), 2));
        customer.addRental(new RegularRental(new Movie("Terminator"), 2));
        System.out.println(customer.statement());
    }
}
