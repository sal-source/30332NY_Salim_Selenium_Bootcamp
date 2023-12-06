package test_registration;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import registrationpage.RegistrationPage;
import utils.GenerateData;

public class TestRegistration extends BasePage {

    /*Test Case: Register to Booking.com
    *1.Open your web browser and go to the Booking.com website (www.booking.com).
    *2.On the homepage, locate and click on the "Sign in" or "Register" button. It is usually located in the top right corner of the page.
    *3.You will be redirected to the login page. Since you want to register as a new user, look for a "Sign up" or "Create account" option. Click on it.
    *4.You will be redirected to the login page. Since you want to register as a new user, look for a "Sign up" or "Create account" option. Click on it.
    *5.Email address: Provide a valid email address that you have access to.
    *6.Click on continue button
    *7.Password: Choose a secure password that meets the specified requirements.
    *8.click on the "Create account" or "Register" button to proceed.
    * 9.If all the provided information is valid and complete, you will be redirected to a confirmation page or receive a confirmation email. Follow the instructions provided to verify your email address.
     */
    @Test(priority=1,groups={"BAT"})
    public void testDoRegister(){
        HomePage homePage=new HomePage();
        RegistrationPage registrationPage=homePage.clickOnRegisterButton();
        String email= GenerateData.email();
        //String password=GenerateData.password(); //I couldn't use faker for a password cause the generated passwords don't satisfy the specified  requirements.
        String password= "AydenLiam1213";
        registrationPage.doRegister(email,password);

        Assert.assertTrue(isElementVisible(homePage.assertLogin()));
    }
}
