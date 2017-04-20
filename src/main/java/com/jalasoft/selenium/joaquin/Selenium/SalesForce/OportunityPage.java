package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Joaquin Gonzales on 3/15/2017.
 */
public class OportunityPage extends BaseHome{

    @Override
    public CreateOportunityPage clickNew() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(newButton));
        driver.findElement(newButton).click();
        return new CreateOportunityPage();
    }
}
