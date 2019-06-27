package NameProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class StartClass {
    public static WebDriver driver = null;

    @BeforeMethod
    public void preClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Ilona\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");
    }
    @AfterMethod
    public void teardownTest () {
        driver.close();
    }
}
