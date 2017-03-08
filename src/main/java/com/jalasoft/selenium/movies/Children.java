package com.jalasoft.selenium.movies;

/**
 * Class Children
 */
public class Children extends aMovie {
    
    public Children(String _title,int bonus) {
        super(_title, bonus);
    }

    @Override
    public double calculateRate(int rentedDays, double thisAmount) {
        if (rentedDays <= 0) { return 0; }
        thisAmount += 1.5;
        if (rentedDays > 3)
            thisAmount += (rentedDays - 3) * 1.5;
        return thisAmount;
    }
}
