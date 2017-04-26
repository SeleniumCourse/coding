package com.jalasoft.selenium.giovanny.movies;

/**
 * Subclass that represents the new release type
 * of movie.
 *
 * Created by xianqe on 4/24/2017.
 */
public class NewRelease extends Movie {

    /**
     * Class constructor.
     *
     * @param title the movie name
     */
    public NewRelease(final String title) {
        super(title);
    }

    /**
     * Specific method that calculates the
     * amount.
     *
     * @param daysRented value to check the formula.
     *
     * @return the amount calculated
     */
    @Override
    public double determineAmount(final int daysRented) {
        return daysRented * ADDED_CONSTANT;
    }

    /**
     * Specific method that calculates the
     * renter points.
     *
     * @param daysRented value to check the formula.
     *
     * @return the amount calculated
     */
    @Override
    public int frequentRentPoints(final int daysRented) {
        if (daysRented > 1) {
            return POSITIVE;
        } else {
            return NEGATIVE;
        }
    }
}
