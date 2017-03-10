package com.jalasoft.selenium.daniel.jauregui.movies;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Customer class.
 * @author Daniel Jauregui
 */
class Customer {
    private final String name;
    private final ArrayList<Rental> rentals = new ArrayList();
    /**
     * Constructor of Customer class.
     * @param name : Name of the customer.
     */
    public Customer(final String name) {
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
    public ArrayList getRentals() {
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
        Iterator<Rental> rentals = this.rentals.iterator();
        String result = "Rental Record for " + getName() + "\n";
        Rental each;
        double thisAmount;
        while (rentals.hasNext()) {
            each = (Rental) rentals.next();
            // Get rate of movie
            thisAmount = each.getMovie().calculateRate(each.getDaysRented());
            // add frequent renter points and bonus for a two day new release rental
            frequentRenterPoints += each.getMovie().calculateBonus(each.getDaysRented());
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t";
            result += String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
}
