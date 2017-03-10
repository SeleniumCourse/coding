package com.jalasoft.selenium.Ariel.movies;

/**
 * Created by Ariel Mattos on 3/6/2017.
 */
class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * Creates a movie rental object.
     * @param movie         the movie being rented.
     * @param daysRented    the days the movie is rented.
     */
    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * Retrieves the amount of days the movie was rented.
     * @return              the days the moview was rented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Retrieves the rented movie.
     * @return              a movie object containing the rented movie
     */
    public Movie getMovie() {
        return movie;
    }
}
