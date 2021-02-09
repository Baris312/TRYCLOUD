package Baris;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class CreateFolder_Stroy3_6
    {

        @Test
        public void CreateFolder_Stroy3_6() throws InterruptedException
            {
           WebDriver driver = Driver.getDriver();


           LoginSetup(driver);

           //Screen Shot 2021-02-06 at 7.58.43 PM.png

           WebElement filesIcon = driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
           filesIcon.click();
           Wait.Wait(2);

           WebElement  plusIcon = driver.findElement(By.xpath("//*[@id='controls']/div[2]/a"));
           plusIcon.click();
           Wait.Wait(2);

           WebElement  uploadFile = driver.findElement(By.xpath("//*[@id=\"controls\"]/div[2]/div[2]/ul/li[1]/label/span[1]"));

           Wait.Wait(2);

          String file = "Screen Shot 2021-02-06 at 7.58.43 PM.png";
         //  uploadFile.sendKeys(file);
            Actions action = new Actions(driver);
             action.perform();

             action.sendKeys(file).perform();
             Thread.sleep(2000);
             action.click();



       }
    }
