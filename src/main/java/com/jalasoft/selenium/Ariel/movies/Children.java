package com.jalasoft.selenium.ariel.movies;

/**
 * Created by ariel Mattos on 3/6/2017.
 */
public class Children extends Movie {

    private static final double BASE_RENTAL_FEE = 1.5;
    private static final int RENTAL_PERIOD = 3;
    private static final double DAILY_RENTAL_RATE = 1.5;

    /**
     * Creates a Children movie with the given title.
     * @param title         the tile of the movie.
     */
    public Children(final String title) {
        this.title = title;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateAmount(final int daysRented) {
        return BASE_RENTAL_FEE + ((daysRented > RENTAL_PERIOD) ? (daysRented - RENTAL_PERIOD) * DAILY_RENTAL_RATE : 0);
    }
}
