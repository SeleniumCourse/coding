package com.jalasoft.selenium.Ariel.movies;

public abstract class Movie {
    static final int FREQUENT_RENTER_POINTS = 1;
    private String _title;

    Movie(String title) {
        _title = title;
    }

    public String getTitle() {
        return _title;
    }

    public abstract double calculateAmount(int daysRented);

    public int calculateFrequentRenterPoints(int daysRented) {
        return FREQUENT_RENTER_POINTS;
    }
}
