package test_search;


import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestSearch extends BasePage {

    /* Test case: Test the search functionality on the bmw.com website:
     *1.Navigate to the bmw.com website (https://www.bmw.com).
     *2.Click on the search bar to activate it.
     *3.Enter the keyword "BMW" or any specific term you want to search for.
     *4.Press the Enter key .
     *5.Verify that the search results are relevant to the entered keyword.
     * 6.
     */

    @Test(priority = 1, groups = {"BAT"}, dataProvider = "searchDataProvider")

    public void testSearch(String model, String year) {
        HomePage homePage = new HomePage();
        homePage.doSearch(model, year);

    }

    @DataProvider(name = "searchDataProvider")
    public String[][] searchDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSearch");
        return data;

    }
    
}
