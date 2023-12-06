package test_addtofavorite;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import storeslocationpage.StoreLocationResult;
import storeslocationpage.StoresLocationPage;
import utils.ExcelData;

public class TestAddToFavorite extends BasePage {


    /*Test Case :Add To Favorite Store on Verizon.com
     *1.Launch the Verizon.com website.
     *2.Click on the "Stores" link.
     *3.Enter a valid location (e.g., city, state, or ZIP code) in the search field.
     *4.Click on the search button or press Enter.
     * 5.Click on "View Store Details" button
     * 6.Click on "Heart Icon" Button
     * 7.Verify that the store was added successfully and an alert was displayed.
     */
    @Test(priority = 1, groups = {"BAT"}, dataProvider = "addToFavoriteDataProvider")

    public void testFindStores(String zipCode)  {
        HomePage homePage = new HomePage();
        StoresLocationPage storesLocationPage = homePage.clickOnStoreLink();
        StoreLocationResult storeLocationResult= storesLocationPage.doFindStores(zipCode);
        storeLocationResult.doAddToFavorite();


        Assert.assertTrue(isElementVisible(storeLocationResult.confirmationText));

    }

    @DataProvider(name = "addToFavoriteDataProvider")
    public String[][] searchDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doFindStores");
        return data;

    }
}
