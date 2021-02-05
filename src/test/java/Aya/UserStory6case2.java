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
        //Test case #1 - verify users can access to Talks module
        //1. Login as a user
        //2. Click “Notes” module
        //3. Verify the page title/URL is Notes module’s title

        WebDriver driver = Driver.getDriver();
        LoginSetup(driver);
        Wait.Wait(3);

        //2. Click “Notes” module
        WebElement deckModule = driver.findElement(By.xpath("//ul[@id= 'appmenu']//li[10]"));

        deckModule.click();
        Wait.Wait(5);

        WebElement navigation = driver.findElement(By.xpath("//*[@id=\"app-navigation-vue\"]/a"));
        navigation.click();

        Thread.sleep(7000);

        //driver.findElement(By.xpath("//*[@id=\"app-navigation-vue\"]/ul/li[2]/a/span")).sendKeys("newNote"+Keys.ENTER);

        WebElement addNote = driver.findElement(By.xpath("/html/body/div[3]/div/ul/div/form/input[1]"));
        addNote.click();

        ///*[@id="app-navigation-vue"]/ul/li[3]/a/span
        Wait.Wait(2);

        addNote.sendKeys("newNote"+Keys.ENTER);



        Wait.Wait(2);


        // Driver.closeDriver();

    }
}