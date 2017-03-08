package com.jala.selenium.movie;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        Movie terminator = new RegularMovies("Terminator", 0);
        Movie dragonBallZ = new ChildrensMovie("Dragon Ball Z",2);
        Movie batmanVsSuperman = new NewReleaseMovie("Batman vs Superman", 1);
        customer.addRental(new Rental(dragonBallZ, 2));
        customer.addRental(new Rental(terminator, 2));
        customer.addRental(new Rental(batmanVsSuperman, 2));
        System.out.println(customer.statement());
    }
}
