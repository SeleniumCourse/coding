package com.jalasoft.selenium.ariel.movies;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

/**
 * Created by ariel Mattos on 3/6/2017.
 */

class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    /**
     * Creates a Children movie with the given title.
     * @param name          the name of the customer.
     */
    Customer(final String name) {
        this.name = name;
    }

    /**
     * Add a movie rental object to the list of the user's movie rentals.
     * @param rental        a movie rental object.
     */
    public void addRental(final Rental rental) {
        rentals.add(rental);
    }

    /**
     * Returns the name of the user.
     * @return              a String containing the name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a statement of the movie rentals, total charges and frequent renter points.
     * @return               a string containing the movie rentals, total charges and frequent renter points.
     */
    public String statement() {
        StringBuilder report = new StringBuilder(format("Rental Record for %s %n", name));

        rentals.forEach(rental -> report.append(rental.calculateFigure()));

        report.append(format("Amount owed is %f %n", calculateTotalAmount()));
        report.append(format("You earned %d frequent renter points.", calculateFrequentRenterPoints()));

        return report.toString();
    }

    /**
     * Calculate the total charges for all rented movies.
     * @return              the total amount owed by the customer.
     */
    public double calculateTotalAmount() {
        return rentals.stream().mapToDouble(Rental::calculateAmount).sum();
    }

    /**
     * Calculate the total frequent renter points accumulated for all rented movies.
     * @return              the total frequent renter points of the customer.
     */
    public int calculateFrequentRenterPoints() {
        return rentals.stream().mapToInt(Rental::calculateFrequentRenterPoints).sum();
    }
}

