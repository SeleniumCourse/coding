package com.jalasoft.selenium.ariel.movies;

/**
 * Created by ariel Mattos on 3/6/2017.
 */
class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * Creates a movie rental object.
     * @param movie         the movie being rented.
     * @param daysRented    the days the movie is rented.
     */
    Rental(final Movie movie, final int daysRented) {
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

    /**
     * Calculate the figures for the movie rental.
     * @return              a string containing the figure of the movie rental.
     */
    public String calculateFigure() {
        StringBuilder rentalFigure = new StringBuilder(movie.getTitle())
                .append('\t')
                .append(movie.calculateAmount(daysRented))
                .append('\n');

        return rentalFigure.toString();
    }
}
