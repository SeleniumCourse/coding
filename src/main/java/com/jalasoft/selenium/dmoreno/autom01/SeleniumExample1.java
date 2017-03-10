package com.jalasoft.selenium.dmoreno.autom01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Daniel Moreno on 3/10/2017.
 */
public class SeleniumExample1 {

    @Test
    public void testSelenium1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");

        WebElement firstNameTestField = driver.findElement(By.id("fname"));
        firstNameTestField.sendKeys("Daniel");

        WebElement lastNameTestField = driver.findElement(By.name("lname"));

        System.out.println(firstNameTestField.isEnabled());
        System.out.println(lastNameTestField.isEnabled());

        WebElement bikeCheckbox = driver.findElement(By.cssSelector("input[value='Bike']"));
        if(!bikeCheckbox.isSelected()) {
            bikeCheckbox.click();
        }
        else if(!bikeCheckbox.isSelected()) {
            bikeCheckbox.click();
        }

        WebElement maleRadioButton = driver.findElement(By.cssSelector("input[value='male']"));
        maleRadioButton.click();

        Select selectBox = new Select(driver.findElement(By.xpath("//select")));

        selectBox.selectByVisibleText("Audi");
        Thread.sleep(1500);
        selectBox.selectByValue("UK");
        Thread.sleep(1500);
        selectBox.selectByIndex(2);

        Select fromSelectBox = new Select(driver.findElement(By.name("FromLB")));
        Select toSelectBox = new Select(driver.findElement(By.name("ToLB")));
        WebElement moveRightButton = driver.findElement(By.cssSelector("input[value='->']"));
        fromSelectBox.selectByIndex(0);
        moveRightButton.click();

        for (WebElement option : toSelectBox.getOptions()) {
            System.out.println(option.getText());
        }
    }
}
