package test_contactus;

import base.BasePage;
import contactuspage.ContactUsPage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContactUs extends BasePage {

    /*Test Case: Test contact us functionality
    *1.Navigate to http://optimum.com
    *2.Click on "Contact us" link at the bottom of the page
    *3.Click on "Chat Now" button
    *4. Verify that a small widows appears to start a chat
     */

    @Test(priority = 1,groups={"BAT"})
    public void testContactUs(){
        HomePage homePage=new HomePage();
        ContactUsPage contactUsPage=homePage.clickOnContactUs();
        contactUsPage.clickOnChatNowButton();
        Assert.assertTrue(isElementVisible(contactUsPage.chatWithUsText));
    }
}
