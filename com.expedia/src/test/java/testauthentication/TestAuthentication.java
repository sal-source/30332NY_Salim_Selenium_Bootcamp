package testauthentication;

import authentication.LoginPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {

    /* Test Case: Sign In to  "https://expedia.com".
     *1. Navigate to the Url "https://expedia.com"
     *2.Click on the "Sign In" link.
     *3.Click on the "Sign In" Button.
     *4.Enter valid login Email address in the input fields.
     *5.Click on "Continue" button
     6.
     *Verify that the user is successfully logged in and redirected to the user dashboard or home page.
     */



    @Test(priority= 1, groups= {"BAT"},dataProvider = "logindataprovider")

    public void testLogin(String email,String password){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
         homePage.clickOnSignInLink();
         homePage.clickOnSignIButton1();

        loginPage.doSignIn(email,password);





    }
    @DataProvider(name="logindataprovider")
    public String[][] loginDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }

    }

