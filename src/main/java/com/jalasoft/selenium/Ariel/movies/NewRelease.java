package com.jalasoft.selenium.Ariel.movies;

/**
 * Created by xain on 3/6/2017.
 */
public class NewRelease extends Movie {

    private static final double DAILY_RENTAL_RATE = 3;
    private static final int RENTAL_PERIOD = 1;
    private static final int FREQUENT_RENTER_BONUS = 1;

    public NewRelease(String title){
        super(title);
    }

    public double calculateAmount(int daysRented) {
        return daysRented * DAILY_RENTAL_RATE;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return FREQUENT_RENTER_POINTS + ((daysRented > RENTAL_PERIOD) ? FREQUENT_RENTER_BONUS : 0);
    }
}
