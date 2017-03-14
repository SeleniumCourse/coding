package com.jalasoft.selenium.daniel.jauregui.shapes;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * SeleniumExample.
 * @author Daniel Jauregui
 */
public class SeleniumExample {
    /**
     * testSelenium.
     */
    @Test
    public void testSelenium() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        final int timeWait = 30;
        final int timeWaitImp = 15;
        driver.manage().timeouts().implicitlyWait(timeWaitImp, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeWait);
        driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fname")));
        WebElement firstNameTextField = driver.findElement(By.cssSelector("#fname"));
        WebElement lastNameTextField = driver.findElement(By.name("lname"));
        System.out.print("\n" + firstNameTextField.isEnabled());
        System.out.print("\n" + lastNameTextField.isEnabled());
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Bike']")));
        WebElement bikeCheck = driver.findElement(By.cssSelector("input[value='Bike']"));

        // Select Check box
        if (!bikeCheck.isSelected()) {
            bikeCheck.click();
        }

        // Clear Check box
        if (!bikeCheck.isSelected()) {
            bikeCheck.click();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='male']")));
        WebElement maleRadioBtn = driver.findElement(By.cssSelector("input[value='male']"));
        maleRadioBtn.click();

        Select selectBox = new Select(driver.findElement(By.xpath("//select")));
        selectBox.selectByValue("UK");
        selectBox.selectByVisibleText("Opel");
        final int selctIndex = 3;
        selectBox.selectByIndex(selctIndex);

        Select selectBoxList = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
        selectBoxList.selectByValue("MEX");

        WebElement btnAdd = driver.findElement(By.xpath("//input[@value='->']"));
        btnAdd.click();

        Select selectBoxListDestination = new Select(driver.findElement(By.xpath("//select[@name='ToLB']")));
        selectBoxListDestination.selectByValue("MEX");

        assertEquals("Mexico", selectBoxListDestination.getFirstSelectedOption().getText());
    }
}
