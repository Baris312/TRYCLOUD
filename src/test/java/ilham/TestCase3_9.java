package ilham;

import Utilities.Driver;
import Utilities.Wait;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class TestCase3_9 {
    /*
    Test case #9 - verify users can change the app Settings.
    1. Login as a user
    2. Click Settings on the left bottom corner
    3. Verify user can click any buttons.
     */

    @Test
    public void TestCase3_9(){

        // 1. Login as a user
        WebDriver driver = Driver.getDriver();
        LoginSetup(driver);
        Wait.Wait(2);

        //Click  file
        WebElement filesIcon = driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
        filesIcon.click();
        Wait.Wait(2);

        //2. Click Settings on the left bottom corner
        WebElement settingsButton = driver.findElement(By.xpath("//button[@class='settings-button']"));
        settingsButton.click();
        Wait.Wait(2);


        //3.  user can click any buttons.
        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"files-setting-richworkspace\"]/label"));
        checkbox1.click();
        Wait.Wait(1);

        WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"recommendations-setting-enabled\"]/label"));
        checkbox2.click();
        Wait.Wait(1);

        WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"files-setting-showhidden\"]/label"));
        checkbox3.click();
        Wait.Wait(1);

        //Verify




        driver.close();
    }



}
