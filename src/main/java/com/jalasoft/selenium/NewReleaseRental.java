package com.jalasoft.selenium;

public class NewReleaseRental extends Rental {

    public NewReleaseRental(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    public double calculateRentalAmount() {
        double amount = 2;
        final double daysRented = this.getDaysRented();
        if(daysRented > 2){
            amount += (daysRented - 2) * 1.5;
        }
        return amount;
    }

    public int getFrequentRenterPoints() {
        if(this.getDaysRented() > 1){
            return 1;
        }

        return 0;
    }
}
