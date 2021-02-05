package Sayera;

import Utilities.Driver;
import Utilities.Login;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class userStory3_testCase4 {

    @Test
    public void TestCase3() {

        //User Story #3 : As a user, I should be able to access to Files module
        //Test case #4 - verify users can remove a file from favorites

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

        // 3.Click “Remove from Favorites” option

        //Locate the Add to favorites (bubble menu)option on web page:
        WebElement addFavoritesLocator = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[3]/a/span[2]"));

        //Click the Add to favorites (bubble menu) option on web page:
        addFavoritesLocator.click();

        Wait.Wait(1);

        // 4.Verify that the file is removed from Favorites sub-module’s table.
        // (Pre-condition: there should be at least 1 file is added to favorites table)

        //Locate the “Favorites” sub-module on the lest side
        WebElement subModuleFavorites = driver.findElement(By.xpath("//ul [@id=‘app-navigation’]/ul/li[3]"));

        //Click “Favorites” sub-module on the lest side:
        subModuleFavorites.click();

        Wait.Wait(1);






    }

}