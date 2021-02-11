package ilham;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
        WebElement treeDots = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]"));
        treeDots.click();
        Wait.Wait(2);



        //    3. Click details
        WebElement detailsButton = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[4]"));
        detailsButton.click();
        Wait.Wait(2);

        //4. Write a comment inside to the input box
        WebElement commentButton = driver.findElement(By.xpath("//*[@id=\"app-sidebar-vue\"]/div/nav/ul/li[2]"));
        commentButton.click();
        Wait.Wait(2);

        WebElement newComment = driver.findElement(By.xpath("//*[@id=\"commentsTabView\"]/div[1]/form/div[1]"));
        newComment.sendKeys("Hello Team");
        Wait.Wait(2);

        //    5. Click the submit button to post it
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"commentsTabView\"]/div[1]/form/input"));
        submitButton.click();
        Wait.Wait(2);

        //    6. Verify the comment is displayed in the comment section.
        String actualResult = Driver.getDriver().findElement(By.xpath("//*[@id=\"commentsTabView\"]/ul/li[1]/div[2]")).getText();
        String expectedResult = "Hello Team";
        Assert.assertTrue(actualResult.equals(expectedResult));
        System.out.println(actualResult);


        driver.close();

    }
}
