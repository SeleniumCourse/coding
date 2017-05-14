package com.jalasoft.selenium.leonardo.movies;

/**
 * Created by Automation on 3/6/2017.
 */
public class movieType {

    /**
     * Regular, New Release, Childrens 0, 1, 2
     */
    public void movieType() {
    }

    /**
     * @param priceCode  code of the price
     * @param daysRented number of days rented
     * @return amoung owed
     */
    public double getAmount(int priceCode, int daysRented) {
        double thisAmount = 0;
        switch (priceCode) {
            case 0:
                thisAmount += 2;
                if (daysRented > 2)
                    thisAmount += (daysRented - 2) * 1.5;
                break;
            case 1:
                thisAmount += daysRented * 3;
                break;
            case 2:
                thisAmount += 1.5;
                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 1.5;
                break;
        }
        return thisAmount;
    }
}