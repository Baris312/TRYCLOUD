package Tomasz;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;
import static Utilities.Login.LoginSetup;

public class UserStory3_testCase5 {

    @Test
    public void TestCase5() {

        WebDriver driver = Driver.getDriver();

        LoginSetup(driver);

        Wait.Wait(2);

        WebElement filesIcon = driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
        filesIcon.click();
        Wait.Wait(2);

        WebElement  plusIcon = driver.findElement(By.xpath("//*[@id='controls']/div[2]/a"));
        plusIcon.click();
        Wait.Wait(2);

        WebElement  uploadFile = driver.findElement(By.xpath("//*[@id='controls']/div[2]/div[2]/ul/li[1]/label"));
        uploadFile.click();
        Wait.Wait(2);

        WebElement  pictureFile = driver.findElement(By.xpath("//*[@id='fileList']/tr[1]/td[2]/a/span[1]/span[1]"));
        Assert.assertTrue(pictureFile.isDisplayed());


        driver.close();

    }

}
