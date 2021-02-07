package Hanieh;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class TalkModule {

    @Test
    public void talkModule(){
        WebDriver driver= Driver.getDriver();
        LoginSetup(driver);
        Wait.Wait(2);

        //user can access to talk module
        WebElement talk= driver.findElement(By.xpath("//a[@aria-label='Talk']"));
        talk.click();


    }
}
