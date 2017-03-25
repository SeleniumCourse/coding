package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Joaquin Gonzales on 3/15/2017.
 */
public class LoginPage extends BasePage {

    @FindBy(id="username")
    private WebElement usernameTextField;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="Login")
    private WebElement login;

    public void setUserNameTextField(String userName)
    {
       ActionUtil.sendText(usernameTextField,userName);
    }
    public void setPasswordField(String passwordByClient)
    {
        ActionUtil.sendText(password,passwordByClient);
    }
    public HomePage clickLoginButton()
    {
        ActionUtil.clickButton(login);
        return new HomePage();
    }
    public static HomePage loginAs(String user, String pass)
    {
        WebDriver driver = DriverManager.getInstance().getDriver();
        String title = "Login | Salesforce";
        String title2 = driver.getCurrentUrl();
        if (title.equals(title2))
        {
            LoginPage login = new LoginPage();
            login.setUserNameTextField(user);
            login.setPasswordField(pass);
            login.clickLoginButton();
        }
        else{
        return new HomePage();
        }
        /*
        boolean present;
        try {
            driver.findElement(By.cssSelector(".profileTrigger"));
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
        if (present)
        {

        }*/
        return new HomePage();
    }

}

