package com.jalasoft.selenium.joaquin.Selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Joaquin Gonzales on 3/14/2017.
 */
public class SeleniumSalesForce {

    @Test
    public void loginPage()
    {
        System.setProperty("webdriver.chore.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        WebDriverWait wait = new WebDriverWait(driver,30);

        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("joaquinjqn2@mailinator.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("P4ssw0rd_1");

        WebElement loginButton = driver.findElement(By.id("Login"));
        loginButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("profileTrigger")));
        WebElement userImage = driver.findElement(By.className("profileTrigger"));
        userImage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".profile-card-name .profile-link-label")));
        WebElement userName = driver.findElement(By.cssSelector(".profile-card-name .profile-link-label"));
        String actualResult = userName.getText();

        String expectedResult = "Joaquin Gonzales";

        Assert.assertEquals(actualResult,expectedResult);
    }
}
