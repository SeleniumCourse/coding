package com.jalasoft.selenium.giovanny.movies;

/**
 * Subclass that represents the children type
 * of movie.
 *
 * Created by xianqe on 3/6/2017.
 */
public class Childrens extends Movie {

    /**
     * Class constructor.
     *
     * @param title the children movie title
     */
    public Childrens(final String title) {
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
        int thisAmount = 0;
        thisAmount += DISSCOUNT;
        if (daysRented > ADDED_CONSTANT) {
            thisAmount += (daysRented - ADDED_CONSTANT) * DISSCOUNT;
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
