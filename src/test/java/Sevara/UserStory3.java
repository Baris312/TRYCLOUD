package Sevara;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class UserStory3 {
    @Test

    public void UserStory3Case1()

    {
        //Test case #1 - verify users can access to Files module
        //1. Login as a user
        //2. Verify the page tile is Files module’s tile

        WebDriver driver = Driver.getDriver();


        LoginSetup(driver);
        Wait.Wait(7);

        //2. Click “Files” module
        WebElement filesModule = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[2]/a"));

        filesModule.click();
        Wait.Wait(3);


        //==========================================================================

        //TestCase #2
        //1. Login as a user
        //2. Click the top left checkbox of the table
        //Pre-condition: there should be at least 2 files are uploaded the page
        //3. Assert all the files are selected1


        //1. Login as a user - in order to concatenate 2 test cases I skiped that step


        //2. Click the top left checkbox of the table
        //Pre-condition: there should be at least 2 files are uploaded the page

        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"headerSelection\"]/label"));

        checkbox.click();
        Wait.Wait(3);

        //3. Assert all the files are selected1

    }
}

