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
public class LoginPage {
    public WebDriver driver;
    public WebDriverWait wait;
    private By username = By.id("username");
    private By password = By.id("password");
    private By login = By.id("Login");

    public LoginPage()
    {
        System.setProperty("webdriver.chore.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://login.salesforce.com/");
        wait = new WebDriverWait(driver,30);
    }
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
        return new HomePage(driver,wait);
    }

}

