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

        WebElement files = driver.findElement(By.xpath("//ul[@id= 'appmenu']//li[2]"));
        WebElement photos = driver.findElement(By.xpath("//ul[@id= 'appmenu']//li[3]"));
        WebElement activity = driver.findElement(By.xpath("//ul[@id= 'appmenu']//li[4]"));
        WebElement talk = driver.findElement(By.xpath("//ul[@id='appmenu']//li[5]"));
        WebElement mail = driver.findElement(By.xpath("//ul[@id= 'appmenu']//li[6]"));
        WebElement contacts = driver.findElement(By.xpath("//ul[@id= 'appmenu']//li[7]"));
        WebElement circles = driver.findElement(By.xpath("//ul[@id= 'appmenu']//li[8]"));
        WebElement calendar = driver.findElement(By.xpath("//ul[@id= 'appmenu']//li[9]"));
        WebElement deck = driver.findElement(By.xpath("//ul[@id= 'appmenu']//li[10]"));


     List<WebElement> modules = new ArrayList<>();
          modules.addAll(Arrays.asList(files, photos, activity, talk, mail, contacts, circles,
                  calendar, deck));


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


