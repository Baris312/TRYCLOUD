package Cassandra;

import Utilities.Driver;
import Utilities.Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Utilities.Login.LoginSetup;

public class ModulesTask {

    @Test
    public void mainModules(){

        // 1.Login as a user
        WebDriver driver = Driver.getDriver();
        LoginSetup(driver);
        Wait.Wait(3);

        // 2.Verify the user see the following modules: Files, Galleries, Activity, Talk, Contacts, Calendar, Note

        WebElement dashboard = driver.findElement(By.xpath("//ul[@id= 'appmenu']//li[1]"));
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
          modules.addAll(Arrays.asList(dashboard, files, photos, activity, talk, mail, contacts, circles,
                  calendar, deck));


       for (WebElement each : modules) {
           Assert.assertTrue(each.isDisplayed());
           System.out.println(each + " is Displayed!!");

       }

        Actions actions = new Actions(Driver.getDriver());

        WebElement dashboardText = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[1]/a/span"));
        actions.moveToElement(dashboard).perform();
        Wait.Wait(2);
        System.out.println(dashboardText.getText() );

        WebElement filesText = driver.findElement(By.xpath("/html/body/header/div[1]/ul/li[2]/a/span"));
        actions.moveToElement(filesText).perform();
        Wait.Wait(2);
        System.out.println(filesText.getText() );

        WebElement photosText = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[3]/a/span"));
        actions.moveToElement(photosText).perform();
        Wait.Wait(2);
        System.out.println(photosText.getText() );

        WebElement activityText = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[4]/a/span"));
        actions.moveToElement(activityText).perform();
        Wait.Wait(2);
        System.out.println(activityText.getText() );

        WebElement talkText = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[5]/a/span"));
        actions.moveToElement(talkText).perform();
        Wait.Wait(2);
        System.out.println(talkText.getText() );

        WebElement mailText = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[6]/a/span"));
        actions.moveToElement(mailText).perform();
        Wait.Wait(2);
        System.out.println(mailText.getText() );

        WebElement contactsText = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[7]/a/span"));
        actions.moveToElement(contactsText).perform();
        Wait.Wait(2);
        System.out.println(contactsText.getText() );

        WebElement circlesText = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[8]/a/span"));
        actions.moveToElement(circlesText).perform();
        Wait.Wait(2);
        System.out.println(circlesText.getText() );

        WebElement calendarText = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[9]/a/span"));
        actions.moveToElement(calendarText).perform();
        Wait.Wait(2);
        System.out.println(calendarText.getText() );

        WebElement deckText = driver.findElement(By.xpath("//*[@id=\"appmenu\"]/li[10]/a/span"));
        actions.moveToElement(deckText).perform();
        Wait.Wait(2);
        System.out.println(deckText.getText() );

        Wait.Wait(2);
        Driver.closeDriver();





        }


    }


