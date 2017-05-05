package com.jalasoft.selenium.giovanny.movies;

/**
 * Class abstraction for movies that defines
 * the parameters and the methods to be changed
 * on subclasses.
 */
public abstract class Movie {

    private String title;

    public static final double DISSCOUNT = 1.5;

    public static final double SUBSTRACTED_DAYS = 2;

    public static final int ADDED_CONSTANT = 3;

    public static final int POSITIVE = 2;

    public static final int NEGATIVE = 1;

    /**
     * Class constructor.
     *
     * @param title the movie name independent of
     *              the type
     */
    public Movie(final String title) {
        this.title = title;
    }

    /**
     * Method that returns the movie title.
     *
     * @return the movie title
     */
    public String getTitle() {
        return title;
    }

    /**
     * abstract method to be defined on subclasses.
     *
     * @param daysRented the value of days rented
     * @return the value calculated on subclasses
     */
    public abstract double determineAmount(final int daysRented);

    /**
     * abstract method to be defined on subclasses.
     *
     * @param daysRented the value of days rented
     * @return the value calculated on subclasses
     */
    public abstract int frequentRentPoints(final int daysRented);

}
