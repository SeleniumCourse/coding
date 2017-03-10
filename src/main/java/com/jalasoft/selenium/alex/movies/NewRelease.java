package com.jalasoft.selenium.alex.movies;

/**
 * Created by Alex Alvarez on 3/7/2017.
 */
public class NewRelease extends Movie {
    private static final int NEW_RELEASE_VALUE = 3;
    public static final int MINOR_RENTED_DAYS = 1;

    /**
     * New Release type movie.
     * @param title movie
     */
    public NewRelease(final String title) {
        this.setTitle(title);
    }

    @Override
    public double calculateThisAmount(final int daysRented) {
        setAmount(getAmount() + daysRented * NEW_RELEASE_VALUE);
        return this.getAmount();
    }

    @Override
    public int getFrequentPoint(final int daysRented) {
        if (daysRented > MINOR_RENTED_DAYS) {
            return this.getFrequentPoint() + 1;
        }
        return this.getFrequentPoint();
    }
}
