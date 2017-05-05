package com.jalasoft.selenium.dmoreno.movies;

/**
 *
 */
public class RegularRental extends Rental {

    /**
     * @param movie The movie
     * @param daysRented days rented
     */
    public RegularRental(final Movie movie, final int daysRented) {

        super(movie, daysRented);
    }

    /**
     * @return rental amount
     */
    public double calculateRentalAmount() {
        final double amountMultiplier = 3;

        return this.getDaysRented() * amountMultiplier;
    }

    /**
     * @return renter points
     */
    public int getFrequentRenterPoints() {
        return 0;
    }
}
