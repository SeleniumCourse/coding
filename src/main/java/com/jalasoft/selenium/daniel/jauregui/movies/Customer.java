package com.jalasoft.selenium.daniel.jauregui.movies;

import java.util.ArrayList;

/**
 * Customer class.
 * @author Daniel Jauregui
 */
class Customer {
    private final String name;
    private final ArrayList<Rental> rentals = new ArrayList<Rental>();
    private String statement;

    /**
     * Constructor of Customer class.
     * @param name : Name of the customer.
     */
    Customer(final String name) {
        this.name = name;
        this.statement = "";
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
    public ArrayList<Rental> getRentals() {
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
     * Generate the Statement Rentals of Customer.
     */
    public void statement() {
        for (Rental rental : this.rentals) {
            appedStatement(rental);
        }
    }

    /**
     * appedStatement.
     * @param each movie of customer.
     */
    public void appedStatement(final Rental each) {
        this.statement =  new StringBuilder().append(this.statement)
                .append("\t").append(each.getMovie().getTitle())
                .append("\t").append(String.valueOf(calculateAmount(each)))
                .append("\n").toString();
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
                .append(this.statement)
                .append("Amount owed is ")
                .append(String.valueOf(calculateTotalAmount()))
                .append("\n")
                .append("You earned ")
                .append(String.valueOf(calculateTotalFrequentRenterPoints()))
                .append(" frequent renter points").toString();
    }

    /**
     * calculateTotalAmount.
     * @return double number
     */
    public double calculateTotalAmount() {
        double sumAmount = 0;
        for (Rental rental : this.rentals) {
            sumAmount += calculateAmount(rental);
        }
        return sumAmount;
    }

    /**
     * calculateTotalFrequentRenterPoints.
     * @return int number
     */
    public int calculateTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : this.rentals) {
            frequentRenterPoints += rental.getMovie().calculateBonus(rental.getDaysRented());
        }
        return frequentRenterPoints;
    }
}
