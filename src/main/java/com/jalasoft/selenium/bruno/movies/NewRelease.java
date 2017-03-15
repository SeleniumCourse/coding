package com.jalasoft.selenium.bruno.movies;

/**
 * Created by Bruno Barrios on 3/6/2017.
 */
public class NewRelease extends Movie {

    public static final int NEW_RELEASE = 1;

    /**
     * This is the constructor of a new release movie.
     *
     * @param titleMovie of a new release movie.
     */
    public NewRelease(final String titleMovie) {
        super(titleMovie, NEW_RELEASE);
    }

    /**
     * This method calculate new realease amount.
     *
     * @param dayRented of the movie.
     * @return the amount.
     */
    @Override
    public double calculateMovieAmount(final int dayRented) {
        final int i = 3;
        return (double) i * dayRented;
    }
}
