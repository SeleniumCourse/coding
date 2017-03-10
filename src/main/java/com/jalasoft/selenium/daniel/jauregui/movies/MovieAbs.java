package com.jalasoft.selenium.daniel.jauregui.movies;

/**
 * MovieAbs Abstract class.
 * @author Daniel Jauregui
 */
abstract class MovieAbs implements MovieInt {
    private String title;
    private int bonus;

    /**
     * Constructor of Class.
     * @param title will have the name of movie.
     * @param bonus will have the value of bonus.
     */
    public MovieAbs(final String title, final int bonus) {
        this.title = title;
        this.bonus = bonus;
    }

    /**
     * Get the Bonus of movie.
     * @return the integer number of bonus.
     */
    public int getBonus() {
        return this.bonus;
    }

    /**
     * Set a bonus for a movie.
     * @param bonus the new bonus value.
     */
    public void setBonus(final int bonus) {
        this.bonus = bonus;
    }

    /**
     * Get the title of movie.
     * @return an String with the title of movie.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set a new title of movie.
     * @param title will get the new title for the movie.
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Calculate the bonus for frequent renter points.
     * @param rentedDays get the rented days of movie.
     * @return the bonus if it is major than 0.
     */
    public int calculateBonus(final int rentedDays) {
        if (this.bonus != 0 && rentedDays > 1) {
            return this.bonus + 1;
        }
        return 1;
    }
}
