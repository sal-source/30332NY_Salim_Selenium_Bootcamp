package test_authentication;

import base.BasePage;
import homepage.HomePage;
import loginpage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {

    /* Test case: Test the login functionality on the ebay.com website:
     *1.Navigate to the verizon.com website (https://www.ebay.com).
     *2.Click on "Login" link.
     *3.Enter an email in the email input field.
     *4.Enter a password in the password input field.
     *6.Click on "Sign in" button
     *5.Verify that the user is successfully logged in.
     *
     */

    @Test(priority= 1, groups= {"BAT"},dataProvider = "loginDataProvider")

    public void testLogin(String email,String pass){
        HomePage homePage = new HomePage();
        LoginPage loginPage= homePage.clickOnSignInLink();
        loginPage.doSignIn(email, pass);
        Assert.assertTrue(isElementVisible(homePage.welcomeMessage));



    }
    @DataProvider(name="loginDataProvider")
    public String[][] loginDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }

}
