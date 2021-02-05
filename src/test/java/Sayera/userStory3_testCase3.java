package Sayera;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class userStory3_testCase3 {

    @Test
    public void TestCase3(){

        //User Story #3 : As a user, I should be able to access to Files module
        // Test Case #3 :

        // 1.Login as a user
        WebDriver driver = Driver.getDriver();


        LoginSetup(driver);
        Wait.Wait(1);


        // 2.Click action-icon from any file on the page

        //Locate Files module on the web page:
        WebElement files = driver.findElement(By.xpath("//ul[@id='appmenu']/li[2]/a"));
        //Click Files module on the web page:
        files.click();

        Wait.Wait(1);

        //Locate the action-icon (three dots) on the web page:
        WebElement actionIcon = driver.findElement(By.xpath("//*[@id='fileList']/tr/td[2]/a/span[3]/a[2]"));
        //Click the action-icon (three dots) on the web page:
        actionIcon.click();

        Wait.Wait(1);

        // 3.Choose “Add to Favorites” option
        //Locate the Add to favorites (bubble menu)option on web page:
        WebElement addFavoritesLocator = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[3]/a/span[2]"));

        //Click the Add to favorites (bubble menu) option on web page:
        addFavoritesLocator.click();

        Wait.Wait(1);

        // 4.Click “Favorites” sub-module on the lest side

        //Locate the “Favorites” sub-module on the left side
        WebElement subModuleFavorites = driver.findElement(By.xpath("//*[@id='app-navigation']/ul/li[3]/a"));
        //*[@id="app-navigation"]/ul/li[3]/a

        //Click “Favorites” sub-module on the lest side:
        subModuleFavorites.click();

        Wait.Wait(1);

        // 5.Verify the chosen file is listed on the table
        // (Pre-condition: there should be at least 1 file is uploaded)

        //Boolean Assertion:



        //Assert.assertEquals(actualResult, expectedResult, "File is not listed in Favorites");



        Wait.Wait(3);


//hhh
        //Driver.closeDriver();
//WebElement favoritesFile = driver.findElement(By.xpath("//*[@id='fileList']/tr/td[1]/a"));

        //Click “Favorites” sub-module on the lest side:
        //favoritesFile.click();

    }

    //Story: As a user, I should be able to access to Files module






    }
