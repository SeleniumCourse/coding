package com.jalasoft.selenium.jose.movies;

/**
 * Updated by Jose Rioja on 3/21/2017.
 */
class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * Rental constructor.
     * @param movie It is a movie object.
     * @param daysRented It is the days that the movie was rented.
     */
    Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * This method gets the number of rented days.
     * @return returns the number of rented days.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * This method gets the movie object.
     * @return returns the movie object.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Method to generate the output result.
     * @return returns a string containing the movie and rental.
     */
    public String generateMovieResult() {
        StringBuilder movieResult = new StringBuilder(movie.getTitle())
                .append('\t')
                .append(movie.calculateAmount(daysRented))
                .append('\n');
        return movieResult.toString();
    }

    /**
     * Calculates the amount owed by the rental of the movie.
     * @return returns the amount calculated.
     */
    public double calculateAmount() {
        return movie.calculateAmount(daysRented);
    }

    /**
     * Calculates the frequent renter points earned by renting the movie.
     * @return returns the frequent renter points earned.
     */
    public int calculateFrequentRenterPoints() {
        return movie.calculateFrequentRenterPoints(daysRented);
    }
}
