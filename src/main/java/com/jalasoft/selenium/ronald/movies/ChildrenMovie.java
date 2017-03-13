package com.jalasoft.selenium.ronald.movies;

/**
 * Children Movie class.
 * @author bsronald on 3/6/17.
 */
public class ChildrenMovie extends Movie {

    private static final double AMOUNT_VALUE = 1.5;
    private static final double DAYS_RENTED_AT_LEAST = 3;
    private static final double BONUS = 1.5;


    /**
     * Constructor.
     *
     * @param title movie name.
     * @param priceCode price code value.
     */
    public ChildrenMovie(final String title, final int priceCode) {
       this.title = title;
        this.priceCode = priceCode;
    }

    /**
     * This method calculate amount value.
     *
     * @param daysRented days movie rented.
     * @return amount value.
     */
    double calculateAmount(final int daysRented) {
        double thisAmount = AMOUNT_VALUE;
        if (daysRented > DAYS_RENTED_AT_LEAST) {
            thisAmount += (daysRented - DAYS_RENTED_AT_LEAST) * BONUS;
        }

        return thisAmount;
    }
}
