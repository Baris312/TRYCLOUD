package Hanieh;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static Utilities.Login.LoginSetup;

public class ContactList {

    @Test
    public void contactList() {// Thanks Rauf for your help

        WebDriver driver = Driver.getDriver();
        LoginSetup(driver);
        Wait.Wait(2);

        // user story: access to contact list and verify the contact names are in the list

        //click contact list
        WebElement contactList = driver.findElement(By.xpath("//div[@class='icon-contacts menutoggle']"));
        contactList.click();

        List<WebElement> contactListNames = driver.findElements(By.xpath("//div[@class='full-name']"));

        String names = "";
        int numberOfNames = 0;
        boolean isDisplayed = false;

        for (WebElement eachName : contactListNames) {

            isDisplayed = eachName.isDisplayed();
            numberOfNames = contactListNames.size();
            names += eachName.getText() + " , ";

        }
        System.out.println("All names are in the list= " + isDisplayed);
        System.out.println("Names are= " + names);

        System.out.println("Size of list= " + contactListNames.size());


    }
}
