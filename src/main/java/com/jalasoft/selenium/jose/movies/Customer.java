package com.jalasoft.selenium.jose.movies;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(final String name) {
        this.name = name;
    }

    public void addRental(final Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            double thisAmount = each.getMovie().calculateAmount(each.getDaysRented());
            // add frequent renter points and add bonus for a two day new release rental
            frequentRenterPoints += each.getMovie().calculateFrequentRenterPoints(each.getDaysRented());
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) +
                "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        return result;
    }
}
