package com.jalasoft.selenium.dmoreno.movies;

/**
 *
 */
public class NewReleaseRental extends Rental {

    /**
     * @param movie The movie
     * @param daysRented Number of days rented
     */
    public NewReleaseRental(final Movie movie, final int daysRented) {

        super(movie, daysRented);
    }

    /**
     * @return The rental amount
     */
    public double calculateRentalAmount() {
        final double amountMultiplier = 1.5;
        final double daysRentedLimit = 2;
        double amount = 2;
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
        final int daysRentedRequired = 1;
        if (this.getDaysRented() > daysRentedRequired) {
            return daysRentedRequired;
        }

        return 0;
    }
}
