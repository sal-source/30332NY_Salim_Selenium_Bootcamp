package test_filtersearch;

import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.Test;
import searchpage.SearchPage;

public class TestSearch extends BasePage {
/*Test Case:  Test Filter your search functionality on StreetEasy
*1.Open your web browser and go to the StreetEasy website (www.streeteasy.com).
*3.Click on "Buy" link
*4.Select the city where you want to make your purchase.
*5.Select the type of desired property
*7.Verify that the displayed result is relevant to your filter.
*
 */
    @Test(priority = 1,groups={"BAT"})
    public void testDoFilter(){
        HomePage homePage=new HomePage();
        SearchPage searchPage=homePage.clickOnLocation();
        searchPage.doFilterSearch();

    }
}
