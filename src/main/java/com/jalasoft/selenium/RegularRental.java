package com.jalasoft.selenium;

public class RegularRental extends Rental {

    public RegularRental(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    public double calculateRentalAmount() {
        return this.getDaysRented() * 3;
    }

    public int getFrequentRenterPoints() {
        return 0;
    }
}
