package test_storelocator;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import storeslocatorpage.StoreLocatorPage;
import utils.ExcelData;

public class TestStoreLocator extends BasePage {

    /*Test Case : Validate the functionality to find the store locator on optimum.com.
    *1.Navigate to the optimum.com website.
    *2.Locate the main navigation menu or search bar on the homepage.
    *3.Search for keywords like "Store Locator," "Find a Store," or "Store Finder" in the search bar.
    *4.Enter the desired address, city, state, or ZIP code in the provided search field.
    *5.Initiate the search by clicking on the "Search" or similar button
    * 6.Verify that the system provides accurate results for store locations based on the entered location details.
     */

    @Test(priority = 1,groups={"BAT"}, dataProvider = "storeLocatorDataProvider")
    public void testFindStoreLocator(String city){
        HomePage homePage=new HomePage();
        StoreLocatorPage storeLocatorPage= homePage.clickOnStoreLocatorButton();
        storeLocatorPage.doFindLocator(city);
        Assert.assertTrue(isElementVisible(storeLocatorPage.resultText));

    }
    @DataProvider(name = "storeLocatorDataProvider")
    public String[][] findStoreLocatorDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doFindStoreLocator");
        return data;
    }

}
