package com.jalasoft.selenium.leonardo.movies;

/**
 * Created by Automation on 3/6/2017.
 */
public class movieType {

    /** Regular, New Release, Childrens 0, 1, 2*/
    public void movieType(){
        }

    public double getAmount(int priceCode, int daysRented){
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
/**
    public double calculateAmount(double daysRented){
        double thisAmount = 0;
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (each.getDaysRented() > 2)
                    thisAmount += (each.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += each.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (each.getDaysRented() > 3)
                    thisAmount += (each.getDaysRented() - 3) * 1.5;
                break;
        }

    }
 */
}

/**
public class childrens extends movieType {

    private final int priceCode = 2;

    public childrens(){}

    public double calculateAmount(){

    }
}

public class regular extends movieType {

    private final int priceCode = 0;

    public regular(){}

    public double calculateAmount(){

    }
}

public class new_release extends movieType {

    private final int priceCode = 1;

    public new_release(){}

    public double calculateAmount(){

    }
}
*/
