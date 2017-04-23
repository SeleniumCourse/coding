package com.jalasoft.selenium.bruno.movies;

/**
 * Created by Bruno Barrios on 3/6/2017.
 */
public class Regular extends Movie {

    /**
     * This method is the constructo of a reagular movie.
     *
     * @param titleMovie of aregular movie.
     */
    public Regular(final String titleMovie) {
        super(titleMovie);
    }

    /**
     * This method calculates regular movie amount.
     *
     * @param dayRent of regular movie.
     * @return regular amount.
     */
    @Override
    public double calculateMovieAmount(final int dayRent) {
        final int movieDiscount = 2;
        final double movieCost = 1.5;
        return (dayRent > movieDiscount) ? (dayRent - movieDiscount) * movieCost : movieDiscount;
    }

}
