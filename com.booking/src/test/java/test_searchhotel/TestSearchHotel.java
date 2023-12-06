package test_searchhotel;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import resultspage.SearchPage;

public class TestSearchHotel extends BasePage {
/*Test Case: Search Hotel on Booking.com
*1.Enter a destination in the search box
*2.Select the desired check-in and check-out dates.
*3.Specify the number of guests and rooms.
*4.Click on the "Search" button.
*5.The search results page displays hotels available for the specified criteria.
*
 */
    @Test(priority=5,groups={"BAT"})

    public void testDoSearchHotel()  {
        HomePage homePage=new HomePage();
        SearchPage searchPage= homePage.doSearchHotel();
        Assert.assertTrue(isElementVisible(searchPage.resultText));
    }
}
