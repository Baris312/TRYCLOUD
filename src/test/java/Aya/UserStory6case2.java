package Aya;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class UserStory6case2 {

    @Test
    public void TestCase2() throws InterruptedException {
        //Test case #2 - verify users can send notes in the page
        //1. Login as a user

        WebDriver driver = Driver.getDriver();
        LoginSetup(driver);
        Wait.Wait(3);

        //2. Click “Notes” module
        WebElement deckModule = driver.findElement(By.xpath("//ul[@id= 'appmenu']//li[10]"));

        deckModule.click();
        Wait.Wait(5);

        WebElement navigation = driver.findElement(By.xpath("//*[@id=\"app-navigation-vue\"]/a"));
        navigation.click();

        Thread.sleep(3000);


        //3. Click “New Note” button
        WebElement addBoard = driver.findElement(By.xpath("//*[@id=\"app-navigation-vue\"]/ul/li[3]/a/span"));
        addBoard.click();

        //4. Write a message/Note
        WebElement addBoardName = driver.findElement(By.xpath("//*[@id=\"app-navigation-vue\"]/ul/div/form/input[1]"));
        Wait.Wait(2);

        addBoardName.sendKeys("NEW message"+Keys.ENTER);
        Wait.Wait(2);

        //5. Verify the note is added on the note list
        WebElement message = driver.findElement(By.xpath("//*[@id=\"app-navigation-vue\"]/ul/li[2]/ul"));

        Assert.assertTrue(message.isDisplayed());
        System.err.println(message + " is Displayed!!");



        Driver.closeDriver();

    }
}