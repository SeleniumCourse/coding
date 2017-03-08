package com.jalasoft.selenium.alex.movies;

/**
 * Created by Alex Alvarez on 3/7/2017.
 */
public class Children extends Movie {

    /**
     * Constructor.
     * @param title Movie title
     */
    public Children(final String title) {
        this.setTitle(title);
    }

    @Override
    public double calculateThisAmount(final int daysRented) {
        final double childrenValue = 1.5;
        final int minimalDays = 3;

        thisAmount += childrenValue;
        if (daysRented > minimalDays) {
            thisAmount += (daysRented - minimalDays) * childrenValue;
        }
        return this.thisAmount;
    }
}
