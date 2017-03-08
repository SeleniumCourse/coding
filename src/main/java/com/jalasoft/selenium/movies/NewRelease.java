package com.jalasoft.selenium.movies;

public class NewRelease extends aMovie {

    public NewRelease(String _title, int bonus) {
        super(_title, bonus);
    }

    @Override
    public double calculateRate(int rentedDays, double thisAmount) {
        if (rentedDays <= 0) { return 0; }
        thisAmount += rentedDays * 3;
        return thisAmount;
    }
    
}
