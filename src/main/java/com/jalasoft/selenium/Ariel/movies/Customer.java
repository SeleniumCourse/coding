package com.jalasoft.selenium.Ariel.movies;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Ariel Mattos on 3/6/2017.
 */

class Customer {
    private String name;
    private Vector rentals = new Vector();

    /**
     * Creates a Children movie with the given title.
     * @param name          the name of the customer.
     */
    Customer(final String name) {
        this.name = name;
    }

    /**
     * Add a movie rental object to the list of the user's movie rentals.
     * @param rental        a movie rental object.
     */
    public void addRental(final Rental rental) {
        rentals.addElement(rental);
    }

    /**
     * Returns the name of the user.
     * @return              a String containing the name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a statement of the movie rentals, total charges and frequent renter points.
     * @return               a string containing the movie rentals, total charges and frequent renter points.
     */
    public String statement() {
        Enumeration rentals = this.rentals.elements();
        StringBuffer report = new StringBuffer();
        report.append("Rental Record for " + getName() + "\n");
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            String rentalFigure = "\t" + each.getMovie().getTitle()
                    + "\t" + String.valueOf(each.getMovie().calculateAmount(each.getDaysRented())) + "\n";
            report.append(rentalFigure);
        }
        report.append("Amount owed is " + String.valueOf(calculateTotalAmount()) + "\n");
        report.append("You earned " + String.valueOf(calculateFrequentRenterPoints()) + " frequent renter points");

        return report.toString();
    }

    /**
     * Calculate the total charges for all rented movies.
     * @return              the total amount owed by the customer.
     */
    public double calculateTotalAmount() {
        double totalAmount = 0;
        Enumeration rentals = this.rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            totalAmount += each.getMovie().calculateAmount(each.getDaysRented());
        }

        return totalAmount;
    }

    /**
     * Calculate the total frequent renter points accumulated for all rented movies.
     * @return              the total frequent renter points of the customer.
     */
    public int calculateFrequentRenterPoints() {
        int totalFrequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            totalFrequentRenterPoints += each.getMovie().calculateAmount(each.getDaysRented());
        }

        return totalFrequentRenterPoints;
    }
}

