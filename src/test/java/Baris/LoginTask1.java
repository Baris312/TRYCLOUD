package Baris;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import Utilities.Login;
import javax.swing.text.Utilities;

import static Utilities.Login.LoginSetup;

public class LoginTask1
    {
/*

@Test
  public static void DriverSetup()
    {
        WebDriver  driver  = Driver.getDriver();
        String url= "http://qa.trycloud.net/index.php/login?clear=1";
        Wait.Wait(2);
        driver.get(url);

    }


        Test case #1 - verify user login successfully
1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
2. Enter valid username
3. Enter valid password
4. Click login button
5. Verify the URL is chawed to homepage’s url
(Put this test case in testBase class with an annotation so it runs for all the test case)


//public static void login(WebDriver driver)
//    {
//
//        driver.get("http://qa.trycloud.net/index.php/login?clear=1");
//       // driver.findElement()
//        WebElement userBox=  driver.findElement(By.name("user"));
//        WebElement passwordBox= driver.findElement(By.name("password"));
//        WebElement loginButton = driver.findElement(By.id("submit-form"));
//
//
//        userBox.sendKeys("User19");
//        passwordBox.sendKeys("Userpass123");
//        loginButton.click();
//
//    }
*/
@Test
public void Logintest()
    {
        WebDriver driver = Driver.getDriver();

        //1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1

        driver.get("http://qa3.trycloud.net/");

        String loginPageUrl =  driver.getCurrentUrl();
        //2. username box locator
        WebElement userBox=  driver.findElement(By.name("user"));

       // 3.   password box locator
        WebElement passwordBox= driver.findElement(By.name("password"));

      //  4.  login button locator
        WebElement loginButton = driver.findElement(By.id("submit-form"));

        Wait.Wait(6);
        //2. Enter valid username
        //3. Enter valid password
        //4. Click login button
        userBox.sendKeys("User19");
        passwordBox.sendKeys("Userpass123");
        loginButton.click();



          String actualUrl =  driver.getCurrentUrl();

          //5. Verify the URL is changed
          Assert.assertNotEquals(loginPageUrl,actualUrl);


    }
       @Test
       public void testLoginUrl(){

    // 6-  Verify the URL is changed to homepage’s url
    String expectedUrl ="http://qa3.trycloud.net/index.php";
    String actualUrl = Driver.getDriver().getCurrentUrl();

    Assert.assertTrue(actualUrl.contains(expectedUrl));

       }







@AfterClass
  public void afterClass()
    {
     // Driver.closeDriver();

    }
    }
