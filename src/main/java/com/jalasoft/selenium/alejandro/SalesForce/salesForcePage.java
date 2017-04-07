package com.jalasoft.selenium.alejandro.SalesForce;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alejandro Alcocer on 3/13/2017.
 */
public class salesForcePage {
    private final String userString = "Alejandro Alcocer";

    @Test
    public void logIn() {
        System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("https://login.salesforce.com/");

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("alejandro.alcocer@jalasoft.com");

        WebElement passUserName = driver.findElement(By.id("password"));
        passUserName.sendKeys("Gibson4!");

        WebElement logInUserName = driver.findElement(By.id("Login"));
        logInUserName.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("profileTrigger")));
        WebElement userImage = driver.findElement(By.className("profileTrigger"));
        userImage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".profile-card-name .profile-link-label")));
        WebElement userNameLabel = driver.findElement(By.cssSelector(".profile-card-name .profile-link-label"));
        String actualUserName = userNameLabel.getText();

        System.out.println("This is the users name: " + userString);
        Assert.assertEquals(userString, actualUserName);
    }
}
