package Rauf;

import Baris.LoginTask1;
import Utilities.Driver;
import Utilities.Login;
import Utilities.Wait;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public static void talks_module() {


        WebDriver driver=Driver.getDriver();
        Login.LoginSetup(driver);
        Wait.Wait(2);


    }
}
