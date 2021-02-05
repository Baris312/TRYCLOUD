package Aya;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class UserStory6 {

    @Test
    public void TestCase1(){
        //Test case #1 - verify users can access to Talks module
        //1. Login as a user
        //2. Click “Notes” module
        //3. Verify the page tile/URL is Notes module’s tile

        WebDriver driver = Driver.getDriver();
        LoginSetup(driver);
        Wait.Wait(3);

        //2. Click “Notes” module
        WebElement deckModule = driver.findElement(By.xpath("//ul[@id= 'appmenu']//li[10]"));

        deckModule.click();
        Wait.Wait(3);








    }



}


