package com.jalasoft.selenium.giovanny.movies;

/**
 * Class that represents the rental activity
 * that the movies are doing respecting a
 * costumer.
 */
public class Rental {
    private final Movie movie;
    private final int daysRented;

    /**
     * Class constructor.
     *
     * @param movie the movie to be rented.
     * @param daysRented the days to be rented
     */
    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * Specific method that calculates the
     * amount.
     *
     * @return the amount calculated
     */
    public double determineAmount() {
        return  movie.determineAmount(daysRented);
    }

    /**
     * Specific method that calculates the
     * renter points.
     *
     * @return the amount calculated
     */
    public int determineFrequentRentPoints() {
        return movie.frequentRentPoints(daysRented);
    }

    /**
     * Method that returns the movie object.
     *
     * @return the movie instance
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Method that returns the movie title.
     *
     * @return the title
     */
    public String getTitle() {
        return movie.getTitle();
    }


}
