package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Joaquin Gonzales on 3/20/2017.
 */
public class NavigationBar {

    private NavigationBar()
    {

    }
    public static OportunityPage clickOpportunity()
    {
        WebDriver driver = DriverManager.getInstance().getDriver();
        WebDriverWait wait = DriverManager.getInstance().getWait();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Opportunities']")));
        driver.findElement(By.cssSelector("a[title='Opportunities']")).click();
        return new OportunityPage();
    }
    public static AccountPage clickAccountTab()
    {
        WebDriver driver = DriverManager.getInstance().getDriver();;
        WebDriverWait wait = DriverManager.getInstance().getWait();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Accounts']")));
        driver.findElement(By.cssSelector("a[title='Accounts']")).click();
        return new AccountPage();
    }
}
