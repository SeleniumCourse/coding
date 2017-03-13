package com.jalasoft.selenium.joaquin.Selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Joaquin Gonzales on 3/10/2017.
 */
public class SeleniumExample {
    @Test
    public void testSelenium()
    {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");

        WebElement firstNameTextField = driver.findElement(By.id("fname"));
        firstNameTextField.sendKeys("Joaquin");

        WebElement lastNameTextField = driver.findElement(By.name("lname"));
        //lastNameTextField.sendKeys("Gonzales");

        WebElement bikeCheckBox = driver.findElement(By.cssSelector("input[value='Bike']"));

        //select bike
        if (!bikeCheckBox.isSelected())
        {
            bikeCheckBox.click();
        }
//test
        //clear
        /*if (bikeCheckBox.isSelected())
        {
            bikeCheckBox.click();
        }*/

        WebElement genereRadioButton = driver.findElement(By.cssSelector("input[value='male']"));
        genereRadioButton.click();

        Select selectBox = new Select(driver.findElement(By.xpath("//select")));
        selectBox.selectByValue("UK");

        Select selectCountry = new Select(driver.findElement(By.name("FromLB")));
        selectCountry.selectByValue("DEU");

        WebElement moveButton = driver.findElement(By.cssSelector("input[value='->']"));
        moveButton.click();

        Select selectCountryReceive = new Select(driver.findElement(By.name("ToLB")));
        selectCountryReceive.selectByIndex(0);
        WebElement actualItem= selectCountryReceive.getFirstSelectedOption();
        //actualItem.click();

        String actualResult = actualItem.getText();
        System.out.println("this is the actual result:"+actualResult);
        String expectedResult = "Germany";
        System.out.println("this is the expected result:"+expectedResult);
        Assert.assertEquals("Germany","Germany");


        /*selectBox.selectByVisibleText("Opel");
        selectBox.selectByIndex(3);
        bikeCheckBox.click();
        bikeCheckBox.click();*/
        System.out.println(firstNameTextField.isEnabled());
        System.out.println(lastNameTextField.isEnabled());
    }
}
