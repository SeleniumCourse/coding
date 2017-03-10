package com.jalasoft.selenium.daniel.jauregui.movies;

/**
 * Rental Class.
 * @author Daniel Jauregui
 */
class Rental {
    private final MovieAbs movie;
    private final int daysRented;
    /**
     * Constructor of Class.
     * @param movie : Object of Abstract Class MovieAbs.
     * @param daysRented : Days of movie was rented.
     */
    Rental(final MovieAbs movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * Get the rented days of the movie rented.
     * @return integer name as day.
     */
    public int getDaysRented() {
        return this.daysRented;
    }

    /**
     * Get the object movie.
     * @return an object of movie associated to this class.
     */
    public MovieAbs getMovie() {
        return this.movie;
    }
}
