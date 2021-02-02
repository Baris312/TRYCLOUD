package Baris;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        WebDriver driver =Driver.getDriver();


        LoginSetup(driver);
        Wait.Wait(7);
//       WebElement userBox=  driver.findElement(By.name("user"));
//       WebElement passwordBox= driver.findElement(By.name("password"));
//       WebElement loginButton = driver.findElement(By.id("submit-form"));
//
//
//       userBox.sendKeys("User19");
//       passwordBox.sendKeys("Userpass123");
//       loginButton.click();



    }

@AfterClass
  public void afterClass()
    {
     //  Driver.closeDriver();

    }
    }
