package test_marketdata;

import base.BasePage;
import homepage.HomePage;
import homepage.MarketDataPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMarketData extends BasePage {
    @Test(priority = 1, groups={"BAT"})

    public void testMarketData(){
        HomePage homePage=new HomePage();
        MarketDataPage marketDataPage= homePage.doVerifyBlogDropDown();
        Assert.assertTrue(isElementVisible(marketDataPage.marketDataHeader));
    }
}
