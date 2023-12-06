package test_authentication;


import authenticationpage.HomePage;
import authenticationpage.LogInPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {

//    Test Case : Login with valid credentials
//    Navigate to URL	https://magento.softwaretestingboard.com/
//    Click ‘Sign In’ Link
//    Enter valid email in email field input
//    Enter valid password int the password field input
//    Click on Login Button
//    Verify that a welcome message with the user’s name is displayed


    @Test(priority = 2, groups = {"BAT"},dataProvider = "signInDataProvider")

    public void testLoginWithValidCredentials(String validEmail, String validPassword) {

        LogInPage logInPage = new LogInPage();

        logInPage.getLogIn(validEmail, validPassword);
        Assert.assertTrue(isElementVisible(logInPage.resultLoginMessage));

    }

    @DataProvider(name="signInDataProvider")
    public Object[][] testSignInUserDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSignIn");
        return data;
    }

//Test Case: Login with Invalid Credentials
//    Navigate to URL
//    Click ‘Sign In’ Link
//    Enter invalid email in email field input
//    Enter invalid password int the password field input
//    Click on Login Button
//    Verify that an error message is displayed

    @Test(priority = 3, groups = {"BAT"},dataProvider = "invalidSignInDataProvider")
    public void testLoginWithInvalidCredentials(String invalidEmail, String invalidPassword) {


        LogInPage logInPage=new LogInPage();

       logInPage.doInvalidLogin(invalidEmail, invalidPassword);
        Assert.assertTrue(isElementVisible(logInPage.errorMessageLogin));
    }

    @DataProvider(name="invalidSignInDataProvider")
    public Object[][] testInvalidSignInUserDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("DoInvalidLogin");
        return data;

    }

    @Test(priority = 4, groups = {"BAT"},dataProvider = "signOutDataProvider")
    public void testLogOut(String validEmail, String validPassword) {
        LogInPage logInPage = new LogInPage();
        logInPage.getLogIn(validEmail, validPassword);
        HomePage homePage=new HomePage();
        homePage.doLogOut();
        Assert.assertTrue(isElementVisible(homePage.messageLogOut));
    }

    @DataProvider(name="signOutDataProvider")
    public Object[][] testSignOutUserDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }
}