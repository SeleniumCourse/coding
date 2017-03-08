package com.jala.selenium.movie;

/**
 * @author bsronald on 3/6/17.
 */
public class ChildrensMovie  extends Movie {


    public ChildrensMovie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    double calculateAmount(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3) {
            thisAmount += (daysRented - 3) * 1.5;
        }

        return thisAmount;
    }


}
