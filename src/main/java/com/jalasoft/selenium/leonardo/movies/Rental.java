package com.jalasoft.selenium.leonardo.movies;

/**
 *
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     *
     * @param movieM movie name
     * @param daysRentedM number of days rented
     */
    public Rental(Movie movieM, int daysRentedM) {
        movie = movieM;
        daysRented = daysRentedM;
    }

    /**
     *
     * @return number of days rented
     */

    public int getDaysRented() {
        return daysRented;
    }

    /**
     *
     * @return movie
     */
    public Movie getMovie() {
        return movie;
    }
}