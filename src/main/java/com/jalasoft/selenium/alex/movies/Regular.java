package com.jalasoft.selenium.alex.movies;

/**
 * Created by Alex Alvarez on 3/7/2017.
 */
public class Regular extends Movie {

    public Regular(String title) {
        this.setTitle(title);
    }

    @Override
    public double calculateThisAmount(int daysRented) {
        this.thisAmount += 2;
        if (daysRented > 2) {
            this.thisAmount += (daysRented - 2) * 1.5;
        }
        return this.thisAmount;
    }
}
