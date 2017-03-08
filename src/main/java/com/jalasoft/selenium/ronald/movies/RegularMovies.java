package com.jalasoft.selenium.ronald.movies;

/**
 * @author bsronald on 3/6/17.
 */
public class RegularMovies extends Movie {


    public RegularMovies(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    double calculateAmount(int daysRented) {
        double thisAmount = 2;
                    if (daysRented > 2) {
                        thisAmount += (daysRented - 2) * 1.5;
                    }

        return thisAmount;
    }
}
