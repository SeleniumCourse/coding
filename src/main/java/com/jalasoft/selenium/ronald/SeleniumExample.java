package com.jalasoft.selenium.ronald;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * @author bsronald on 3/10/17.
 */
public class SeleniumExample {

    @Test
    public void testSelenium() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromeDriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
        WebElement firstNameTextField = driver.findElement(By.id("fname"));
        firstNameTextField.sendKeys("Ronald");
        WebElement lastNameTextField = driver.findElement(By.name("lname"));
        System.out.println(lastNameTextField.isEnabled());
        WebElement checkBoxBike = driver.findElement(By.cssSelector("input[value='Bike']"));

        // Select checkBox
        if (!checkBoxBike.isSelected()) {
            checkBoxBike.click();
        }


        //Clear checkBox
        if (checkBoxBike.isSelected()) {
            checkBoxBike.click();
        }

        WebElement radioButtonMale =  driver.findElement(By.cssSelector("input[value='male']"));

        //Click on radioButton
        radioButtonMale.click();

        // select list
        Select selectBox = new Select(driver.findElement(By.xpath("//Select")));
        selectBox.selectByValue("UK");
        selectBox.selectByVisibleText("Opel");
        selectBox.selectByIndex(3);

        Select selectTable = new Select(driver.findElement(By.name("FromLB")));
        WebElement buttonA = driver.findElement(By.cssSelector("input[value='->']"));
        List<WebElement> selectTableB = driver.findElements(By.name("ToLB"));
        System.out.println(selectTableB);
        selectTable.selectByValue("DEU");
        String text = null;
        buttonA.click();
        for (WebElement element : selectTableB) {
            System.out.println(element);
            System.out.println(element.getAttribute("value"));
            if (element.getAttribute("value").equals("DEU")) {
                text = element.getText();
                break;
            }
        }

        Assert.assertEquals("Germany", text);







//        driver.quit();

    }


}
