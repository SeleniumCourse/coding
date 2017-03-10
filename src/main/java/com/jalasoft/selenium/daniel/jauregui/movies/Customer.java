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
    /**
     * Constructor of Customer class.
     * @param name : Name of the customer.
     */
    Customer(final String name) {
        this.name = name;
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
     * @return : Will return the summary of Customer Statement
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Iterator<Rental> rentalsLocal = this.rentals.iterator();
        Rental each;
        double thisAmount;
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ").append(getName()).append("\n");
        while (rentalsLocal.hasNext()) {
            each = (Rental) rentalsLocal.next();
            // Get rate of movie
            thisAmount = each.getMovie().calculateRate(each.getDaysRented());
            // add frequent renter points, bonus for two day new release rental
            frequentRenterPoints += each.getMovie()
                    .calculateBonus(each.getDaysRented());
            //show figures for this rental
            result.append("\t").append(each.getMovie().getTitle())
                    .append("\t").append(String.valueOf(thisAmount))
                    .append("\n");
            totalAmount += thisAmount;
        }
        //add footer lines
        result.append("Amount owed is ").append(String.valueOf(totalAmount))
                .append("\n");
        result.append("You earned ")
                .append(String.valueOf(frequentRenterPoints))
                .append(" frequent renter points");
        return result.toString();
    }
}
