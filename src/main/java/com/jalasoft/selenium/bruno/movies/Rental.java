package com.jalasoft.selenium.bruno.movies;

/**
 * This class represents rentals.
 */
class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * This is the constructor of rental movie.
     *
     * @param movie      is the rented movie.
     * @param daysRented that a movie was rented.
     */
    Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * This method is used to get the days that a movie was rented.
     *
     * @return days that a movie was rented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * This method is used to get the movie that was rented.
     *
     * @return the rented movie.
     */
    public Movie getMovie() {
        return movie;
    }
}
