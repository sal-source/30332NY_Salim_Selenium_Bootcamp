package test_authentication;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class Test_Authentication extends BasePage {

    /* Test Case:Login on ESPN.com
     *1.Navigate to the ESPN website (espn.com).
     *2.Locate the "Login" link on the homepage and click on it.
     *3.Enter a valid email address in the provided input field.
     *4.Click on continue button
     *5.Enter a valid password in the password input field.
     *6.Click on the "Login" button to submit the login credentials.
     * 7.Validate that the user is successfully logged in by checking for any visible indications, such as a personalized welcome message or a user profile icon.
     */

    @Test(priority= 1, groups= {"BAT"},dataProvider = "signInDataProvider")
    public void testUserSignIn(String email,String password){

        HomePage homePage = new HomePage();
        homePage.doLogin(email,password);
        Assert.assertTrue(isElementVisible(homePage.assertLogin()));

    }

    @DataProvider(name="signInDataProvider")
    public Object[][] testSignInUserDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }

    /* Test Case:Logout on ESPN.com
     *1.Navigate to the ESPN website (espn.com).
     *2.Locate the "Login" link on the homepage and click on it.
     *3.Enter a valid email address in the provided input field.
     *4.Click on continue button
     *5.Enter a valid password in the password input field.
     *6.Click on the "Login" button to submit the login credentials.
     * 7.Hover over user Icon on the top right of the home page and click on "Log out" button
     * 7.Validate that the user is successfully logged out by checking for any visible indications, such as a login button.
     */
    @Test(priority= 1, groups= {"BAT"},dataProvider = "signOutDataProvider")
    public void testUserSignOut(String email,String password){

        HomePage homePage = new HomePage();
        homePage.doLogin(email,password);
        homePage.doLogOut();
        Assert.assertTrue(isElementVisible(homePage.doAssetLogOut()));

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
