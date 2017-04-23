package com.jalasoft.selenium.ariel.movies;

/**
 * Created by xain on 3/6/2017.
 */
public class NewRelease extends Movie {

    private static final int FREQUENT_RENTER_BONUS = 1;
    public static final double BASE_RENTAL_FEE = 3.0;
    public static final double RENTAL_RATE = 3.0;

    /**
     * Creates a NewRelease movie with the given title.
     * @param title         the tile of the movie.
     */
    public NewRelease(final String title) {
        this.title = title;
        baseRentalFee = BASE_RENTAL_FEE;
        rentalPeriod = 1;
        dailyRentalRate = RENTAL_RATE;

        frequentRenterBonus = 1;
    }
}
