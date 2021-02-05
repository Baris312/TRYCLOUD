package Tomasz;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static Utilities.Login.LoginSetup;

public class UserStory3_testCase4 {

    @Test
    public void TestCase4() {

        WebDriver driver = Driver.getDriver();

        LoginSetup(driver);

        Wait.Wait(2);

        WebElement filesIcon = driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
        filesIcon.click();
        Wait.Wait(2);

        WebElement threeDotsIcon = driver.findElement(By.xpath("//*[@id='fileList']/tr/td[2]/a/span[3]/a[2]"));
        threeDotsIcon.click();
        Wait.Wait(2);

        WebElement removeFavIcon = driver.findElement(By.xpath("//*[@id='fileList']/tr[1]/td[2]/div/ul/li[3]/a/span[2]"));
        removeFavIcon.click();
        Wait.Wait(2);
        // pre condition one file have to be in favorite catalog
        WebElement emptyFavorites = driver.findElement(By.xpath("//*[@id='app-content-files']/div[4]"));
        String expectedResult = "";
        String actualResult = emptyFavorites.getText();
        Assert.assertEquals(actualResult, expectedResult, "Favorites is not empty");









    }

}