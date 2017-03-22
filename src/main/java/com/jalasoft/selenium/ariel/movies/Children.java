package com.jalasoft.selenium.ariel.movies;

/**
 * Created by ariel Mattos on 3/6/2017.
 */
public class Children extends Movie {

    public static final double BASE_RENTAL_FEE = 1.5;
    public static final int BASE_RENTAL_PERIOD = 3;

    /**
     * Creates a Children movie with the given title.
     * @param title         the tile of the movie.
     */
    public Children(final String title) {
        this.title = title;
        baseRentalFee = BASE_RENTAL_FEE;
        rentalPeriod = BASE_RENTAL_PERIOD;
    }
}
