package com.jalasoft.selenium.daniel.jauregui.movies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Customer class.
 * @author Daniel Jauregui
 */
class Customer {
    private final String name;
    private final List<Rental> rentals;

    /**
     * Constructor of Customer class.
     * @param name : Name of the customer.
     */
    Customer(final String name) {
        this.name = name;
        rentals = new ArrayList<Rental>();
    }


    /**
     * addRental will add the movies that customer is renting.
     * @param arg : will have a Rental object.
     */
    public void addRental(final Rental arg) {
        this.rentals.add(arg);
    }

    /**
     * getRentals.
     * @return : Get Object with all rentals of customer.
     */
    public List<Rental> getRentals() {
        return this.rentals;
    }

    /**
     * Get the Name of Customer.
     * @return : Will return the name of Customer.
     */
    public String getName() {
        return this.name;
    }

    /**
     * appedStatement.
     * @param each Rental movie
     * @param detail of movies rented
     * @return an StringBuilder with new detail.
     */
    public StringBuilder appedStatement(final Rental each, final String detail) {
        return new StringBuilder().append(detail)
                .append("\t").append(each.getMovie().getTitle())
                .append("\t").append(String.valueOf(calculateAmount(each)))
                .append("\n");
    }

    /**
     * calculateAmount.
     * @param each movie of customer.
     * @return calculate amount for current movie.
     */
    public double calculateAmount(final Rental each) {
        return each.getMovie().calculateRate(each.getDaysRented());
    }

    /**
     * printStatement.
     * @return the text of Statement
     */
    public String printStatement() {
        return new StringBuilder().append("Rental Record for ")
                .append(getName()).append("\n")
                .append(this.rentals.stream().map(rental->(new StringBuilder()
                        .append("\t").append(rental.getMovie().getTitle())
                        .append("\t").append(String.valueOf(calculateAmount(rental)))
                        .append("\n"))).collect(Collectors.joining("")))
                .append("Amount owed is ")
                .append(calculateTotalAmount())
                .append("\n")
                .append("You earned ")
                .append(calculateTotalFrequentRenterPoints())
                .append(" frequent renter points").toString();
    }

    /**
     * calculateTotalAmount.
     * @return double number
     */
    public double calculateTotalAmount() {
          return this.rentals.stream().mapToDouble(rental->calculateAmount(rental)).sum();
      }

    /**
     * calculateTotalFrequentRenterPoints.
     * @return int number
     */
    public int calculateTotalFrequentRenterPoints() {
        return this.rentals.stream().mapToInt(rental->rental.getMovie().calculateBonus(rental.getDaysRented())).sum();
    }
}
