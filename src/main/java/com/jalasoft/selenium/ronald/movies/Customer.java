package com.jalasoft.selenium.ronald.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Customer class.
 * @author ronald_butron
 */
public class Customer {
    private String name;
    private List<Rental> rentals;
    private StringBuilder result;

    /**
     * Get rental list.
     *
     * @return rental list
     */
    public List<Rental> getRentals() {
        return rentals;
    }

    /**
     * Constructor.
     *
     * @param name customer name.
     */
    public Customer(final String name) {
        this.name = name;
        this.result = new StringBuilder("Rental Record for " + getName() + "\n");
        this.rentals = new ArrayList<>();
    }

    /**
     * Add rental.
     * @param arg Rental objected
     */
    public void addRental(final Rental arg) {
        rentals.add(arg);
    }

    /**
     * Get costumer name.
     * @return customer name
     */
    public String getName() {
        return name;
    }

    /**
     * Generate statement value fo account.
     *
     * @return statement of account.
     */
    public String statement() {
        double totalAmount = calculateTotalAmount();
        int frequentRenterPoints = getFrequentPoints();

        return addResultFooterLines(String.valueOf(totalAmount), String.valueOf(frequentRenterPoints));
    }

    /**
     * Calculate FrequentPoints.
     *
     * @return frequent points
     */
    private int getFrequentPoints() {

        return rentals.stream().mapToInt(rental -> rental.getMovie().
                                getFrequentRenterPoint(rental.getDaysRented(),
                                        rental.getMovie().getClass().toString())).sum();
    }

    /**
     * Calculate Total Amount.
     *
     * @return total amount value
     */
    private double calculateTotalAmount() {
        double totalAmount = 0;
        rentals.forEach((it) ->
                setFiguresForRental(it.getMovie().calculateAmount(it.getDaysRented()), it.getMovie().getTitle()));
        totalAmount = rentals.stream().mapToDouble(rental ->
                rental.getMovie().calculateAmount(rental.getDaysRented())).sum();

        return totalAmount;
    }


    /**
     * This method set figures rental.
     *
     * @param thisAmount amount for rental
     * @param title movie title
     */
    private void setFiguresForRental(double thisAmount, String title) {
        //show figures for this rental
        result.append("\t")
                .append(title)
                .append("\t").append(thisAmount)
                .append("\n");
    }

    /**
     * This method add footer lines to statement result.
     *
     * @param totalAmount total amount value
     * @param frequentRenterPoints frequent Renter points
     * @return footer lines added to result
     */
    private String addResultFooterLines(String totalAmount, String frequentRenterPoints) {
        //add footer lines
        result.append("Amount owed is ")
                .append(totalAmount)
                .append("\n");
        result.append("You earned ")
                .append(String.valueOf(frequentRenterPoints))
                .append(" frequent renter points");

        return result.toString();
    }
}
