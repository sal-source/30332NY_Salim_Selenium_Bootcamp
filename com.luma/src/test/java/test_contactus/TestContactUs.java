package test_contactus;


import base.BasePage;
import contactuspage.ContactUsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContactUs extends BasePage {

    //Test Case: As a user, I should be able to successfully contact the website’s support team using the “Contact Us” feature
//    Navigate to URL
//    Verify that the “Contact Us” feature is visible and accessible
//    Click on the “Contact Us” button to open the contact form
//    Enter a name in the name input field.
//    Enter a valid email address in the email input field.
//    Enter a valid phone number in the telephone input field.
//    Enter a text message in “What’s in your mind” input field.
//    Click on the "Submit" button
//    Wait for the confirmation message or a notification to appear


    @Test(priority = 12 , groups = {"BAT"})
    public void testContactUs(){
        ContactUsPage contactUsPage= new ContactUsPage();
        String name= "Dalal";
        String email="connie.smith@gmail.com";
        String phoneNumber= "2675287485";
        String comment= "We got the best teacher ";
        contactUsPage.doContactUs(name,email,phoneNumber,comment);

        Assert.assertTrue(isElementVisible(contactUsPage.thankYouForContactingUsMessage));
    }
}
