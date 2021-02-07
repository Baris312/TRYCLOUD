package Aya;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class Story3case10 {

    @Test
    public void TestCase10() throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        LoginSetup(driver);
        Wait.Wait(2);

        WebElement filesIcon = driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
        filesIcon.click();
        Wait.Wait(2);

        Actions actions = new Actions(Driver.getDriver());
        WebElement StorageUsage = driver.findElement(By.xpath("//*[@id=\"quota\"]/a/p"));
        actions.moveToElement(StorageUsage).perform();
        Wait.Wait(4);

        WebElement  plusIcon = driver.findElement(By.xpath("//*[@id='controls']/div[2]/a"));
        plusIcon.click();

        WebElement  uploadFile = driver.findElement(By.xpath("//*[@id=\"controls\"]/div[2]/div[2]/ul/li[1]/label/span[1]"));
        uploadFile.click();

        String File = "\u202AC:\\Users\\amukh\\Desktop\\landscape.jpg";
        uploadFile.sendKeys(File);
        Thread.sleep(3000);
        //driver.getTitle();
        Wait.Wait(2);



        actions.release().perform();

        WebElement newDocument = driver.findElement(By.xpath("//*[@id=\"controls\"]/div[2]/div[2]/ul/li[3]/a"));
        newDocument.click();



        //actions.dragAndDrop(File, uploadFile).perform();






    }
}