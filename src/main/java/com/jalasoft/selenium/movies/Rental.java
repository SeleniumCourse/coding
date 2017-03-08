package com.jalasoft.selenium.movies;

class Rental {
    private final aMovie _movie;
    private final int _daysRented;

    public Rental(aMovie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public aMovie getMovie() {
        return _movie;
    }
}