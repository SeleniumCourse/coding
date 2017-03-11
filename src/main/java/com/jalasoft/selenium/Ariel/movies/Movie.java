package com.jalasoft.selenium.Ariel.movies;

/**
 * Created by Ariel Mattos on 3/6/2017.
 */
public abstract class Movie {
    static final int FREQUENT_RENTER_POINTS = 1;
    protected String title;

    /**
     * Retrieves the title of the movie.
     * @return a string containing the title of the movie.
     */
    public String getTitle() {
        return title;
    }

    /***
     * Calculates the amount owed by the rental of the movie based on the days it was rented.
     * @param daysRented    the days the movie was rented.
     * @return              the charge for the rental of the movie.
     */
    public abstract double calculateAmount(int daysRented);

    /**
     * Calculates the frequent renter points earned by renting the movie.
     * @param daysRented    the days the movie was rented.
     * @return              the frequent renter points earned by renting the movie.
     */
    public int calculateFrequentRenterPoints(final int daysRented) {
        return FREQUENT_RENTER_POINTS;
    }
}
