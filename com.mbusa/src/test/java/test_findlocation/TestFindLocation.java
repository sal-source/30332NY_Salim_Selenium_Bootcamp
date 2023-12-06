package test_findlocation;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import searchpage.SearchPage;
import utils.ExcelData;

public class TestFindLocation extends BasePage {

    /*Test Case: Validate the functionality of the location search feature
    *1.Navigate to the MBUSA website.
    *2.Locate and click on the "Find a Dealer" or "Locations" section
    *3.Verify that the location search page is displayed.
    *4.Enter the desired location details by providing the city, state, ZIP code, or any other relevant information in the search field.
    *5.Click on the search button.
    *6.Verify that the search results are displayed.
    * 7.Click on collision center button
    * 8.Check if the search results list contains relevant locations.
     */
    @Test(priority=5,groups={"BAT"},dataProvider = "findDealerLocationDataProvider")
    public void testFindDealer(String zipCode){
        HomePage homePage=new HomePage();
        SearchPage searchPage= homePage.doFindDealer(zipCode);
        searchPage.clickOnCollisionCenter();
        Assert.assertTrue(isElementVisible(searchPage.collisionCenterResult));
    }
    @DataProvider(name = "findDealerLocationDataProvider")
    public String[][] findDealerDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doFindDealer");
        return data;

    }

}
