package ilham;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class TestCase3_8a {
    /*
    Test case #8 - verify users can write comments to files/folders.
    1. Login as a user
    2. Click action-icon from any file on the page
    3. Click details
    4. Write a comment inside to the input box
    5. Click the submit button to post it
    6. Verify the comment is displayed in the comment section.
     */
    @Test
    public void TestCase3_8a(){

        // 1. Login as a user
        WebDriver driver = Driver.getDriver();
        LoginSetup(driver);
        Wait.Wait(2);

        //Click  file
        WebElement filesIcon = driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
        filesIcon.click();
        Wait.Wait(2);

        //2. Click action-icon from any file on the page
       // WebElement



        //    3. Click details
        WebElement detailsButton = driver.findElement(By.xpath("//*[@id=\"rightClickMenu\"]/ul/li[2]/a/span[2]"));
        detailsButton.click();
        Wait.Wait(2);

        //4. Write a comment inside to the input box
        //    5. Click the submit button to post it
        //    6. Verify the comment is displayed in the comment section.






        driver.close();

    }
}
