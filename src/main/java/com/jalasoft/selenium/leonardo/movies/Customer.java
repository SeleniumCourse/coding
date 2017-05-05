package com.jalasoft.selenium.leonardo.movies;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 */
public class Customer {
    private String name;
    private Vector rentalsV = new Vector();

    /**
     *
     * @param nameM name of the customer
     */
    public Customer(String nameM) {
        name = nameM;
    }

    /**
     *
     * @param arg add rental data to the vector
     */
    public void addRental(Rental arg) {
        rentalsV.addElement(arg);
    }

    /**
     *
     * @return name of the customer
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the statement format of what the customer owes from rentals
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = rentalsV.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR: /**0*/
                    thisAmount += 2;
                    if (each.getDaysRented() > 2) {
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE: /**1*/
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS: /**2*/
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3) {
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    }
                    break;
                default: break;
            }
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                    &&
                    each.getDaysRented() > 1) { frequentRenterPoints++; }
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

    /**
     * this method is the initial refactor
     * @return the statement format of what the customer owes from rentals
     */

    public String statement2() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = rentalsV.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line

            thisAmount = each.getMovie().getAmount(each.getMovie().getPriceCode(),each.getDaysRented());

            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                    &&
                    each.getDaysRented() > 1) { frequentRenterPoints++; }
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
