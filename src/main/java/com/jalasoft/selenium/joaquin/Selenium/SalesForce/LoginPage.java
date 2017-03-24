package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Joaquin Gonzales on 3/15/2017.
 */
public class LoginPage extends BasePage {

    private By username = By.id("username");
    private By password = By.id("password");
    private By login = By.id("Login");

    public void setUserNameTextField(String userName)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(username));
        driver.findElement(username).sendKeys(userName);
    }
    public void setPasswordField(String passwordByClient)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).sendKeys(passwordByClient);
    }
    public HomePage clickLoginButton()
    {
        wait.until(ExpectedConditions.elementToBeClickable(login));
        driver.findElement(login).click();
        return new HomePage();
    }

}

