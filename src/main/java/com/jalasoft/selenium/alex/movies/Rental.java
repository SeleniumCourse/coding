package com.jalasoft.selenium.alex.movies;

/**
 * Created by Alex Alvarez on 3/7/2017.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * Create a rent for a movie.
     * @param movie movie to be rented
     * @param daysRented number of days of rent
     */
    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * get the movie of a rent.
     * @return movie object
     */
    public Movie getMovie() {
        return this.movie;
    }

    /**
     * return the number of rental .
     * @return number of days
     */
    public int getDaysRented() {
        return this.daysRented;
    }
}
