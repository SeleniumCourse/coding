package com.jalasoft.selenium.ronald.movies;

/**
 * @author bsronald on 3/6/17.
 */
public class ChildrenMovie extends Movie {

    /**
     * Constructor.
     *
     * @param title movie name.
     * @param priceCode price code value.
     */
    public ChildrenMovie(final String title, final int priceCode) {
       _title = title;
        _priceCode = priceCode;
    }

    /**
     * This method calculate amount value.
     *
     * @param daysRented days movie rented.
     * @return amount value.
     */
    double calculateAmount(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3) {
            thisAmount += (daysRented - 3) * thisAmount;
        }

        return thisAmount;
    }


}
