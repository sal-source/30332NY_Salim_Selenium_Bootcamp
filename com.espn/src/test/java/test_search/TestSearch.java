package test_search;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import searchresultpage.SearchResultPage;
import utils.ExcelData;

import java.io.IOException;

public class TestSearch extends BasePage {

    //  @Test(priority = 1, groups = {"smoke"})
//
//    public void testDoSearch(){
//        HomePage homePage= new HomePage();
//        SearchResultPage searchResultPage=new SearchResultPage();
//        String searchTerm= "Soccer";
//        homePage.doSearch(searchTerm);
//        Assert.assertTrue(isElementVisible(searchResultPage.searchResult));
//
//    }

//    public void testDoSearch() {
//        HomePage homePage = new HomePage();
//
//        String[] searchTerms = excel.readStringArray("doSearch");
//        String searchTerm = searchTerms[0];
//        SearchResultPage searchResultPage = homePage.doSearch(searchTerm);
//        Assert.assertTrue(isElementVisible(searchResultPage.searchResult));
//
//    }

    /*Test case: Search
     *1. Navigate to the espn.com homepage
     *2.Enter a specific search term, Sports , Teams or Player, in the search bar.
     *3.Verify that the search results are displayed correctly based on the specified criteria

     */
    @Test(priority = 1, groups = {"BAT"},dataProvider = "searchDataProvider")

    public void testDoSearch(String searchTerm) {
        HomePage homePage = new HomePage();
        SearchResultPage searchResultPage= homePage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.searchResult));
    }
    @DataProvider(name="searchDataProvider")
    public Object[][] searchDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSearch");
        return data;

    }
}
