package com.jalasoft.selenium.ronald.movies;

/**
 * Rental class.
 * @author ronald_butron
 */
class Rental {

    private Movie movie;
    private int daysRented;

    /**
     * Rental constructor.
     *
     * @param movie an object.
     * @param daysRented number days rented.
     */
    Rental(final Movie movie, final int daysRented) {
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
     * @return movie object.
     */
    public Movie getMovie() {
        return movie;
    }
}
