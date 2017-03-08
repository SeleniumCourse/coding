package com.jalasoft.selenium.giovanny.movies;

/**
 * Created by xianqe on 3/6/2017.
 */
public class Childrens implements Movie {

    private String _title;
    private int _priceCode;

    public Childrens(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public double determineAmount(int daysRented){
        int thisAmount = 0;
        thisAmount += 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;

        return thisAmount;
    }
}
