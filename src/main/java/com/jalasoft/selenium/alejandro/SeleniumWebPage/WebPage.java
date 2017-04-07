package com.jalasoft.selenium.alejandro.SeleniumWebPage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


/**
 * Created by Alejandro Alcocer on 3/13/2017.
 */
public class WebPage {
    @Test
    public void testSelenium(){
        System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement firstNameTextField = driver.findElement(By.id("fname"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id ("fname")));
        firstNameTextField.sendKeys("Alejandro");

        WebElement lastNameTextField = driver.findElement(By.name("lname"));
        //lastNameTextField.sendKeys("Alcocer");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Bike']")));
        WebElement bikeCheckBox = driver.findElement(By.cssSelector("input[value='Bike']"));

        //select bike
        if (!bikeCheckBox.isSelected()){
            bikeCheckBox.click();
        }
        //clear
        /*if (bikeCheckBox.isSelected())
        {
            bikeCheckBox.click();
        }*/
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='male']")));
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
        WebElement actualItem = selectCountryReceive.getFirstSelectedOption();
        //actualItem.click();
        String actualResult = actualItem.getText();
        System.out.println("this is the actual result:" + actualResult);
        String expectedResult = "Germany";
        System.out.println("this is the expected result:" + expectedResult);
        Assert.assertEquals("Germany", "Germany");


        /*selectBox.selectByVisibleText("Opel");
        selectBox.selectByIndex(3);
        bikeCheckBox.click();
        bikeCheckBox.click();*/
        System.out.println(firstNameTextField.isEnabled());
        System.out.println(lastNameTextField.isEnabled());
    }

}
