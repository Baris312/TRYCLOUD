package TRYCLOUD;

import Utilities.Driver;
import Utilities.Login;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Utilities.Login.LoginSetup;

public class MAIN_Class
    {

@BeforeClass
public static  void  UserLogin()
    {
        WebDriver driver = Driver.getDriver();


      LoginSetup(driver);
        Wait.Wait(3);

    }
        @Test
            public void A_mainModules(){

            // 1.Login as a user
            WebDriver driver = Driver.getDriver();


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

            Wait.Wait(1);






}

                         public void B_ThanksCas() {
                            WebElement setStatusLink = Driver.getDriver().findElement(By.xpath("//*[@id=\"status-status\"]"));
                            setStatusLink.click();
                            Wait.Wait(1);

                            WebElement textLink = Driver.getDriver().findElement(By.xpath("//*[@id=\"body-user\"]/div[6]/div[2]/div/div/div[4]/form/input"));
                            textLink.sendKeys("Thank you CASSANDRA !!");

                            Wait.Wait(2);

                            WebElement sendtextlink = Driver.getDriver().findElement(By.xpath("//*[@id=\"body-user\"]/div[6]/div[2]/div/div/div[7]/button[2]"));
                            sendtextlink.click();


                        }


        // Test case3_3 && TestCase3_4
        @Test
           public void TestCase3_3()
                {

                    //User Story #3 : As a user, I should be able to access to Files module
                    // Test Case #3 :

                    // 1.Login as a user



                    Wait.Wait(1);
                    try
                        {
                            runTest3();
                        }catch (RuntimeException e)
                        {
                            runTest3();
                        }

                    try
                        {
                            TestCase3_4();
                        }catch (RuntimeException e)
                        {
                            TestCase3_4();
                        }


                }
                // Test case3_3 && TestCase3_4
                  public void runTest3()
                 {
                     WebDriver driver = Driver.getDriver();
                     //Locate Files module on the web page:
                     WebElement files = driver.findElement(By.xpath("//ul[@id='appmenu']/li[2]/a"));
                     //Click Files module on the web page:
                     files.click();

                     Wait.Wait(1);


                     //Locate the action-icon (three dots) on the web page:
                     WebElement actionIcon = driver.findElement(By.xpath("//*[@id='fileList']/tr/td[2]/a/span[3]/a[2]"));
                     //Click the action-icon (three dots) on the web page:
                     actionIcon.click();

                     Wait.Wait(1);

                     //Pre-condition: file has to be un-selected from favorites sub-module


                     // 3.Choose “Add to Favorites” option
                     //Locate the Add to favorites (bubble menu)option on web page:
                     WebElement addFavoritesLocator = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[3]/a/span[2]"));

                     //Click the Add to favorites (bubble menu) option on web page:
                     addFavoritesLocator.click();

                     Wait.Wait(1);

                     // 4.Click “Favorites” sub-module on the lest side

                     //Locate the “Favorites” sub-module on the left side
                     WebElement subModuleFavorites = driver.findElement(By.xpath("//*[@id='app-navigation']/ul/li[3]/a"));
                     //*[@id="app-navigation"]/ul/li[3]/a

                     //Click “Favorites” sub-module on the lest side:
                     subModuleFavorites.click();

                     Wait.Wait(1);

                     // 5.Verify the chosen file is listed on the table
                     // (Pre-condition: there should be at least 1 file is uploaded)
                     //rr

                     //Assertion:

                     WebElement fileList = driver.findElement(By.xpath("//*[@id='fileList']/tr/td[1]/a/span[1]/span"));
                     String expectedResult = "Talk";
                     String actualResult = fileList.getText();

                     Assert.assertEquals(actualResult, expectedResult, "File is not found");


                     Wait.Wait(3);

                     driver.get("http://qa3.trycloud.net/index.php/apps/dashboard/");
                 }

                 public void TestCase3_4()
                 {

                //User Story #3 : As a user, I should be able to access to Files module
                //Test case #4 - verify users can remove a file from favorites

                // 1.Login as a user
                WebDriver driver = Driver.getDriver();


                Wait.Wait(1);


                // 2.Click action-icon from any file on the page


                //Locate Files module on the web page:
                WebElement files = driver.findElement(By.xpath("//ul[@id='appmenu']/li[2]/a"));
                //Click Files module on the web page:
                files.click();

                Wait.Wait(1);

                //Locate the action-icon (three dots) on the web page:
                WebElement actionIcon = driver.findElement(By.xpath("//*[@id='fileList']/tr/td[2]/a/span[3]/a[2]"));
                //Click the action-icon (three dots) on the web page:
                actionIcon.click();

                Wait.Wait(1);

                // 3.Click “Remove from Favorites” option

                //Locate the Add to favorites (bubble menu)option on web page:
                WebElement addFavoritesLocator = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[3]/a/span[2]"));

                //Click the Add to favorites (bubble menu) option on web page:
                addFavoritesLocator.click();

                Wait.Wait(1);

                // 4.Verify that the file is removed from Favorites sub-module’s table.
                // (Pre-condition: there should be at least 1 file is added to favorites table)

                //Locate the “Favorites” sub-module on the lest side
                WebElement subModuleFavorites = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]/span[1]"));

                //Click “Favorites” sub-module on the lest side:
                subModuleFavorites.click();

                Wait.Wait(1);


                WebElement emptyFavorites = driver.findElement(By.xpath("//*[@id='emptycontent']/h2"));
                String expectedResult = "";
                String actualResult = emptyFavorites.getText();

                Assert.assertEquals(actualResult, expectedResult, "Favorites is not empty");


                Wait.Wait(3);
                driver.get("http://qa3.trycloud.net/index.php/apps/dashboard/");

            }

        @Test
           public void TestCase3_5() {

                    WebDriver driver = Driver.getDriver();

                    LoginSetup(driver);

                    Wait.Wait(2);

                    WebElement filesIcon = driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
                    filesIcon.click();
                    Wait.Wait(2);

                    WebElement  plusIcon = driver.findElement(By.xpath("//*[@id='controls']/div[2]/a"));
                    plusIcon.click();
                    Wait.Wait(2);

                    WebElement  uploadFile = driver.findElement(By.xpath("//*[@id='controls']/div[2]/div[2]/ul/li[1]/label"));
                    uploadFile.click();
                    Wait.Wait(2);

                    WebElement  pictureFile = driver.findElement(By.xpath("//*[@id='fileList']/tr[1]/td[2]/a/span[1]/span[1]"));
                    Assert.assertTrue(pictureFile.isDisplayed());

                    Wait.Wait(2);
                    driver.get("http://qa3.trycloud.net/index.php/apps/dashboard/");



                }

        @Test
           public void TestCase4() {

                    // Test case #2 - verify users can send message
                    // 1 Login as a user

                    WebDriver driver = Driver.getDriver();




                    // 2. Click Talks module
                    WebElement talks = Driver.getDriver().findElement(By.xpath("//li[@data-id='spreed'][1]"));
                    talks.click();
                    //3. Search a user from search box on the left
                    Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("marufjon");
                    WebElement user = Driver.getDriver().findElement(By.xpath("//span[@class='acli__content__line-one__title']"));
                    user.click();
                    //4. Write a message
                    WebElement message = Driver.getDriver().findElement(By.xpath("//div[@role='textbox']"));
                    message.sendKeys("Hello Muhtar");

                    //5. Click submit button
                    WebElement submit = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
                    submit.click();

                    //6. Verify the message is displayed on the conversation log
                    String actualResult = Driver.getDriver().findElement(By.xpath("(//div[@class='messages'])[2]")).getText();
                    String expectedResult = "Hello Muhtar";
                    Assert.assertTrue(actualResult.contains(expectedResult));
                    System.out.println(actualResult);

                    Wait.Wait(2);
                    driver.get("http://qa3.trycloud.net/index.php/apps/dashboard/");

                }


        @AfterClass
        public void ThreadDown() {
                Wait.Wait(1);
                Driver.getDriver().quit();
            }

        }
