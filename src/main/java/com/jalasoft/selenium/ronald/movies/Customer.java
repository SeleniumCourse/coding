package com.jalasoft.selenium.ronald.movies;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Customer class.
 * @author ronald_butron
 */
class Customer {
    private String name;
    private Vector rentals = new Vector();

    /**
     * Constructor.
     *
     * @param name customer name.
     */
    Customer(final String name) {
        this.name = name;
    }

    /**
     * Add rental.
     * @param arg Rental objected
     */
    public void addRental(final Rental arg) {
        rentals.addElement(arg);
    }

    /**
     * Get costumer name.
     * @return customer name
     */
    public String getName() {
        return name;
    }

    /**
     * Calculate statement value fo account.
     *
     * @return statement of account.
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            thisAmount += each.getMovie().calculateAmount(each.getDaysRented());

            // add frequent renter points
            frequentRenterPoints++;

            // add bonus for a two day new release rental
            if ((each.getMovie() instanceof NewReleaseMovie) && each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }

            //show figures for this rental
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append(thisAmount).append("\n");
            totalAmount += thisAmount;
        }

        //add footer lines
        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(String.valueOf(frequentRenterPoints)).append(" frequent renter points");
        return  result.toString();
    }
}
