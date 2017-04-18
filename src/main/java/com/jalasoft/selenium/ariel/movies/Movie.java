package com.jalasoft.selenium.ariel.movies;

/**
 * Created by ariel Mattos on 3/6/2017.
 */
public abstract class Movie {
    public static final double BASE_RENTAL_RATE = 1.5;

    protected double baseRentalFee = 0;
    protected int rentalPeriod = 0;
    protected double dailyRentalRate = BASE_RENTAL_RATE;

    protected int frequentRenterPoints = 1;
    protected int frequentRenterBonus = 0;

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
    public double calculateAmount(final int daysRented) {
        return baseRentalFee + ((daysRented > rentalPeriod) ? (daysRented - rentalPeriod) * dailyRentalRate : 0);
    }

    /**
     * Calculates the frequent renter points earned by renting the movie.
     * @param daysRented    the days the movie was rented.
     * @return              the frequent renter points earned by renting the movie.
     */
    public int calculateFrequentRenterPoints(final int daysRented) {
        return frequentRenterPoints + ((daysRented > rentalPeriod) ? frequentRenterBonus : 0);
    }
}
