package test_authentication;

import authentication.DashboardPage;
import authentication.LoginPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {

    /*Test Case: Login to BMW Website
    *1. Navigate to the BMW website (https://www.bmw.com).
    *2.Click on the "Login" button/link.
    *4.Enter the valid login credentials (username and password) in the appropriate input fields
    *5.Click on the "Login" button.
    *6.Check if the user is redirected to the expected page after successful login.
    *7.Validate that the profile information is displayed on the page to confirm successful login.
    *
     */

    @Test(priority= 1, groups= {"BAT"},dataProvider = "loginDataProvider")

    public void testLogin(String email,String password){
        HomePage homePage = new HomePage();

        LoginPage loginPage=homePage.clickOnLoginLink();
        DashboardPage dashboardPage=loginPage.doSign(email, password);
        Assert.assertTrue(isElementVisible(dashboardPage.myAccountButton));


    }
    @DataProvider(name="loginDataProvider")
    public String[][] loginDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }

    @Test(priority= 2, groups= {"BAT"},dataProvider = "logOutDataProvider")

    public void testLogOut(String email,String password){
        HomePage homePage = new HomePage();

        LoginPage loginPage=homePage.clickOnLoginLink();
        DashboardPage dashboardPage=loginPage.doSign(email, password);
        dashboardPage.doLogOut();


    }
    @DataProvider(name="logOutDataProvider")
    public String[][] logOutDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }


}
