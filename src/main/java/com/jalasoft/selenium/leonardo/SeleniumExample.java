package com.jalasoft.selenium.leonardo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Automation on 3/10/2017.
 */
public class SeleniumExample {

    @Test
    public void testSelenium(){

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");

        WebElement firstNameTextField = driver.findElement(By.id("fname"));
        firstNameTextField.sendKeys("Carlos");

        WebElement lastNameTextField = driver.findElement(By.name("lname"));
        System.out.println(firstNameTextField.isEnabled());
        System.out.println(lastNameTextField.isEnabled());

        WebElement bikeCheckBox = driver.findElement(By.cssSelector("input[value='Bike'"));

        //select checkbox
        if(!bikeCheckBox.isSelected()) {
            bikeCheckBox.click();
            System.out.println("was not selected");
        }

        //clear checkbox
        if(bikeCheckBox.isSelected()) {
            bikeCheckBox.click();
            System.out.println("was selected");
        }


        WebElement maleRadioButton = driver.findElement(By.cssSelector("input[value='male']"));
        maleRadioButton.click();

        //aplica a select normales <select>
        Select selectBox = new Select(driver.findElement(By.xpath("//select")));

        selectBox.selectByValue("UK");

        selectBox.selectByVisibleText("Opel");

        selectBox.selectByIndex(3);

        Select selectBoxMultipleL = new Select(driver.findElement(By.name("FromLB")));

        //single select in multiple
                selectBoxMultipleL.selectByValue("JPN");
        WebElement buttonToRight = driver.findElement(By.cssSelector("input[value='->']"));
        buttonToRight.click();

        //multiple select in multiple
        selectBoxMultipleL.selectByValue("ESP");
        selectBoxMultipleL.selectByValue("RUS");
        selectBoxMultipleL.selectByValue("IND");
        buttonToRight.click();

        Select selectBoxMultipleR = new Select(driver.findElement(By.name("ToLB")));
        selectBoxMultipleR.selectByValue("IND");

        WebElement buttonToLeft = driver.findElement(By.cssSelector("input[value='<-']"));
        buttonToLeft.click();


        System.out.println();



    }
}
