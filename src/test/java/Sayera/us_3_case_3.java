package Sayera;

import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class us_3_case_3 {

    @Test
    public void TestCase3(){

        //User Story #3 : As a user, I should be able to access to Files module
        // Test Case #3 :

        // 1.Login as a user
        WebDriver driver = Driver.getDriver();


        LoginSetup(driver);
        Wait.Wait(7);


        // 2.Click action-icon from any file on the page
        //WebElement files

        // 3.Choose “Add to Favorites” option
        // 4.Click “Favorites” sub-module on the lest side
        // 5.Verify the chosen file is listed on the table
        // (Pre-condition: there should be at least 1 file is uploaded)






    }

    //Story: As a user, I should be able to access to Files module






    }
