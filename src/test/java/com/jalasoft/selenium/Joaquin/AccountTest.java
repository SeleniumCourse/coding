package com.jalasoft.selenium.Joaquin;

import com.jalasoft.selenium.joaquin.Selenium.SalesForce.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Joaquin Gonzales on 3/24/2017.
 */
public class AccountTest {
    @BeforeClass
    public static void login()
    {
        LoginPage.loginAs("joaquinjqn2@gmail.com","P4ssw0rd_1");
    }
    @Test
    public void accountTest()
    {
        AccountPage accountPage = NavigationBar.clickAccountTab();
        CreateAccountPage createAccountPage = accountPage.clickNew();
    }
}
