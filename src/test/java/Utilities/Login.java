package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login
    {
        public static void LoginSetup(WebDriver driver)
            {

               driver.get("http://qa3.trycloud.net/index.php/login");
                // driver.findElement()
                WebElement userBox=  driver.findElement(By.name("user"));
                WebElement passwordBox= driver.findElement(By.name("password"));
                WebElement loginButton = driver.findElement(By.id("submit-form"));

                Wait.Wait(6);

                userBox.sendKeys("User19");
                passwordBox.sendKeys("Userpass123");
                loginButton.click();

            }


    }
