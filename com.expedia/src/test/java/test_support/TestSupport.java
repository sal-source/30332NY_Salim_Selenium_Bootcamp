package test_support;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import supportpage.SupportPage;

public class TestSupport extends BasePage {

    /*Test Case:
    *1.Launch the web browser and navigate to www.expedia.com.
    *2.Click on the "Support"  link.
    *3.Verify that the customer support page is loaded successfully.
    *4.Click on change booking button
    *5.Verify that the next step that you have to complete is indicated.
     */

    @Test(priority=4,groups={"BAT"})
    public void testSupport(){
        HomePage homePage=new HomePage();
        SupportPage supportPage=homePage.clickOnSupportButton();
        supportPage.clickOnChangeBookingButton();
        Assert.assertTrue(isElementVisible(supportPage.enterBookingDetails));
    }
}
