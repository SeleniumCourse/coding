package com.jalasoft.selenium.alejandro.FixPage;

/**
 * class movie.
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private final String title;
    private int priceCode;

    /**
     *
     * @param title of the movie.
     * @param priceCode of the movie.
     */
    public Movie(final String title, final int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     *
     * @return the price code
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     *
     * @param arg set the price
     */
    public void setPriceCode(final int arg) {
        priceCode = arg;
    }

    /**
     *
     * @return the title of the movie.
     */
    public String getTitle() {
        return title;
    }
}
