package com.jalasoft.selenium.alejandro.FixPage;

/**
 * class rental.
 */
public class Rental {
    private final Movie movie;
    private final int daysRented;

    /**
     *
     * @param movie the movie.
     * @param daysRented the amount of days.
     */
    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     *
     * @return the days
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     *
     * @return the movie.
     */
    public Movie getMovie() {
        return movie;
    }
}
