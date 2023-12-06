package test_addtocard;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import searchpage.ResultSearchPage;
import searchpage.SearchPage;

public class TestAddToCart extends BasePage {


    //Test Case: Test the adding item functionality on the verizon.com website
//1.Navigate to the verizon.com website (https://www.verizon.com).
//2.Click on the search bar to activate it.
//3.Enter a specific keyword or search query related to your test case ("iPhone 14 ", "iphone 13","iPhone 14 Plus").
//4.Press the Enter key or click the search button/icon.
//5.Select a specific sorting option from the available choices ( "Rating: Highest First" "Color : Black").
//6.Click on desired product link.
//7. Click on "Continue" button.
//8.Enter a zip code in the zip code input field
//9.Click on Confirm Location button.
//10.Click on "New Customer" button.
//11. Verify that a message "has been added" displays.

    @Test(priority = 1, groups = {"BAT"})

    public void testAddToCart() {
        HomePage homePage = new HomePage();
        SearchPage searchPage = homePage.clickOnSearchButton();
        String searchTerm="iPhone 14";
        ResultSearchPage resultSearchPage = searchPage.doSearch(searchTerm);
        resultSearchPage.doSorting();
        String zipCode="19145";
        searchPage.doAddToCart(zipCode);
        Assert.assertTrue(isElementVisible(searchPage.confirmationText));

    }
}
