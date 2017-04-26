package com.jalasoft.selenium.giovanny.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that lists and displays the
 * rentals amount and the frequent renter points.
 *
 * Created by xianqe on 4/25/2017.
 */
public class RentalStatement {
    private String name;
    private List<Rental> rentals;

    /**
     * Class constructor.
     *
     * @param customerName the name of the client
     */
    public RentalStatement(final String customerName) {
        this.name = customerName;
        rentals = new ArrayList<Rental>();
    }

    /**
     * Method that adds a new rent when a costumer
     * had asked for it, it is added to the list.
     *
     * @param rental the rental data to be added
     */
    public void addRental(final Rental rental) {
        rentals.add(rental);
    }

    /** Method that calculates the total amount
     * of rentals done by a costumer.
     *
     * @return the total amount
     */
    public double totalAmount() {
        double result = 0;
        for (Rental rental : rentals) {
            result += rental.determineAmount();
        }
        return result;
    }

    /** Method that calculates the total amount
     * of frequent rent points done by a costumer.
     *
     * @return the total amount
     */
    public int totalFrequentRentPoints() {
        int result = 0;
        for (Rental rental : rentals) {
            result += rental.determineFrequentRentPoints();
        }
        return  result;
    }

    /**
     * Method that builds the header for the statement.
     *
     * @return the statement header
     */
    private String makeHeader() {
        String result = "Rental Record for " + getName() + "\n";
        return result;
    }

    /**
     * Method that builds the rental lines
     * inside the list.
     *
     * @return the rental lines
     */
    private String makeRentalLines() {
        StringBuilder buf = new StringBuilder();
        for (Rental rental : rentals) {
            buf.append(makeRentalLine(rental));
        }
        String result =  buf.toString();
        return result;
    }

    /**
     * Method that builds a rental line
     * to be used then by the other method.
     *
     * @param rental the data for the line created
     * @return the line created
     */
    private String makeRentalLine(final Rental rental) {
        double thisAmount = rental.determineAmount();

        return formatRentalLine(rental, thisAmount);
    }

    /**
     * Method that formats the rental line.
     *
     * @param rental the object from which we obtain the title
     * @param thisAmount the amount calculated
     * @return the line formatted
     */
    private String formatRentalLine(final Rental rental, final double thisAmount) {
        String result = "\t" + rental.getTitle() + "\t" + thisAmount + "\n";
        return result;
    }

    /**
     * Methods that creates the summary response.
     *
     * @return the output formatted as summary
     */
    private String makeSummary() {
        String result = "Amount owed is" + totalAmount() + "\n"
                + "You earned " + totalFrequentRentPoints()
                + " frequent renter points\n";
        return result;
    }

    /**
     * Method that retrieves the client name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Method that returns the amount owed by the client.
     *
     * @return the value
     */

}
