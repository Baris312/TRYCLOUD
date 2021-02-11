package ilham;

import Utilities.Driver;
import Utilities.Login;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class TestCase3_8 {

    /*
    Test case #8 - verify users can delete a file/folder.
    1.Login as a user
    2.Click action-icon from any file on the page
    3.Choose “delete files” option
    4.Click deleted files on the left bottom corner
    5.Verify the deleted file is displayed no the page.
    (Pre-condition: there should be at least 1 file is uploaded inside files page)
     */

    @Test
    public static  void  TestCase3_8() throws InterruptedException {

        // 1. Login as a user
        WebDriver driver = Driver.getDriver();
        LoginSetup(driver);
        Wait.Wait(3);


        // 2.Click action-icon from any file on the page
        WebElement filesIcon = driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
        filesIcon.click();
        Wait.Wait(2);


        WebElement treeDots = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]"));
        treeDots.click();
        Wait.Wait(2);

        //3.Choose “delete files” option
        WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[8]/a"));
        deleteButton.click();
        Wait.Wait(2);


        //4.Click deleted files on the left bottom corner
        WebElement leftCornerDeletedButton = driver.findElement(By.xpath("//*[@id=\"app-navigation\"]/ul/li[7]/a"));
        leftCornerDeletedButton.click();
        Wait.Wait(2);

        // 5.Verify the deleted file is displayed no the page.
        WebElement deletedTalk = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[7]/td[2]/a/span[1]"));
        Assert.assertTrue(deletedTalk.isDisplayed());
        System.err.println(deletedTalk + " is in the Deleted file");



        driver.close();

    }



}
