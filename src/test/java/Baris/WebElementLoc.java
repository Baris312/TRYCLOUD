package Baris;

import Utilities.Driver;
import Utilities.Login;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class WebElementLoc
    {


        @Test
     public void loc() throws InterruptedException
            {
                WebDriver driver = Driver.getDriver();
                LoginSetup(driver);

                WebElement file= driver.findElement(By.xpath("//ul[@id= 'appmenu']//li[2]"));

                Assert.assertTrue(file.isDisplayed());



            }
    }


////ul[@id= 'appmenu']//li[2]