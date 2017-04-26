package com.jalasoft.selenium.bruno.movies;

/**
 * This is an abstract class for movies.
 */
public abstract class Movie {

    private String titleMovie;

    /**
     * Contrucator of a movie.
     *
     * @param title     of a movie
     */
    public Movie(final String title) {
        titleMovie = title;
    }

    /**
     * This method calculates movie amount.
     *
     * @param daysRented of a movie.
     * @return the amount.
     */
    public abstract double calculateMovieAmount(int daysRented);


    /**
     * this method get the title of a movie.
     *
     * @return movie's title.
     */
    public String getTitle() {
        return titleMovie;
    }
}
