package test_searchflight;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchFlight extends BasePage {

    /*Test Case: Search Flight on Booking.com
    *1. Open a web browser and navigate to the Booking.com website (https://www.booking.com).
    *2.Click on "Flights" Button.
    *3.Enter the departure airport in the departure airport input field. Use a valid airport code or name, such as "JFK" or "New York
    *4.Enter the destination airport in the destination airport input field. Use a valid airport code or name, such as "LHR" or "London."
    *5.Enter the departure date in the departure date input field. Use a valid date in the desired format (e.g., YYYY-MM-DD).
    *6.Enter the return date in the return date input field. Use a valid date in the desired format (e.g., YYYY-MM-DD).
    * 7.Click on the search button to initiate the flight search.
    * 8.Verify that the search results page is successfully loaded by checking for the presence of relevant elements such as flight options, filters, and sorting options.
     */

    @Test(priority= 4,groups={"BAT"})
    public void testSearchForFlight(){
        HomePage homePage= new HomePage();

        String countryName="Greece";
        homePage.doSearchFlights(countryName);

        Assert.assertTrue(isElementVisible(homePage.searchResults));
    }
}
