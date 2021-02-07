package Aya;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;
public class Story3Case8 {

    @Test
    public void TestCase8() throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        LoginSetup(driver);
        Wait.Wait(2);

        WebElement filesIcon = driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
        filesIcon.click();
        Wait.Wait(2);

        WebElement treeDots = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]"));
        treeDots.click();
        Wait.Wait(2);

        WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[8]/a"));
        deleteButton.click();
        Wait.Wait(2);

        WebElement deletedFiles = driver.findElement(By.xpath("//*[@id=\"app-navigation\"]/ul/li[7]/a"));
        deletedFiles.click();
        Wait.Wait(2);


        WebElement deletedTalkFolder = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[7]/td[2]/a/span[1]"));
        Assert.assertTrue(deletedTalkFolder.isDisplayed());
        System.err.println(deletedTalkFolder + " is Displayed!!");


        Driver.closeDriver();

    }


}