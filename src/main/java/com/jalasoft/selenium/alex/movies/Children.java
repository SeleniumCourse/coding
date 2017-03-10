package com.jalasoft.selenium.alex.movies;

/**
 * Created by Alex Alvarez on 3/7/2017.
 */
public class Children extends Movie {
    private static final int MINIMAL_DAYS = 3;
    private static final double CHILDREN_VALUE = 1.5;
    /**
     * Constructor.
     * @param title Movie title
     */
    public Children(final String title) {
        this.setTitle(title);
    }

    @Override
    public double calculateThisAmount(final int daysRented) {
        this.setAmount(this.getAmount() + CHILDREN_VALUE);
        if (daysRented > MINIMAL_DAYS) {
            this.setAmount(this.getAmount() + (daysRented - MINIMAL_DAYS) * CHILDREN_VALUE);
        }
        return this.getAmount();
    }
}
