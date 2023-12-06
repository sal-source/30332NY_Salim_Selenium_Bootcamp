package test_search;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resultpage.ResultPage;
import utils.ExcelData;

public class TestSearch extends BasePage {
    /*Test Case:Search for Investing
    *1.Navigate to the Investing.com website.
    *2.Enter the search term "investing" in the search bar.
    *3.Click on the search icon/button.
    *4.Verify that the  search results page  displays a list of relevant results related to the search term.
     *
     */

    @Test(priority= 1, groups= {"BAT"},dataProvider = "searchDataProvider")

    public void testSearchFlightData(String searchTerm){

        HomePage homePage=new HomePage();
        ResultPage resultPage= homePage.doSearch(searchTerm);

        Assert.assertTrue(isElementVisible(resultPage.resultsSum));
    }
    @DataProvider(name="searchDataProvider")
    public Object [][] searchFlightsDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSearch");
        return data;

    }

}
