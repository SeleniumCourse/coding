package com.jalasoft.selenium.Ariel.movies;

/**
 * Created by xain on 3/6/2017.
 */
public class NewRelease extends Movie {

    private static final double DAILY_RENTAL_RATE = 3;
    private static final int RENTAL_PERIOD = 1;
    private static final int FREQUENT_RENTER_BONUS = 1;

    /**
     * Creates a NewRelease movie with the given title.
     * @param title         the tile of the movie.
     */
    public NewRelease(final String title) {
        this.title = title;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateAmount(final int daysRented) {
        return daysRented * DAILY_RENTAL_RATE;
    }

    /**
     * {@inheritDoc}
     */
    public int calculateFrequentRenterPoints(final int daysRented) {
        return FREQUENT_RENTER_POINTS + ((daysRented > RENTAL_PERIOD) ? FREQUENT_RENTER_BONUS : 0);
    }
}
