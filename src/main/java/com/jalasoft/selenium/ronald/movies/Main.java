package com.jalasoft.selenium.ronald.movies;

/**
 * Main class.
 * @author ronald_butron
 */
public class Main {


    /**
     * Rental Movies class.
     * @author bsronald on 3/13/17.
     */
    public static class RentalMovies {

        /**
         * Constructor.
         */
        public RentalMovies() {
            // Do nothing
        }

        /**
         * Main method.
         * @param args args
         */
        public static void main(final String[] args) {
            Customer customer = new Customer("Test");
            Movie terminator = new RegularMovies("Terminator", 0);
            Movie dragonBallZ = new ChildrenMovie("Dragon Ball Z", 2);
            Movie batmanVsSuperman = new NewReleaseMovie("Batman vs Superman", 1);
            customer.addRental(new Rental(dragonBallZ, 2));
            customer.addRental(new Rental(terminator, 2));
            customer.addRental(new Rental(batmanVsSuperman, 2));
            System.out.println(customer.statement());
        }
    }
}
