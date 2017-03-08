package com.jala.selenium.movie;

public abstract class Movie {

    protected String _title;
    protected int _priceCode;

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }

    abstract double calculateAmount(int daysRented);
}
