package Rauf;

import Baris.LoginTask1;
import Cassandra.ModulesTask;
import Utilities.Driver;
import Utilities.Login;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TalkModule {

    @Test
    public  void talks_module() {

        // Test case #1 - verify users can access to Talks module
        // 1. Login as a user

        WebDriver driver = Driver.getDriver();
        Login.LoginSetup(driver);
        Wait.Wait(2);

        // 2. Click Talks module
       WebElement talks= Driver.getDriver().findElement(By.xpath("//li[@data-id='spreed'][1]"));
       talks.click();
        //  3. Verify the page tile is Talks module’s tile
        WebElement modulesTile= Driver.getDriver().findElement(By.xpath("//input[@type='text']"));
         modulesTile.isDisplayed();
        String actualResult = Driver.getDriver().findElement(By.xpath("//input[@type='text']")).getAttribute("placeholder");
        String expectedResult = "Search conversations or users";

        Assert.assertEquals(actualResult, expectedResult, "FAILED!!!");


   // @Test




    }



}
