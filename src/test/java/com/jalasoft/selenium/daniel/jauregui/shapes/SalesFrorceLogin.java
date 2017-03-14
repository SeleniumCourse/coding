package com.jalasoft.selenium.daniel.jauregui.shapes;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * SalesFrorceLogin.
 * @author Daniel Jauregui
 */
public class SalesFrorceLogin {

    /**
     * Test login to Sales Force.
     */
    @Test
    public void testLogin() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Set Time
        final int timeImp = 15;
        final int timeExp = 30;
        driver.manage().timeouts().implicitlyWait(timeImp, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeExp);
        // Open initial page.
        driver.get("http://login.salesforce.com");
        // Wait,find set username.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        WebElement loginTextField = driver.findElement(By.id("username"));
        loginTextField.sendKeys("daniel.jauregui@outlook.com");
        // Wait,find set password.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        WebElement passwordTextField = driver.findElement(By.id("password"));
        passwordTextField.sendKeys("daniel.123");
        // Wait click,find click login button.
        wait.until(ExpectedConditions.elementToBeClickable(By.id("Login")));
        WebElement loginBtn = driver.findElement(By.id("Login"));
        loginBtn.click();
        // Wait click,find and click Profile iamge button.
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".profileTrigger")));
        WebElement usrbtn = driver.findElement(By.cssSelector(".profileTrigger"));
        usrbtn.click();
        // Wait,find and assert login usner name.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .cssSelector(".profile-card-name .profile-link-label")));
        WebElement statrlbl = driver.findElement(By.cssSelector(".profile-card-name .profile-link-labe"));
        assertEquals("daniel jauregui", statrlbl.getText());
    }
}
