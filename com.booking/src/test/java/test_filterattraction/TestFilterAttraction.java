package test_filterattraction;

import attractionspage.AttractionPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilterAttraction extends BasePage {
    /*Test Case:Filter Attractions on Booking.com
    *1.Navigate to booking.com.
    *2.Click on the "Attractions" link.
    *3.Select a category filter from the available options.
    *4.Verify that the attractions are filtered based on the selected category.
    *5.Select a price range filter (e.g., "$$" - moderate) from the available options
    *6.Verify that the attractions are filtered based on the selected price range.
    * 7.Verify that the attractions are sorted according to the selected sorting option.
     */

    @Test(priority=5,groups={"BAT"})
    public void testDoFilterAttraction(){
        HomePage homePage=new HomePage();
        AttractionPage attractionPage=homePage.clickOnAttractionButton();
        attractionPage.doFilterAttraction();
        Assert.assertTrue(isElementVisible(attractionPage.testResult));
    }
}
