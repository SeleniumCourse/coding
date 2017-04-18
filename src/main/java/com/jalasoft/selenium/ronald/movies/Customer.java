package com.jalasoft.selenium.ronald.movies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Customer class.
 * @author ronald_butron
 */
public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

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
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Iterator<Rental> rentals = this.rentals.iterator();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

        while (rentals.hasNext()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.next();
            thisAmount += each.getMovie().calculateAmount(each.getDaysRented());

            // add frequent renter points
            frequentRenterPoints += each.getMovie().getFrequentRenterPoint(each.getDaysRented(),
                    each.getMovie().getClass().toString());

            //show figures for this rental
            result.append("\t")
                    .append(each.getMovie().getTitle())
                    .append("\t").append(thisAmount)
                    .append("\n");
            totalAmount += thisAmount;
        }

        //add footer lines
        result.append("Amount owed is ")
                .append(totalAmount)
                .append("\n");
        result.append("You earned ")
                .append(String.valueOf(frequentRenterPoints))
                .append(" frequent renter points");
        return  result.toString();
    }
}
