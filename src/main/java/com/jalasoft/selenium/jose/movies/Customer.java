package com.jalasoft.selenium.jose.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Updated by Jose Rioja on 3/21/2017.
 */
class Customer {
    private String name;
    private List<Rental> rentals;

    /**
     * @param name This is the customer name.
     */
    Customer(final String name) {
        this.name = name;
        rentals = new ArrayList<>();
    }

    /**
     * This method add rentals object to the vector.
     * @param arg This is a rental value that will be added to the vector.
     */
    public void addRental(final Rental arg) {
        rentals.add(arg);
    }

    /**
     * This method gets the customer name.
     * @return returns the customer name.
     */
    public String getName() {
        return name;
    }

    /**
     * This method returns a string with the amount owed and frequent renter points earned.
     * @return returns a string.
     */
    public String statement() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ").append(this.name).append('\n');
        rentals.forEach(rental -> result.append('\t').append(rental.generateMovieResult()));
        result.append("Amount owed is ").append(this.calculateTotalAmount()).append('\n');
        result.append("You earned ").append(this.calculateFrequentRenterPoints()).append(" frequent renter points");
        return result.toString();
    }

    /**
     * Calculate the charges for all rented movies.
     * @return returns the total amount.
     */
    public double calculateTotalAmount() {
        return rentals.stream().mapToDouble(Rental::calculateAmount).sum();
    }

    /**
     * Calculate the frequent renter points for all rented movies.
     * @return returns the total frequent renter points.
     */
    public int calculateFrequentRenterPoints() {
        return rentals.stream().mapToInt(Rental::calculateFrequentRenterPoints).sum();
    }

    /**
     * Method that returns the list of rentals.
     * @return rental list.
     */
    public List<Rental> getRentals() {
        return this.rentals;
    }
}
