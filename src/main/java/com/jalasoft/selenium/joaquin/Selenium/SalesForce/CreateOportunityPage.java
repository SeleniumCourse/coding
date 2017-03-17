package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Joaquin Gonzales on 3/15/2017.
 */
public class CreateOportunityPage {

    public WebDriver driver;
    public WebDriverWait wait;
    public By opportunityTextField = By.xpath("//input[contains(@maxlength,'120')]");

    public CreateOportunityPage(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
    }
    public void setOpportunityNameTextField(String opportunityName)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(opportunityTextField));
        driver.findElement(opportunityTextField).sendKeys(opportunityName);
    }

}
