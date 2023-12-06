package test_searchstores;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import storeslocationpage.StoresLocationPage;
import utils.ExcelData;

public class TestSearchStores extends BasePage {

    /*Test Case :Find Store on Verizon.com
    *1.Launch the Verizon.com website.
    *2.Click on the "Stores" link.
    *3.Enter a valid location (e.g., city, state, or ZIP code) in the search field.
    *4.Click on the search button or press Enter.
    * 5.Verify that the store details are displayed accurately, including the store's address, phone number, and operating hours.
     */

    @Test(priority = 1, groups = {"BAT"}, dataProvider = "findStoresDataProvider")

    public void testFindStores(String zipCode)  {
        HomePage homePage = new HomePage();
        StoresLocationPage storesLocationPage = homePage.clickOnStoreLink();
        storesLocationPage.doFindStores(zipCode);


        Assert.assertTrue(isElementVisible(storesLocationPage.searchResultTitle));

    }

    @DataProvider(name = "findStoresDataProvider")
    public String[][] searchDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doFindStores");
        return data;

    }
}
