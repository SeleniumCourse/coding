package com.jalasoft.selenium.leonardo.movies;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 */
public class Customer {
    private String name;
    private Vector rentalsV = new Vector();
    private double totalAmount;
    private int frequentRenterPoints;
    String movieListString;

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
    public double getTotalAmount() { return totalAmount; }
    public int getFrequentRenterPoints() { return frequentRenterPoints; }
    public String getMovieListString() { return movieListString; }

   /**
     * this method is the initial refactor, took out the string printing out, made this method obtain values that can
     * be obtained by GET
     */
    public void generateStatement() {
        totalAmount = 0;
        frequentRenterPoints = 0;
        Enumeration rentals = rentalsV.elements();
        movieListString = "";
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
            movieListString += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
    }

    public String textOfStatement() {
        String result = "Rental Record for " + getName() + "\n";
        result += getMovieListString();
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) +
                "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        return result;
    }
}
