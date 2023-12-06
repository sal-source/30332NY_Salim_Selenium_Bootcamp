package test_helpcenter;

import attractionspage.AttractionPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelpCenter extends BasePage {

     /*Test Case:Help center on Booking.com
    *1.Navigate to booking.com.
    *2.Click on the "Attractions" link.
    *3.Click on "Attractions help center" icon.
    *4.Click on "How could the coronavirus affect my visit" drop down
    *5.Click "Here" link
    * 6.Verify that you are able to access all the restrictions and requirements info.
     */
    @Test(priority = 1, groups={"BAT"})
    public void testHelpCenter(){

        HomePage homePage=new HomePage();
        AttractionPage attractionPage=new AttractionPage();
        homePage.clickOnAttractionButton();
        attractionPage.helpCenter();
        switchToTab();
        Assert.assertTrue(isElementVisible(attractionPage.textResult));
    }
}
