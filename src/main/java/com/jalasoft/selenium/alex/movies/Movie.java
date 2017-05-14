package com.jalasoft.selenium.alex.movies;

/**
 * Created by Alex Alvarez on 3/7/2017.
 */
public abstract class Movie {

    private String title;
    private double amount = 0;
    private int frequentPoint = 1;

    /**
     * it going to calculate value for amount variable for Movie.
     * @param daysRented number days to be rented
     * @return calculated value for amount
     */
    public abstract double calculateThisAmount(final int daysRented);

    /**
     * it going to calculate the value for frequentPoint variable.
     * @param daysRented number of days
     * @return calculated value for frequentPoint
     */
    public int getFrequentPoint(final int daysRented) {
        return this.frequentPoint;
    }

    /**
     * get movie title.
     * @return movie title of String type
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * set the movie title.
     * @param title movie title
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * get the value for amount variable.
     * @return valued of amount variable
     */
    public double getAmount() {
        return this.amount;
    }

    /**
     * Set value for thisAmoun variable.
     * @param amount amount variable
     */
    public void setAmount(final double amount) {
        this.amount = amount;
    }

    /**
     * Returns the value of frequentPoint variable.
     * @return return the value fo grequentPoint variable
     */
    public int getFrequentPoint() {
        return this.frequentPoint;
    }

    /**
     * Set the value for frequentPoint variable.
     * @param frequentPoint set this value to frequentPoint
     */
    public void setFrequentPoint(final int frequentPoint) {
        this.frequentPoint = frequentPoint;
    }
}
