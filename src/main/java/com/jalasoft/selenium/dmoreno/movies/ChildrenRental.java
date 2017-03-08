package com.jalasoft.selenium.dmoreno.movies;

/**
 *
 */
public class ChildrenRental extends Rental {

    /**
     * @param movie The movie
     * @param daysRented Number of days rented.
     */
    public ChildrenRental(final Movie movie, final int daysRented) {
        super(movie, daysRented);
    }

    /**
     * @return Rental amount
     */
    public double calculateRentalAmount() {
        final double amountMultiplier = 1.5;
        double amount = amountMultiplier;
        final double daysRentedLimit = 3;
        final double daysRented = this.getDaysRented();

        if (daysRented > daysRentedLimit) {
            amount += (daysRented - daysRentedLimit) * amountMultiplier;
        }

        return amount;
    }

    /**
     * @return Frequent renter points
     */
    public int getFrequentRenterPoints() {
        return 0;
    }
}
