package com.jalasoft.selenium.joaquin.Selenium.SalesForce;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.WebDriverWait;

        import java.util.concurrent.TimeUnit;

/**
 * Created by Joaquin Gonzales on 3/20/2017.
 */
public class DriverManager {
    private static DriverManager instance;
    private WebDriver driver;
    private WebDriverWait wait;
    private DriverManager()
    {
        System.setProperty("webdriver.chore.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,30);
    }

    public static DriverManager getInstance()
    {
        if (instance == null)
        {
            instance = new DriverManager();
        }
        return instance;
    }
    public WebDriver getDriver()
    {
        return driver;
    }
    public WebDriverWait getWait()
    {
        return wait;
    }
}