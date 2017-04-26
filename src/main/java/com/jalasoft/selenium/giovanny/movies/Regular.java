package com.jalasoft.selenium.giovanny.movies;

/**
 * Subclass that represents the regular type
 * of movie.
 *
 * Created by xianqe on 4/24/2017.
 */
public class Regular extends Movie {

    /**
     * Class constructor.
     *
     * @param title the movie title
     */
    public Regular(final String title) {
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
        double thisAmount = 0;
        thisAmount += POSITIVE;
        if (daysRented > 2) {
            thisAmount += (daysRented - POSITIVE) * DISSCOUNT;
        }

        return thisAmount;
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
        return 1;
    }
}
