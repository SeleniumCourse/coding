package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Joaquin Gonzales on 3/24/2017.
 */
public class ActionUtil {
    public static void sendText(WebElement webElement, String text)
    {
        DriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(text);
    }
    public static void clickButton(WebElement webElement)
    {
        DriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }
}
