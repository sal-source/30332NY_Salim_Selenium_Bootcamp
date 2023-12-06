package test_feedback;

import base.BasePage;
import feedbackpage.FeedBackPage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFeedBack extends BasePage {

    /* Test Case:Verify Feedback Functionality on Expedia.com
    *1.Launch the web browser and navigate to www.expedia.com.
    *2.Click on the "Feedback" link.
    *3.Click on "Website Feedback" button
    *4.Click on "star" Icon
    *5.Provide specific feedback or comments in the feedback message field.
    * 6.Click on the form submission button.
    * 7.Verify that the feedback is successfully submitted without any errors or validation issues.
     */

    @Test(priority = 5,groups={"BAT"})

    public void testFeedBck(){
        HomePage homePage=new HomePage();
        FeedBackPage feedBackPage= homePage.clickOnFeedBackButton();

        String text="Always helpful";
        feedBackPage.doFeedBack(text);

        Assert.assertTrue(isElementVisible(feedBackPage.thankYouMessage));
    }
}
