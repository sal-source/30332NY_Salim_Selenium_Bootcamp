package test_searchstay;

import base.BasePage;
import staysearchpage.StaySearchPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestSearchStays extends BasePage {
/*Test Case: Hotel Search Functionality
*1.Launch the web browser and navigate to www.expedia.com.
*2.Click on the "Stays" tab in the navigation menu.
*3.Enter the destination city or hotel name in the "Going to" field.
*4.Select the desired check-in date.
*5.Select the desired check-out date.
* 6.Specify the number of rooms and guests.
* 7.Click on the "Search" button.
* 8.Verify that the search results are displayed correctly.
*9.Check that the hotel details, including hotel names, star ratings, prices, and availability, are accurate.
 */


    @Test(priority= 1, groups= {"BAT"},dataProvider = "searchFlightDataProvider")

    public void testSearchFlightData(String goingToCity,String fromDate,String toDate){

        StaySearchPage flightSearchPage=new StaySearchPage();
        flightSearchPage.searchFlight(goingToCity,fromDate,toDate);
        Assert.assertTrue(checkElementSelected(flightSearchPage.searchHotelData));
        Assert.assertTrue(checkElementSelected(flightSearchPage.showMoreResults));

    }
    @DataProvider(name="searchFlightDataProvider")
    public String[][] searchFlightsDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("expedia_search");
        return data;

    }

}
