package com.jalasoft.selenium.daniel.jauregui.movies;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Customer class.
 * @author Daniel Jauregui
 */
class Customer {
    private final String name;
    private final ArrayList<Rental> rentals = new ArrayList<Rental>();
    private double totalAmount;
    private int frequentRenterPoints;
    private StringBuilder statement;

    /**
     * Constructor of Customer class.
     * @param name : Name of the customer.
     */
    Customer(final String name) {
        this.name = name;
        this.totalAmount = 0;
        this.frequentRenterPoints = 0;
        this.statement.append("ental Record for ").append(this.name).append("\n");
    }

    /**
     * addRental will add the movies that customer is renting.
     * @param arg : will have a Rental object.
     */
    public void addRental(final Rental arg) {
        this.rentals.add(arg);
    }

    /**
     * getStatement.
     * @return the string of statement of customer
     */
    public StringBuilder getStatement() {
        return statement;
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
        Iterator<Rental> rentalsLocal = this.rentals.iterator();
        while (rentalsLocal.hasNext()) {
            sumAmount(calculateAmount((Rental) rentalsLocal.next()));
            calculateFrequentRenterPoints((Rental) rentalsLocal.next());
            appedStatement((Rental) rentalsLocal.next());
        }
        printStatement();
    }

    /**
     * appedStatement.
     * @param each movie of customer.
     */
    public void appedStatement(final Rental each) {
        this.statement.append("\t").append(each.getMovie().getTitle())
                .append("\t").append(calculateAmount(each)).append("\n");
    }

    /**
     * calculateFrequentRenterPoints.
     * @param each movie of customer.
     */
    public void calculateFrequentRenterPoints(final Rental each) {
        this.frequentRenterPoints += each.getMovie()
                .calculateBonus(each.getDaysRented());
    }

    /**
     * sumAmount.
     * @param thisAmount movie rented.
     */
    public void sumAmount(final double thisAmount) {
        this.totalAmount += thisAmount;
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
     */
    public void printStatement() {
        this.statement.append("Amount owed is ")
                .append(String.valueOf(this.totalAmount)).append("\n")
                .append("You earned ")
                .append(String.valueOf(this.frequentRenterPoints))
                .append(" frequent renter points");
        System.out.println(this.statement);
    }
}
