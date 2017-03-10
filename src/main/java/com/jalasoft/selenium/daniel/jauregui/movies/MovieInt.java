package com.jalasoft.selenium.daniel.jauregui.movies;
/**
 * Interface MovieInt.
 * @author Daniel Jauregui
 */
interface MovieInt {
    /**
     * calculateRate of movie.
     * @param rentedDays give a number of days movie was rented.
     * @return calculated rate.
     */
    double calculateRate(int rentedDays);
}
