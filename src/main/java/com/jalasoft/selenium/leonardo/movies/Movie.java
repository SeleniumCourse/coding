package com.jalasoft.selenium.leonardo.movies;

/**
 *
 */
public class Movie extends movieType {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;

    /**
     *
     * @param titleM title of the movie
     * @param priceCodeM price code of the movie
     */
    public Movie(String titleM, int priceCodeM) {
        title = titleM;
        priceCode = priceCodeM;
    }

    /**
     *
     * @return price cod eof the movie
     */

    public int getPriceCode() {
        return priceCode;
    }

    /**
     *
     * @param arg price code
     */
    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    /**
     *
     * @return title of the movie
     */
    public String getTitle() {
        return title;
    }
}
