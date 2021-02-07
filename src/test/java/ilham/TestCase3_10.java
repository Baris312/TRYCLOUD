package ilham;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class TestCase3_10 {


    /*
    Test case #10 - verify users see the app storage usage
    1. Login as a user
    2. Check the current storage usage
    3. Upload a file
    4. Refresh the page
    5. Verify the storage usage is increased
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

        //2. Check the current storage usage
        WebElement storageUsage = driver.findElement(By.xpath("//*[@id=\"quota\"]/a/p"));






        driver.close();

    }
}
