package Cassandra;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Utilities.Login.LoginSetup;

public class ModulesTask {

    // 1.Login as a user
    // 2.Verify the user see the following modules: Files, Galleries, Activity, Talk, Contacts, Calendar, Note

    @Test
    public void mainModules(){

        WebDriver driver = Driver.getDriver();
        LoginSetup(driver);
        Wait.Wait(3);

        WebElement files = driver.findElement(By.id("files"));
        WebElement activity = driver.findElement(By.id("activities"));
        WebElement gallery = driver.findElement(By.id("gallery"));
        WebElement talk = driver.findElement(By.id("spreed"));
        WebElement calendar = driver.findElement(By.id("calendar"));
        WebElement deck = driver.findElement(By.id("deck"));
        WebElement announcements = driver.findElement(By.id("announcementcenter"));

     List<WebElement> modules = new ArrayList<>();
          modules.addAll(Arrays.asList(files,activity, gallery, talk, calendar, deck, announcements));

        String isDisplayed = "";
       for (WebElement each : modules) {
           Assert.assertTrue(each.isDisplayed());
           System.out.println(each + " is Displayed!!");

       }





          //  WebElement files = Driver.getDriver().findElement(By.xpath("//select[@id='files']));
          //  WebElement files = Driver.getDriver().findElement(By.xpath("//select[@id="appmenu"]/li[1]]));



         //   String expectedModule = "You can see modules";
          //  Assert.assertTrue(resultText.isDisplayed());
          //  Assert.assertEquals(actualModule, expectedModule);

        }


    }


