package com.jalasoft.selenium.ariel.movies;

/**
 * Created by xain on 3/6/2017.
 */
public class Regular extends Movie {

    /**
     * Creates a Regular movie with the given title.
     * @param title         the tile of the movie.
     */
    public Regular(final String title) {
        this.title = title;
        baseRentalFee = 2.0;
        rentalPeriod = 2;
    }
}
