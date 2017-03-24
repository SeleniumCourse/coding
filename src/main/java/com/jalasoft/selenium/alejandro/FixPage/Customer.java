package com.jalasoft.selenium.alejandro.FixPage;

import java.util.ArrayList;
import java.util.List;

/**
 * Customer Class.
 */
public class Customer {
    private final String name;
    private final List<Rental> rentals;
    private final double onePointFive = 1.5;
    private final int numberTwo = 2;
    private final int numberThree = 3;

    /**
     *
     * @param name anArray.
     */
    public Customer(final String name) {
        this.name = name;
        rentals = new ArrayList();
    }

    /**
     *
     * @param arg recive something.
     */
    public void addRental(final Rental arg) {
        rentals.add(arg);
    }

    /**
     *
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return dont know.
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        String result = "Rental Record for " + getName() + "\n";
        for (Rental each: rentals) {
            double thisAmount = 0;
            //determine amounts for each line
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += numberTwo;
                    if (each.getDaysRented() > numberTwo) {
                        thisAmount += (each.getDaysRented() - numberTwo) * onePointFive;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * numberThree;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += onePointFive;
                    if (each.getDaysRented() > numberThree) {
                        thisAmount += (each.getDaysRented() - numberThree) * onePointFive;
                    }
                    break;
                default:

            }
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                    && each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        return result;
    }
}
