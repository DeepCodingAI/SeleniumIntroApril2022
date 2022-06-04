package amazontest;

import amazonbusiness.LaunchAmazon;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestAmazon extends LaunchAmazon {

    @Test
    public void testHomePage(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop", Keys.ENTER);
    }

    @Test
    public void testHomePageTitle(){
        String title = driver.getTitle();
        System.out.println(title);
    }
}
