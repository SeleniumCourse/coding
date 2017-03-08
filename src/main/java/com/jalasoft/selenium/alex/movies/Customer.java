package com.jalasoft.selenium.alex.movies;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Alex Alvarez on 3/7/2017.
 */
public class Customer {
    private String name;
    private double totalAmount = 0;
    private int frequentRenterPoints = 0;
    private Vector rentals = new Vector();
    private StringBuilder result;

    /**
     * Constructor.
     * @param name customer name
     */
    public Customer(final String name) {
        this.name = name;
        this.result = new StringBuilder();
    }

    /**
     * add rentals to rentals vector.
     * @param arg new rental to be added to renatl vector
     */
    public void addRental(final Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    private void calculateMoviesParameters(){
        Enumeration rentals = this.rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            totalAmount += each.getMovie().calculateThisAmount(each.getDaysRented());
            // add frequent renter points
            frequentRenterPoints += each.getMovie().getFrecuentPoint(each.getDaysRented());

            //show figures for this rental
            result.append("\t");
            result.append(each.getMovie().getTitle());
            result.append("\t");
            result.append(each.getMovie().calculateThisAmount(each.getDaysRented()));
            result.append("\n");
        }
    }

    public String statement() {
        result.append("Rental Record for " + getName() + "\n");
        calculateMoviesParameters();

        //add footer lines
        result.append("Amount owed is " + String.valueOf(totalAmount) + "\n");
        result.append("You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points");
        return result.toString();
    }
}
