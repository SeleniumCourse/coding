package com.jalasoft.selenium.ariel.movies;

/**
 * Created by xain on 3/6/2017.
 */
public class Regular extends Movie {

    private static final double BASE_RENTAL_FEE = 2.0;
    private static final int RENTAL_PERIOD = 2;
    private static final double DAILY_RENTAL_RATE = 1.5;

    /**
     * Creates a Regular movie with the given title.
     * @param title         the tile of the movie.
     */
    public Regular(final String title) {
        this.title = title;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(final int daysRented) {
        return BASE_RENTAL_FEE + ((daysRented > RENTAL_PERIOD) ? (daysRented - RENTAL_PERIOD) * DAILY_RENTAL_RATE : 0);
    }
}
