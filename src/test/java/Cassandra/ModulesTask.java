package Cassandra;

import Utilities.Driver;
import Utilities.Wait;
import com.sun.corba.se.impl.encoding.CodeSetConversion;
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
       for(WebElement each1 : modules){
           actions.moveToElement(each1).perform();
           Assert.assertTrue(each1.isDisplayed(), "Module is displayed!");
           Wait.Wait(2);
       }


       Driver.closeDriver();


// not sure if i need another step for actual and expected


        }


    }


