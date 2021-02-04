package Baris;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestCase2_Invalid_User_CR
    {
       /*
            Test case #2 - verify user cannot login with invalid credentials
            1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
            2. Enter valid username invalid password
            3. Click login button
            4. Message “Wrong username or password.” should be displayed
            5. Page title and url should be same


   */



@Test
public void inValidCredential()
    {
        WebDriver driver = Driver.getDriver();

        //1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1

        driver.get("http://qa.trycloud.net/index.php/login?clear=1");

        String loginPageUrl = "http://qa.trycloud.net/index.php/login?";
        //2. username box locator
        WebElement userBox=  driver.findElement(By.name("user"));

        // 3.   password box locator
        WebElement passwordBox= driver.findElement(By.name("password"));

        //  4.  login button locator
        WebElement loginButton = driver.findElement(By.id("submit-form"));

        Wait.Wait(6);
        //2. Enter valid username
        //3. Enter invalid password

        userBox.sendKeys("User19");
        passwordBox.sendKeys("invalid");
        loginButton.click();

        Wait.Wait(3);
        // 4 -Message “Wrong username or password.” should be displayed

      WebElement invalidMsg = driver.findElement(By.xpath("//p[@class ='warning wrongPasswordMsg']"));
      String invalidMsgText  = invalidMsg.getText();

      Assert.assertTrue(invalidMsg.isDisplayed());
      Assert.assertEquals(invalidMsgText,"Wrong username or password.", "there was other message");

        String actualUrl =  driver.getCurrentUrl();

        //5. Verify the URL is changed
          Assert.assertTrue(actualUrl.contains(loginPageUrl),"Wrong Url displayed");


    }



@AfterClass
 public void ThreadClose()
    {
        Driver.getDriver().close();
    }

    }
