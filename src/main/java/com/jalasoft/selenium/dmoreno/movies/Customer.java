package com.jalasoft.selenium.dmoreno.movies;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 */
public class Customer {
    private String name;
    private Vector rentals = new Vector();

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
        rentals.addElement(rental);
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
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        StringBuilder resultBuilder = new StringBuilder("Rental Record for " + getName() + "\n");
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount = each.calculateRentalAmount();

            // add frequent renter points
            // add bonus for a two day new release rental
            frequentRenterPoints += (1 + each.getFrequentRenterPoints());

            //show figures for this rental
            resultBuilder.append("\t" + each.getMovie().getTitle() + "\t"
                    + String.valueOf(thisAmount) + "\n");
            totalAmount += thisAmount;
        }
        //add footer lines
        resultBuilder.append("Amount owed is " + totalAmount + "\n");
        resultBuilder.append("You earned " + frequentRenterPoints + " frequent renter points");

        return resultBuilder.toString();
    }
}
