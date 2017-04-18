package com.jalasoft.selenium.ronald.movies;

/**
 * Movie class.
 * @author ronald_butron
 */
public abstract class Movie {

    protected String title;
    protected int priceCode;
    protected int regularBonus = 1;
    protected int frequentBonus = 2;
    private static final String NEW_REALEASE  = "NewReleaseMovie";


    /**
     * This method get movies price.
     *
     * @return movies price
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     * This method set movies price.
     *
     * @param priceCode movies price to set.
     */
    public void setPriceCode(final int priceCode) {
        this.priceCode = priceCode;
    }

    /**
     * This method get movies title.
     * @return movies title.
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
    public abstract double calculateAmount(int daysRented);

    /**
     * return bonus value.
     *
     * @param daysRented number of Days Rented
     * @param classType class type for instance "NewRelease"
     * @return bonus
     */
    public int getFrequentRenterPoint(final int daysRented, final String classType) {
        if (classType.contains(NEW_REALEASE)  && daysRented > 1) {
            return frequentBonus;
        }

        return regularBonus;
    }
}
