package com.jalasoft.selenium.alex.movies;

/**
 * Created by Alex Alvarez on 3/7/2017.
 */
public class NewRelease extends Movie {
    public NewRelease(String title) {
        this.setTitle(title);
    }

    @Override
    public double calculateThisAmount(int daysRented) {
        thisAmount += daysRented * 3;
        return this.thisAmount;
    }

    @Override
    public int getFrecuentPoint(int daysRented){
        if(daysRented > 1) {
            return frecuentPoint + 1;
        }
        return frecuentPoint;
    }
}
