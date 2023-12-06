package test_search;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resutpage.ResultPage;
import utils.ExcelData;

public class TestSearch extends BasePage {

    /* Test case: Test the search functionality on the ebay.com website:
     *1.Navigate to the verizon.com website (https://www.ebay.com).
     *2.Click on the search bar to activate it.
     *3.Enter any specific term you want to search for.
     *4.Click on "Search button" .
     *5.Verify that the search results are relevant to the entered keyword.
     * 6.
     */
    @Test(priority = 1, groups = {"BAT"}, dataProvider = "searchDataProvider")

    public void testSearch(String searchTerm){
        HomePage homePage = new HomePage();
        ResultPage resultPage= homePage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(resultPage.resultsNumber));


    }

    @DataProvider(name = "searchDataProvider")
    public String[][] searchDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSearch");
        return data;
    }
}
