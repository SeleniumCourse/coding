package com.jalasoft.selenium.ronald.movies;

/**
 * RegularMovies class.
 * @author bsronald on 3/6/17.
 */
public class RegularMovies extends Movie {

    private static final double DAYS_RENTED_AT_LEAST = 2;
    private static final double BONUS = 1.5;


    /**
     * Regular movies constructor.
     *
     * @param title movies title.
     * @param priceCode movies price.
     */
    public RegularMovies(final String title, final int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     * This method calculate amount per days rented.
     *
     * @param daysRented number of days rented.
     * @return calculated amount
     */
    public double calculateAmount(final int daysRented) {
        double thisAmount = 2;
        if (daysRented > DAYS_RENTED_AT_LEAST) {
            thisAmount += (daysRented - DAYS_RENTED_AT_LEAST) * BONUS;
        }

        return thisAmount;
    }
}
