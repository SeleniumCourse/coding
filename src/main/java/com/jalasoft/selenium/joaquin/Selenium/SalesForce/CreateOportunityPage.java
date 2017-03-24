package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.apache.bcel.generic.NEW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Joaquin Gonzales on 3/15/2017.
 */
public class CreateOportunityPage extends BasePage{

       private By opportunityTextField = By.xpath("//span[text()='Opportunity Name']/ancestor::label/following-sibling::input");
    private By opportunityAccountTextField = By.cssSelector("input[placeholder = 'Search Accounts']");
    private By closeDateField = By.cssSelector("div[class='form-element'] input");
    private By stageSelect = By.cssSelector("div[aria-label='Stage - Stage*Qualification'] a[class='select']");
    private By saveButton = By.cssSelector("button[title='Save']");
    private By typeDropBox = By.cssSelector("div[aria-label='Type - Type'] a[class='select']");
    private By budgetConfirm = By.cssSelector("div[class='uiInput uiInputCheckbox uiInput--default uiInput--checkbox'] input[data-interactive-lib-uid='15']");
    private By lossReason = By.cssSelector("a[aria-label='Loss Reason']");
    //private By lossReasonSelection = By.cssSelector("a[title='Lost to Competitor']");
    private By nextStepTextField = By.cssSelector("div[aria-label='Next Step - Next Step'] input");
    private By descriptionTextArea = By.cssSelector("div[data-aura-class='uiInput uiInputTextArea uiInput--default uiInput--textarea'] textarea");
    private By probabilityTextField = By.cssSelector("div[aria-label='Probability (%) - Probability (%)'] input");
    private By amountTextField = By.cssSelector("div[aria-label='Amount - Amount'] input");

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
    public void selectType(String typeAccount)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(typeDropBox));
        driver.findElement(typeDropBox).click();
        driver.findElement(By.cssSelector(String.format("a[title='%s']", typeAccount))).click();
    }
    public void setBudgetConfirm()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(budgetConfirm));
        driver.findElement(budgetConfirm).click();
    }
    public void selectLossReason(String lossSelection)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lossReason));
        driver.findElement(lossReason).click();
        driver.findElement(By.cssSelector(String.format("a[title='%s']", lossSelection))).click();
    }
    public void setNextStep(String nextStepText)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nextStepTextField));
        driver.findElement(nextStepTextField).sendKeys(nextStepText);
    }
    public void setDescriptionTextArea(String description)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(descriptionTextArea));
        driver.findElement(descriptionTextArea).sendKeys(description);
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
    public void setProbabilityTextField(String probality)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(probabilityTextField));
        driver.findElement(probabilityTextField).sendKeys();
    }
    public void setAmountTextField(String amount)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(amountTextField));
        driver.findElement(amountTextField).sendKeys(amount);
    }
    public void saveOpportunity()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton));
        driver.findElement(saveButton).click();
        //return new OportunityPage(driver,wait);
    }
}
