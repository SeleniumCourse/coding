package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Joaquin Gonzales on 3/15/2017.
 */
public class HomePage extends BasePage {

    private By profileItem = By.cssSelector(".profileTrigger");
    private By profileNameText = By.cssSelector(".profile-card-name .profile-link-label");
    //private By oportunitiesTab = By.cssSelector("a[title='Opportunities']");

    public void clickProfileIcon()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(profileItem));
        driver.findElement(profileItem).click();
    }
    public String getProfileName()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(profileNameText));
        return driver.findElement(profileNameText).getText();
    }
    public OportunityPage clikOportunitiesTab()
    {
       return NavigationBar.clickOpportunity();
       /* wait.until(ExpectedConditions.visibilityOfElementLocated(oportunitiesTab));
        driver.findElement(oportunitiesTab).click();
        return new OportunityPage();*/
    }
}
