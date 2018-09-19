package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;
    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.gecko.driver", "/Users/faroquechowdhury/IdeaProjects/autoproject/driver/chromedriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");


    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

}
