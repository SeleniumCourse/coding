package com.jalasoft.selenium.ronald.movies;

/**
 * Movie class.
 * @author ronald_butron
 */
public abstract class Movie {

    protected String title;
    protected int regularBonus = 1;
    protected int frequentBonus = 2;
    private static final String NEW_RELEASE_MOVIE = "NewReleaseMovie";


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
        if (classType.contains(NEW_RELEASE_MOVIE)  && daysRented > 1) {
            return frequentBonus;
        }

        return regularBonus;
    }
}
