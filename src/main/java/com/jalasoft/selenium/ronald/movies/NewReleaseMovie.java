package com.jalasoft.selenium.ronald.movies;

/**
 * @author bsronald on 3/6/17.
 */
public class NewReleaseMovie extends Movie {


    public NewReleaseMovie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    double calculateAmount(int daysRented) {
        return daysRented * 3;
    }
}
