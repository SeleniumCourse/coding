package com.jalasoft.selenium.ronald.movies;

/**
 * Rental class.
 * @author ronald_butron
 */
public class Rental {

    private Movie movie;
    private int daysRented;

    /**
     * Rental constructor.
     *
     * @param movie an object.
     * @param daysRented number days rented.
     */
    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * This method get number of days rented.
     *
     * @return days rented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * This method get Movie object.
     *
     * @return movies object.
     */
    public Movie getMovie() {
        return movie;
    }
}
