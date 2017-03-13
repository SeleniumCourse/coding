package com.jalasoft.selenium.alejandro.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Joaquin Gonzales on 3/10/2017.
 */
public class SeleniumExample {
    @Test
    public void testSelenium() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");

        WebElement firstNameTextField = driver.findElement(By.id("fname"));
        firstNameTextField.sendKeys("Alejandro");

        WebElement lastNameTextField = driver.findElement(By.name("lname"));
        //lastNameTextField.sendKeys("Alcocer");

        WebElement bikeCheckBox = driver.findElement(By.cssSelector("input[value='Bike']"));

        //clear
        if (bikeCheckBox.isSelected()) {
            bikeCheckBox.click();
        }
        //select bike
        if (!bikeCheckBox.isSelected()) {
            bikeCheckBox.click();
        }

        WebElement generedRadioButton = driver.findElement(By.cssSelector("input[value='male']"));
        generedRadioButton.click();

        WebElement countrySelector = driver.findElement(By.name("FromLB"));
        //countrySelector.

        /*System.out.println(firstNameTextField.isEnabled());
        System.out.println(lastNameTextField.isEnabled());*/
    }
}