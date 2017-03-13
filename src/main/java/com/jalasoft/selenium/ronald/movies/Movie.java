package com.jalasoft.selenium.ronald.movies;

/**
 * Movie class.
 * @author ronald_butron
 */
public abstract class Movie {

    protected String title;
    protected int priceCode;

    /**
     * This method get movie price.
     *
     * @return movie price
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     * This method set movie price.
     *
     * @param priceCode movie price to set.
     */
    public void setPriceCode(final int priceCode) {
        this.priceCode = priceCode;
    }

    /**
     * This method get movie title.
     * @return movie title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Abstract method calculate Amount.
     * @param daysRented number days rented
     *
     * @return amount value
     */
    abstract double calculateAmount(int daysRented);
}
