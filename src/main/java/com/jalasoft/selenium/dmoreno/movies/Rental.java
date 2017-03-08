package com.jalasoft.selenium.dmoreno.movies;

/**
 *
 */
public abstract class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * @param movie movie
     * @param daysRented days rented
     */
    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * @return days rented
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * @return movie
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * @return rental amount
     */
    public abstract double calculateRentalAmount();

    /**
     * @return frequent renter points
     */
    public abstract int getFrequentRenterPoints();
}
