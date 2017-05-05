package com.jalasoft.selenium.jose.movies;

/**
 * Created by Jose Rioja on 3/21/2017.
 */
public class Regular extends Movie {
    private static final double BASE_RENTAL_FEE = 2;
    private static final int RENTAL_PERIOD = 2;
    private static final double DAILY_RENTAL_RATE = 1.5;
    /**
     * Creates a Regular movie with the provided title.
     * @param movieTitle It is the title of the movie.
     */
    public Regular(final String movieTitle) {
        this.title = movieTitle;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateAmount(final int daysRented) {
        return BASE_RENTAL_FEE + ((daysRented > RENTAL_PERIOD) ? (daysRented - RENTAL_PERIOD) * DAILY_RENTAL_RATE : 0);
    }
}
