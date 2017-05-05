package com.jalasoft.selenium.jose.movies;

/**
 * Updated by Jose Rioja on 3/21/2017.
 */
public abstract class Movie {
    protected static final int FREQUENT_RENTER_POINTS = 1;
    protected String title;

    /**
     * This method gets the title of the movie.
     * @return returns the title of the movie.
     */
    public String getTitle() {
        return title;
    }

    /**
     * This is the method to calculate the amount.
     * @param daysRented It is the number of days that were rented.
     * @return returns the calculated amount.
     */
    abstract double calculateAmount(int daysRented);

    /**
     * This method calculates the frequent renter points.
     * @param daysRented It is the number of days that were rented.
     * @return returns the calculated frequent renter points.
     */
    public int calculateFrequentRenterPoints(final int daysRented) {
        return FREQUENT_RENTER_POINTS;
    }
}
