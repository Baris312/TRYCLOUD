package Rauf;

import Utilities.Driver;
import Utilities.Login;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SendMessage {

    @Test
    public void sendMessage() {


        // Test case #2 - verify users can send message
        // 1 Login as a user

        WebDriver driver = Driver.getDriver();
        Login.LoginSetup(driver);
        Wait.Wait(2);


        // 2. Click Talks module
        WebElement talks = Driver.getDriver().findElement(By.xpath("//li[@data-id='spreed'][1]"));
        talks.click();
        //3. Search a user from search box on the left
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("marufjon");
        WebElement user = Driver.getDriver().findElement(By.xpath("//span[@class='acli__content__line-one__title']"));
        user.click();
        //4. Write a message
        WebElement message = Driver.getDriver().findElement(By.xpath("//div[@role='textbox']"));
        message.sendKeys("Hello Muhtar");

        //5. Click submit button
        WebElement submit = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        submit.click();

        //6. Verify the message is displayed on the conversation log
        String actualResult = Driver.getDriver().findElement(By.xpath("(//div[@class='messages'])[2]")).getText();
        String expectedResult = "Hello Muhtar";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println(actualResult);

    }
}