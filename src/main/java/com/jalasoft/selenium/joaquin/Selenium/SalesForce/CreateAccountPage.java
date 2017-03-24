package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Joaquin Gonzales on 3/23/2017.
 */
public class CreateAccountPage extends BasePage {
    public By accountNameTextField = By.cssSelector("div[data-aura-class='uiInput witsSuggestedNameField uiInput--default'] input");
    public By setTypeAccount = By.cssSelector("div[aria-label='Type - Type'] a[class='select']");


    public void setAccountName(String accountName)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountNameTextField));
        driver.findElement(accountNameTextField).sendKeys(accountName);
    }
    public void setTypeAccount(String typeAccount)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(setTypeAccount));
        driver.findElement(setTypeAccount).click();
        driver.findElement(By.cssSelector(String.format("a[title='%s']",typeAccount))).click();
    }
}
