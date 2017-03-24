package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Joaquin Gonzales on 3/20/2017.
 */
public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public BasePage()
    {
        driver = DriverManager.getInstance().getDriver();
        wait = DriverManager.getInstance().getWait();
    }
}
