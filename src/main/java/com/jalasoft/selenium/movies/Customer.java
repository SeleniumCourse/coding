package com.jalasoft.selenium.movies;

import java.util.ArrayList;
import java.util.Iterator;

class Customer {
    private final String _name;
    private final ArrayList<Rental> _rentals = new ArrayList();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }
    
    public ArrayList getRentals() {
        return _rentals;
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Iterator<Rental> rentals = _rentals.iterator();
        String result = "Rental Record for " + getName() + "\n";
        Rental each;
        double thisAmount;
        while (rentals.hasNext()) {
            each = (Rental) rentals.next();
            // Get rate of movie
            thisAmount = each.getMovie().calculateRate(each.getDaysRented(), 0);
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
