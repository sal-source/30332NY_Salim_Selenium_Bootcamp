package test_addtowatchlist;

import base.BasePage;
import futurechartspage.FutureChartPage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAddToWatchList extends BasePage {
    /*
  *1.Open your web browser and go to the investing.com website.
   *2.Click on the "Sign In" or "Login" button to proceed to the login page
   *3.Enter your registered email address in the first input field.
   *4.Enter your password in the second input field
   *5.click on the "Login" button to submit the form.
   *6.Hover over on "Charts" link
   *7.Click on "future charts" button.
   *8.Click on the "Add to Watchlist" option/icon/button.
   * Check the button next to  "Add to Watchlist" and hit "Apply"
   *9.Wait for the confirmation message or indication that the chart has been added to the watchlist
     */
    @Test(priority= 1, groups= {"BAT"},dataProvider = "addToWatchListDataProvider")

    public void testAddToWatchList(String email,String password){
        HomePage homePage = new HomePage();
        homePage.doSignIn(email, password);
        Assert.assertTrue(isElementVisible(homePage.userName));
        homePage.clickOnChartsLink();
        FutureChartPage futureChartPage= homePage.clickOnFuturesChart();
        futureChartPage.doAddToWatchList();
        Assert.assertTrue(isElementVisible(futureChartPage.successfullyAddedMessage));

    }
    @DataProvider(name="addToWatchListDataProvider")
    public String[][] loginDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doLogIn");
        return data;

    }
}
