package TRYCLOUD;


import Utilities.Driver;
import Utilities.Wait;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static Utilities.Login.LoginSetup;

public class MAIN_Class
    {

@Test
public static  void  UserLogin()
    {
        WebDriver driver = Driver.getDriver();


      LoginSetup(driver);
        Wait.Wait(7);

    }

    }
