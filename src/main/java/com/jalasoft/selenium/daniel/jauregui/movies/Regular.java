package com.jalasoft.selenium.daniel.jauregui.movies;

public class Regular extends aMovie {

    public Regular(String _title, int bonus) {
        super(_title,bonus);
    }

    @Override
    public double calculateRate(int rentedDays, double thisAmount) {
        if (rentedDays <= 0) { return 0; }
        thisAmount += 2;
        if (rentedDays > 2)
            thisAmount += (rentedDays - 2) * 1.5;
        return thisAmount;
    }
}
