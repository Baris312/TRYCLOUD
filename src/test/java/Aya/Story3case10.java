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


/*
public class UploadFile {
    public static void main(String[] args) throws InterruptedException {
​
​
        Driver.getDriver();
        Login.LoginSetup(Driver.getDriver());
​
​
        WebElement files = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
        files.click();
​
        WebElement icon = Driver.getDriver().findElement(By.xpath("//span[@class='icon icon-add']"));
        icon.click();
        String path = "C:\\Users\\Owner\\Desktop\\Capture.PNG";
        WebElement upload = Driver.getDriver().findElement(By.xpath("//label[@for='file_upload_start']"));
        upload.click();
​
​
        StringSelection ss = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(90);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Wait.Wait(3);

        Driver.getDriver().navigate().refresh();
​
    }
​
}
 */



    }
}