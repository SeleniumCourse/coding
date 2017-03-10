package com.jalasoft.selenium.daniel.jauregui.movies;

/**
 * Class Children.
 */
public class Children extends MovieAbs {
    private final int restOfRentedDays = 3;
    private final double multiplyOfRentedDays = 1.5;
    /**
    * Constructor of Children.
     * @param title will contain the name of Movie.
     * @param bonus will give to the movie a bonus.
    */
    public Children(final String title, final int bonus) {
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
        double thisAmount = multiplyOfRentedDays;
        if (rentedDays > restOfRentedDays) {
            thisAmount += (rentedDays - restOfRentedDays) * multiplyOfRentedDays;
        }
        return thisAmount;
    }
}
