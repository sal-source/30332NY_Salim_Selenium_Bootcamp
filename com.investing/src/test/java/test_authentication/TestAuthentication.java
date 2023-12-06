package test_authentication;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {

    /*Test Case :Login to investing.com
    *1.Open your web browser and go to the investing.com website.
    *2.Click on the "Sign In" or "Login" button to proceed to the login page
    *3.Enter your registered email address in the first input field.
    *4.Enter your password in the second input field
    *5.click on the "Login" button to submit the form.
    * 6.Verify that you are redirected to your account dashboard or the page you were previously viewing before logging in
     */

    @Test(priority= 1, groups= {"BAT"},dataProvider = "loginDataProvider")

    public void testLogin(String email,String password){
        HomePage homePage = new HomePage();
        homePage.doSignIn(email, password);
        Assert.assertTrue(isElementVisible(homePage.userName));
    }
    @DataProvider(name="loginDataProvider")
    public String[][] loginDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doLogIn");
        return data;

    }

    @Test(priority= 2, groups= {"BAT"},dataProvider = "logoutDataProvider")

    public void testLogout(String email,String password){
        HomePage homePage = new HomePage();
        homePage.doSignIn(email, password);
        homePage.doSignOut();
        Assert.assertTrue(isElementVisible(homePage.loginLink));
    }
    @DataProvider(name="logoutDataProvider")
    public String[][] logoutDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doLogIn");
        return data;

    }

}
