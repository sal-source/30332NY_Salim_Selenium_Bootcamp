package test_authentication;

import base.BasePage;
import freecrm.pom.authentication.DashboardUserPage;
import freecrm.pom.authentication.LogInPage;
import freecrm.pom.homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {

    /* Test Case :Sign In to freecrm.com
     * 1.Navigate to URl "https://freecrm.com"
     * 2.Click on the "Sign In" button/link.
     * 3.Enter a valid email address in the email input field
     * 4.Enter a valid password in the password input field.
     * 5.Click on the "Sign In" button
     * 6.Verify that the user is successfully logged in and redirected to the user dashboard.
     *  */

    @Test(priority = 1, groups={"smoke"})
    public void TestLogin(){
        HomePage homePage= new HomePage();

        LogInPage logInPage= homePage.clickOnLoginButton();
        ExcelData excelData= new ExcelData(BasePage.DATA_PATH);

        String[][] credentials=excelData.readStringArrays("doSignIn");
        String email = credentials[0][0];
        String password= credentials[0][1];
        DashboardUserPage dashboardUserPage= logInPage.doLogin(email,password);


        Assert.assertTrue(isElementVisible(dashboardUserPage.userName));

    }

    /*Test Case :Sign Out to freecrm.com
     *1.Navigate to URl "https://freecrm.com".
     *2.Click on the "Sign In" button/link.
     *3.Enter valid login credentials (username and password) in the respective input fields.
     *4.Click on the "Login" button.
     *5.Verify that the user is successfully logged in and redirected to the user dashboard or home page.
     *6.Click on the account settings icon.
     *7.From the dropdown menu, click on the "Log Out" option.
     *8.Verify that the user is successfully signed out and redirected to a sign-in page.


     */
    @Test(priority = 2, groups={"smoke"})
    public void testLogOut(){
        HomePage homePage= new HomePage();
       //DashboardUserPage dashboardUserPage=new DashboardUserPage();


        LogInPage logInPage= homePage.clickOnLoginButton();
        String email="sadouni.dalal@gmail.com";
        String password="AydenLiam1213";

         DashboardUserPage dashboardUserPage=logInPage.doLogin(email,password);
        dashboardUserPage.doLogOut();

        Assert.assertTrue(isElementVisible(logInPage.LoginButton));
    }

    @Test(priority= 1, groups= {"BAT"},dataProvider = "loginDataProvider")

    public void testLogin(String email,String pass){
        HomePage homePage = new HomePage();
        LogInPage logInPage=homePage.clickOnLoginButton();
        DashboardUserPage dashboardUserPage =logInPage.doLogin(email, pass);
        Assert.assertTrue(isElementVisible(dashboardUserPage.userName));

    }
    @DataProvider(name="loginDataProvider")
    public String[][] loginDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }

    @Test(priority = 2, groups={"smoke"}, dataProvider = "logOutDataProvider")

    public void testLogOut(String email,String pass){
        HomePage homePage= new HomePage();
        LogInPage loginPage = new LogInPage();
        DashboardUserPage dashboardUserPage=new DashboardUserPage();

        homePage.clickOnLoginButton();


        loginPage.doLogin(email,pass);
        dashboardUserPage.doLogOut();

        Assert.assertTrue(isElementVisible(loginPage.LoginButton));
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




