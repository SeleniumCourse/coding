package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Joaquin Gonzales on 3/15/2017.
 */
public class OportunityPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By newButton = By.cssSelector("div[title='New']");

    public OportunityPage(WebDriver driver,WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
    }
    public CreateOportunityPage clickNewOpportunity()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(newButton));
        driver.findElement(newButton).click();
        return new CreateOportunityPage(driver,wait);
    }
}
