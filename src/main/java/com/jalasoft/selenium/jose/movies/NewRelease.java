package com.jalasoft.selenium.jose.movies;

/**
 * Created by Jose Rioja on 3/21/2017.
 */
public class NewRelease extends Movie {
    private static final double DAILY_RENTAL_RATE = 3;
    private static final int RENTAL_PERIOD = 1;
    private static final int FREQUENT_RENTER_BONUS = 1;

    /**
     * Creates a NewRelease movie with the provided title.
     * @param movieTitle It is the title of the movie.
     */
    public NewRelease(final String movieTitle) {
        this.title = movieTitle;
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
