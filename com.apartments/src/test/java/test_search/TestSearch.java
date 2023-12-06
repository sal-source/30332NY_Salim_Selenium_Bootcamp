package test_search;
import authenticationpage.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resultpage.SearchResultPage;
import utils.ExcelData;

public class TestSearch extends BasePage {

//Test Case: As a user, I should be able to search items on the web application.
//    Navigate to URL
//    Enter a search term in the search bar
//    Click on the search icon button
//    Verify that the search results are relevant to the entered term



    @Test(priority = 2 ,groups = {"BAT"}, dataProvider = "testDoSearch")
    public void testDoSearch(String searchTerm){
        HomePage homepage= new HomePage();
        SearchResultPage searchResultPage= homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.textSearchTerm));
    }

    @DataProvider(name="testDoSearch")
    public Object[][] testRegistrationDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("testDoSearch");
        return data;

    }
//Test Case: Test Search with invalid search term
//    Navigate to URL
//    Perform a search with invalid search term
//    Click on the search icon button
//    Verify that the appropriate message is displayed for an invalid search term

    @Test(priority = 3,groups={"BAT"})
    public void testDoSearchWithInvalidSearchTerm() {

        HomePage homepage = new HomePage();
        String searchTerm = "@#$^";
        SearchResultPage searchResultPage = homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.resultInvalidSearchTerm));
    }

}