package com.jalasoft.selenium.dmoreno.autom01;

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
 * Created by Daniel Moreno on 3/10/2017.
 */
public class SeleniumExample1 {

    /**
     *
     */
    @Test
    public void logicTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        final long implicitWaitTimeout = 20;
        driver.manage().timeouts().implicitlyWait(implicitWaitTimeout, TimeUnit.SECONDS);
        final long driverWaitTimeout = 30;
        WebDriverWait driverWait = new WebDriverWait(driver, driverWaitTimeout);

        driver.get("https://login.salesforce.com/");

        WebElement userInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement logInButton = driver.findElement(By.id("Login"));

        userInput.sendKeys("daniel.moreno@jalasoft.com");
        passwordInput.sendKeys("Curso2017");
        logInButton.click();

        WebElement appLauncherButton = driverWait.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.bBottom button.bare")));
        appLauncherButton.click();
    }

    /**
     * @throws InterruptedException exception
     */
    @Test
    public void testSelenium1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        final long driverWaitTimeout = 30;
        WebDriverWait driverWait = new WebDriverWait(driver, driverWaitTimeout);

        driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");

        WebElement firstNameTestField = driver.findElement(By.id("fname"));
        firstNameTestField.sendKeys("Daniel");

        WebElement lastNameTestField = driver.findElement(By.name("lname"));

        System.out.println(firstNameTestField.isEnabled());
        System.out.println(lastNameTestField.isEnabled());

        WebElement bikeCheckbox = driver.findElement(By.cssSelector("input[value='Bike']"));
        if (!bikeCheckbox.isSelected()) {
            bikeCheckbox.click();
        } else if (!bikeCheckbox.isSelected()) {
            bikeCheckbox.click();
        }

        WebElement maleRadioButton = driver.findElement(By.cssSelector("input[value='male']"));
        maleRadioButton.click();

        Select selectBox = new Select(driver.findElement(By.xpath("//select")));

        final long waitInterval = 1500;
        selectBox.selectByVisibleText("Audi");
        Thread.sleep(waitInterval);

        selectBox.selectByValue("UK");
        Thread.sleep(waitInterval);
        selectBox.selectByIndex(2);

        Select fromSelectBox = new Select(driver.findElement(By.name("FromLB")));
        Select toSelectBox = new Select(driver.findElement(By.name("ToLB")));
        WebElement moveRightButton = driver.findElement(By.cssSelector("input[value='->']"));
        fromSelectBox.selectByIndex(0);
        moveRightButton.click();

        for (WebElement option : toSelectBox.getOptions()) {
            System.out.println(option.getText());
        }

        WebElement submitButton = driver.findElement(By.id("submitButton"));
        driverWait.until(ExpectedConditions.elementToBeClickable(submitButton));

        System.out.println("submitButton is clickable.");
    }
}
