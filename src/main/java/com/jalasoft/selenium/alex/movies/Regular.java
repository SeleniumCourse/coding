package com.jalasoft.selenium.alex.movies;

/**
 * Created by Alex Alvarez on 3/7/2017.
 */
public class Regular extends Movie {

    public static final int AMOUNT_VALUE = 2;
    public static final double REGULAR_VALUE = 1.5;

    /**
     * Regular movie constructor.
     * @param title movies
     */
    public Regular(final String title) {
        this.setTitle(title);
    }

    @Override
    public double calculateThisAmount(final int daysRented) {
        this.setAmount(this.getAmount() + AMOUNT_VALUE);

        if (daysRented > AMOUNT_VALUE) {
            this.setAmount(this.getAmount() + (daysRented - AMOUNT_VALUE) * REGULAR_VALUE);
        }
        return this.getAmount();
    }
}
