package com.jalasoft.selenium.alex.movies;

/**
 * Created by Alex Alvarez on 3/7/2017.
 */
public abstract class Movie {
    private String title;
    double thisAmount = 0;
    int frecuentPoint = 1;

    public abstract double calculateThisAmount(int daysRented);

    public int getFrecuentPoint(int daysRented){
        return frecuentPoint;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
