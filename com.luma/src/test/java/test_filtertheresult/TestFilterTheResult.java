package test_filtertheresult;


import authenticationpage.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilterTheResult extends BasePage {

//Test Case :This test case verifies that the search results are filtered correctly based on a specific category selection
//    Navigate to URL
//    Select a specific category from the navigation menu
//    Enter a search query in the search bar
//    Click on the "Search" button
//    Verify that the search results should only display products that belong to the selected category.


    @Test(priority = 10, groups = {"BAT"})

    public void testCategoryResult() {
        HomePage homepage = new HomePage();
        homepage.doFilterTo();
        Assert.assertTrue(isElementVisible(homepage.categoryJacketResult));
    }
}
