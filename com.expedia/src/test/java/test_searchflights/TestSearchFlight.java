package test_searchflights;

import base.BasePage;
import flightsearchpage.FlightSearchPage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchFlight extends BasePage {

    /*Test Case: Flight Search Functionality
    *1.Launch the web browser and navigate to www.expedia.com.
    *2.Click on the "Flights" tab in the navigation menu.
    *3.Enter the departure city in the "Flying from" field.
    *4.Enter the destination city in the "Flying to" field.
    *5.Select the desired departure date.
    * 6.Select the desired return date (if applicable).
    * 7.Specify the number of passengers and any other relevant search criteria.
    * 8.Click on the "Search" button.
    * 9.Verify that the search results are displayed correctly.
     */

    @Test(priority = 3,groups={"BAT"})

    public void testDoSearchFlight(){
        HomePage homePage=new HomePage();
        String cityA="Philadelphia";
        String cityB="Greece";
        FlightSearchPage flightSearchPage= homePage.doSearch(cityA,cityB);
        Assert.assertTrue(isElementVisible(flightSearchPage.resultText));
    }
}
