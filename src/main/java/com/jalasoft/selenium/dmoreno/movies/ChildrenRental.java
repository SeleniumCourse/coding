package com.jalasoft.selenium.dmoreno.movies;

public class ChildrenRental extends Rental {

    public ChildrenRental(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    public double calculateRentalAmount() {
        double amount = 1.5;
        final double daysRented = this.getDaysRented();
        if(daysRented > 3){
            amount += (daysRented - 3) * 1.5;
        }
        return amount;
    }

    public int getFrequentRenterPoints() {
        return 0;
    }
}
