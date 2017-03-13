package com.jalasoft.selenium.daniel.jauregui.movies;

/**
 * Class Children.
 */
public class Children extends MovieAbs {
    private static final int REST_DAYS = 3;
    private static final double MULTIPLY_RENTED_DAYS = 1.5;
    /**
    * Constructor of Children.
     * @param title will contain the name of Movie.
     * @param bonus will give to the movie a bonus.
    */
    Children(final String title, final int bonus) {
        super(title, bonus);
    }

    /**
     *
     * @param rentedDays: number of day where movie was rented.
     * @return
     */
    @Override
    public double calculateRate(final int rentedDays) {
        if (rentedDays <= 0) {
            return 0;
        }
        double thisAmount = MULTIPLY_RENTED_DAYS;
        if (rentedDays > REST_DAYS) {
            thisAmount += (rentedDays - REST_DAYS) * MULTIPLY_RENTED_DAYS;
        }
        return thisAmount;
    }
}
