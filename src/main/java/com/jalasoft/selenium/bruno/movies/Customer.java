package com.jalasoft.selenium.bruno.movies;

import java.util.ArrayList;
import java.util.List;


/**
 * This class represents a Customer.
 */
class Customer {
    private static final String BRAKE_LINE = "\n";
    private static final String TABULATION = "\t";
    private String customerName;
    private List<Rental> rentalList = new ArrayList<>();

    /**
     * Constructor of a Custumer.
     *
     * @param name of customer.
     */
    Customer(final String name) {
        customerName = name;
    }

    /**
     * This method adds a new rental.
     *
     * @param newRental to be added.
     */
    public void addRental(final Rental newRental) {
        rentalList.add(newRental);
    }

    /**
     * This method gets the customer name.
     *
     * @return customer name.
     */
    public String getName() {
        return customerName;
    }

    /**
     * This method creates the ticket.
     *
     * @return the ticket
     */
    public String statement() {

        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ").append(getName()).append(BRAKE_LINE);
        for (Rental rentals : rentalList) {
            result.append(TABULATION).append(rentals.getMovie().getTitle()).append(TABULATION);
        }
        result.append("Amount owed is ").append(calculateTotalAmount()).append(BRAKE_LINE);
        result.append(BRAKE_LINE);
        result.append("You earned ").append(calculateTotalFrequentRentalPoints()).append(BRAKE_LINE);
        result.append(" frequent renter points");
        return result.toString();
    }

    /**
     * This method get the frequent renter points.
     *
     * @param frequentRenterPoints of a customer.
     * @param rentals              made by customer.
     * @return the frequent renter points.
     */
    public int getFrequentRenterPoints(final int frequentRenterPoints, final Rental rentals) {
        int count = frequentRenterPoints;
        count++;
        if (rentals.getDaysRented() > 1) {
            count++;
        }
        return count;
    }

    /**
     * this method will be used to get rentals list.
     *
     * @return rentals list.
     */
    public List<Rental> getRentalList() {
        return rentalList;
    }

    /**
     * This method is going to calculate Total amount.
     *
     * @return Total amount.
     */
    private double calculateTotalAmount() {
        double totalAmount = 0;
        double thisAmount;
        for (Rental rentals : rentalList) {
            thisAmount = rentals.getMovie().calculateMovieAmount(rentals.getDaysRented());
            totalAmount += thisAmount;
        }
        return totalAmount;
    }

    /**
     * This method is going to calculate frequent rental points.
     *
     * @return total frequent rental points.
     */
    private double calculateTotalFrequentRentalPoints() {
        int frequentRenterPoints = 0;
        for (Rental rentals : rentalList) {
            frequentRenterPoints = getFrequentRenterPoints(frequentRenterPoints, rentals);
        }
        return frequentRenterPoints;
    }
}
