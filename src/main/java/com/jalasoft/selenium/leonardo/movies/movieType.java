package com.jalasoft.selenium;

/**
 * Created by Automation on 3/6/2017.
 */
public abstract class movieType {

    public double calculateAmount;
}


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

