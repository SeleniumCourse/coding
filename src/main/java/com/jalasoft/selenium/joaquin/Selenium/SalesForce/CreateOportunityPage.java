package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Joaquin Gonzales on 3/15/2017.
 */
public class CreateOportunityPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By opportunityTextField = By.xpath("//span[text()='Opportunity Name']/ancestor::label/following-sibling::input");
    private By opportunityAccountTextField = By.cssSelector("input[placeholder = 'Search Accounts']");
    private By closeDateField = By.cssSelector("div[class='form-element'] input");
    private By stageSelect = By.cssSelector("div[aria-label='Stage - Stage*Qualification'] a[class='select']");

    public CreateOportunityPage(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
    }
    public void setOpportunityNameTextField(String opportunityName)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(opportunityTextField));
        driver.findElement(opportunityTextField).sendKeys(opportunityName);
    }
    public void setOpportunityAccountTextField(String opportunityAccount)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(opportunityAccountTextField));
        driver.findElement(opportunityAccountTextField).click();
        driver.findElement(By.cssSelector(String.format("div[title='%s']", opportunityAccount))).click();
    }
    public void setCloseDate(String date)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(closeDateField));
        driver.findElement(closeDateField).sendKeys(date);
    }
    public void selectStage(String selection)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(stageSelect));
        driver.findElement(stageSelect).click();
        driver.findElement(By.cssSelector(String.format("a[title='%s']", selection))).click();
    }
}
