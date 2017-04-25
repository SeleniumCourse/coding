package com.jalasoft.selenium.dmoreno.movies;


import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Customer {
    private final String name;
    private final List<Rental> rentals = new ArrayList<Rental>();

    /**
     * @param name name
     */
    public Customer(final String name) {
        this.name = name;
    }

    /**
     * @param rental rental
     */
    public void addRental(final Rental rental) {
        rentals.add(rental);
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return statement
     */
    public String statement() {
        StringBuilder resultBuilder = new StringBuilder("Rental Record for " + getName() + "\n");

        for (Rental each : this.rentals) {
            //show figures for this rental
            resultBuilder.append("\t" + each.getMovie().getTitle() + "\t"
                    + String.valueOf(each.calculateRentalAmount()) + "\n");
        }
        //add footer lines
        resultBuilder.append("Amount owed is " + this.calculateTotalAmount() + "\n");
        resultBuilder.append("You earned " + this.calculateFrequentRenterPoints() + " frequent renter points");

        return resultBuilder.toString();
    }

    /**
     * @return The total amount.
     */
    public double calculateTotalAmount() {
        double totalAmount = 0;

        for (Rental each : this.rentals) {
            totalAmount += each.calculateRentalAmount();
        }

        return totalAmount;
    }

    /**
     * @return The renter points.
     */
    public int calculateFrequentRenterPoints() {
        int frequentRenterPoints = 0;

        for (Rental each : this.rentals) {
            // add frequent renter points
            // add bonus for a two day new release rental
            frequentRenterPoints += (1 + each.getFrequentRenterPoints());
        }

        return frequentRenterPoints;
    }
}
