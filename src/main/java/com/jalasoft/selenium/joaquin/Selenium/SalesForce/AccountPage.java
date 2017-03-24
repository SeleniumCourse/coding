package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Joaquin Gonzales on 3/23/2017.
 */
public class AccountPage extends BaseHome {
    @Override
    protected CreateAccountPage clickNew() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(newButton));
        driver.findElement(newButton);
        return new CreateAccountPage();
    }
}
