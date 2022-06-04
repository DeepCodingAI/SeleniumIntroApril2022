package amazonbusiness;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class LaunchAmazon {

    public WebDriver driver = null;

    @BeforeMethod
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "/Users/matiur/develop/aint/SeleniumAprill2022/SeleniumProject1/src/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.amazon.com/");
    }

    @AfterMethod
    public void cleanUp(){
        driver.close(); //closing the browser
    }
}
