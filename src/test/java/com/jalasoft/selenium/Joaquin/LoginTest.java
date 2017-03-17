package com.jalasoft.selenium.Joaquin;

        import com.jalasoft.selenium.joaquin.Selenium.SalesForce.CreateOportunityPage;
        import com.jalasoft.selenium.joaquin.Selenium.SalesForce.HomePage;
        import com.jalasoft.selenium.joaquin.Selenium.SalesForce.LoginPage;
        import com.jalasoft.selenium.joaquin.Selenium.SalesForce.OportunityPage;
        import org.junit.Assert;
        import org.junit.Test;

/**
 * Created by Joaquin Gonzales on 3/15/2017.
 */
public class LoginTest {
    @Test
    public void testLogin()
    {
        LoginPage login = new LoginPage();
        login.setUserNameTextField("joaquinjqn2@mailinator.com");
        login.setPasswordField("P4ssw0rd_1");
        HomePage homepage = login.clickLoginButton();
        homepage.clickProfileIcon();
        final String actualProfileName = homepage.getProfileName();

        //Then
        final String expectedProfileName = "Joaquin Gonzales";
        Assert.assertEquals(expectedProfileName,actualProfileName);
    }
    @Test
    public void testOpportunities()
    {
        LoginPage login = new LoginPage();
        login.setUserNameTextField("joaquinjqn2@mailinator.com");
        login.setPasswordField("P4ssw0rd_1");
        HomePage home= login.clickLoginButton();
        OportunityPage opportunityPage = home.clikOportunitiesTab();
        CreateOportunityPage createOpportunityPage = opportunityPage.clickNewOpportunity();
        createOpportunityPage.setOpportunityNameTextField("joaquin");
    }
}
