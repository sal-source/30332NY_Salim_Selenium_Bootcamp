package test_authentication;


import base.BasePage;
import homepage.HomePage;
import loginpage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInvalidLogIn extends BasePage {

    /*Test Case: Login Functionality
    *1.Navigate to the optimum.com website
    *2.Click on Sign in Button
    *3.Enter an invalid  email address in the login field.
    *4.Enter a valid password in the password field.
    *5.Click on the "Login" or similar button.
    *6.Verify that an appropriate error message is displayed, indicating an invalid username or email.
     */

    @Test(priority = 2, groups = {"BAT"})
    public void testInvalidLogin() {

        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.clickOnSignInMobile();
        String email = "sadouni.dalal@gmail.com";
        String password = "AydenLiam1213@";
        loginPage.doSignIn(email, password);
        Assert.assertTrue(isElementVisible(loginPage.errorMessage));
    }
}
