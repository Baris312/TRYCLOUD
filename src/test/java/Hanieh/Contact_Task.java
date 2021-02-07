package Hanieh;

import Utilities.Driver;
import Utilities.Wait;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.text.Utilities;
import java.util.List;
import java.util.Set;

import static Utilities.Login.LoginSetup;

public class Contact_Task {


    @Test
    public void contactModule() {
        //login
        WebDriver driver = Driver.getDriver();
        LoginSetup(driver);
        Wait.Wait(2);

        // click on contact module
        WebElement contact = driver.findElement(By.xpath("//a[@aria-label='Contacts']"));
        contact.click();
        String expectedTitle = "Contacts - Trycloud QA";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));

        System.out.println("Expected Title= " + expectedTitle);
        System.out.println("Actual Title= " + actualTitle);
        Wait.Wait(2);

        // user can see and click new contacts
        WebElement newContact = driver.findElement(By.id("new-contact-button"));
        newContact.click();

        // fill out name
        Faker faker = new Faker();
        WebElement name = driver.findElement(By.id("contact-org"));
        name.sendKeys(faker.name().fullName());

        WebElement title = driver.findElement(By.id("contact-title"));
        title.sendKeys(faker.job().title());

        // fill out phone box
        WebElement phone = driver.findElement(By.xpath("//input[@inputmode='tel']"));
        phone.sendKeys(faker.phoneNumber().cellPhone());

        // fill out email box
        WebElement email = driver.findElement(By.xpath("//input[@inputmode='email']"));
        email.sendKeys(faker.address().secondaryAddress());


        // fill out post office box
        WebElement postOfficeBox = driver.findElement(By.xpath("// input[@class='property__value']"));
        postOfficeBox.sendKeys(faker.address().zipCode());

        // fill out address box
        WebElement address = driver.findElement(By.xpath("//div[@class='property__row'][3]/input"));
        address.sendKeys(faker.address().fullAddress());

        //fill out extended address box
        WebElement extendedAddress = driver.findElement(By.xpath("//div[@class='property__row'][4]/input"));
        extendedAddress.sendKeys(faker.address().secondaryAddress());

        // fill out postal code box
        WebElement postalCodeBox = driver.findElement(By.xpath("//div[@class='property__row'][5]/input"));
        postalCodeBox.sendKeys(faker.code().asin());

        // fill out city box
        WebElement city = driver.findElement(By.xpath("//div[@class='property__row'][6]/input"));
        city.sendKeys(faker.address().cityName());

        // fill out state box
        WebElement state = driver.findElement(By.xpath("//div[@class='property__row'][7]/input"));
        state.sendKeys(faker.address().state());

        // fill out country box
        WebElement country = driver.findElement(By.xpath("//div[@class='property__row'][8]/input"));
        country.sendKeys(faker.address().country());

        // verify contact name is on the list
        WebElement nameOnList = driver.findElement(By.xpath("//div[@class='app-content-list-item-line-one']"));
        nameOnList.isDisplayed();

    }
}

