package Ibrahim;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class TestCase_7 {

    @Test
    public void TestCase7() {

        WebDriver driver = Driver.getDriver();

        //# Setup and open browser
        LoginSetup(driver);

        //# 2 min Thread sleep
        Wait.Wait(2);

        //# found selector of search icon
        WebElement SearchIcon = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[1]/a/span"));

        //# click the seach icon on home page
        SearchIcon.click();

        //# click the search box that had expanded opened after clicking the search Icon
        driver.findElement(By.xpath("//*[@id=\"header-menu-unified-search\"]/div[2]/div[1]/form/input")).click();

        //# send the "text2" in the search box
        driver.findElement(By.xpath("//*[@id=\"header-menu-unified-search\"]/div[2]/div[1]/form/input")).sendKeys("test2");

        //# find selector about "text2" that is already displayed,  After we write the "text2"
        WebElement Test2Display = driver.findElement(By.xpath("//*[@id=\"header-menu-unified-search\"]/div[2]/ul/li[1]/a/span/h3/span/strong"));

        // wait 1 min
        Wait.Wait(1);

        //# Is "text2" displayed or not when we write the "text2"
        Assert.assertTrue(Test2Display.isDisplayed(), "Test2 Is not found!!");


        // close the browser
        driver.close();

    }


}
