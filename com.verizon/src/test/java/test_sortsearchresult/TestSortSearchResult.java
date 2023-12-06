package test_searchstores;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import searchpage.ResultSearchPage;
import searchpage.SearchPage;
import utils.ExcelData;

public class TestSortSearchResult extends BasePage {

//Test Case: Test the sorting functionality on the verizon.com website
//1.Navigate to the verizon.com website (https://www.verizon.com).
//2.Click on the search bar to activate it.
//3.Enter a specific keyword or search query related to your test case ("iPhone 14 ", "iphone 13","iPhone 14 Plus").
//4.Press the Enter key or click the search button/icon.
//5.Select a specific sorting option from the available choices ( "Rating: Highest First" "Color : Black").
//6.Observe the search results and ensure that they are re-ordered according to the selected sorting option.


    @Test(priority = 1, groups = {"BAT"}, dataProvider = "sortDataProvider")

    public void testSort(String searchTerm)  {
        HomePage homePage = new HomePage();
        SearchPage searchPage= homePage.clickOnSearchButton();
        ResultSearchPage resultSearchPage=searchPage.doSearch(searchTerm);
        resultSearchPage.doSorting();
        Assert.assertTrue(isElementVisible(resultSearchPage.resultNumber));


    }

    @DataProvider(name = "sortDataProvider")
    public String[][] searchDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSearch");
        return data;

    }
}

