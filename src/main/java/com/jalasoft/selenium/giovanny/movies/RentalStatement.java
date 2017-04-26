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
    private List<Rental> rentals = new ArrayList<Rental>();
    private double totalAmount;
    private int frequentRenterPoints;

    /**
     * Class constructor.
     *
     * @param customerName the name of the client
     */
    public RentalStatement(final String customerName) {
        this.name = customerName;
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

    /**
     * Method that creates the rental statement.
     *
     * @return the rental statement built
     */
    public String makeRentalStatement() {
        clearTotals();
        return makeHeader() + makeRentalLines() + makeSummary();
    }

    /**
     * Method that clears the totals acting as reset.
     */
    private void clearTotals() {
        totalAmount = 0;
        frequentRenterPoints = 0;
    }

    /**
     * Method that builds the header for the statement.
     *
     * @return the statement header
     */
    private String makeHeader() {
        return "Rental Record for " + getName() + "\n";
    }

    /**
     * Method that builds the rental lines
     * inside the list.
     *
     * @return the rental lines
     */
    private String makeRentalLines() {
        StringBuffer buf = new StringBuffer();
        for (Rental rental : rentals) {
            buf.append(makeRentalLine(rental));
        }
        return buf.toString();
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
        frequentRenterPoints += rental.determineFrequentRentPoints();
        totalAmount += thisAmount;

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
        return "\t" + rental.getTitle() + "\t" + thisAmount + "\n";
    }

    /**
     * Methods that creates the summary response.
     *
     * @return the output formatted as summary
     */
    private String makeSummary() {
        return "You owed " + totalAmount + "\n"
                + "You earned " + frequentRenterPoints
                + " frequent renter points\n";
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
    public double getAmountOwed() {
        return totalAmount;
    }

    /**
     * Method that returns the frequent renter points
     * of the client.
     *
     * @return the value
     */
    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }
}
