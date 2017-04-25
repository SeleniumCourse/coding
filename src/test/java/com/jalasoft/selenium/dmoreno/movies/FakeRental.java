package com.jalasoft.selenium.dmoreno.movies;

/**
 *
 */
public class FakeRental extends Rental {

    private double testRentalAmount;

    private int testFrequentRenterPoints;

    /**
     *
     */
    public FakeRental() {
        super(null, 0);
    }

    /**
     * @param testRentalAmount The amount.
     */
    public void setTestRentalAmount(final double testRentalAmount) {
        this.testRentalAmount = testRentalAmount;
    }

    /**
     * @param testFrequentRenterPoints The points.
     */
    public void setTestFrequentRenterPoints(final int testFrequentRenterPoints) {
        this.testFrequentRenterPoints = testFrequentRenterPoints;
    }

    /**
     * @return
     */
    @Override
    public double calculateRentalAmount() {
        return testRentalAmount;
    }

    /**
     * @return
     */
    @Override
    public int getFrequentRenterPoints() {
        return testFrequentRenterPoints;
    }
}
