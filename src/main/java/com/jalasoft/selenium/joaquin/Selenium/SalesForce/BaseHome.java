package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.openqa.selenium.By;

/**
 * Created by Joaquin Gonzales on 3/20/2017.
 */
public abstract class BaseHome extends BasePage{
    protected By newButton = By.cssSelector("div[title='New']");
    protected abstract BasePage clickNew();
}
