package test_shopparts;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import shoppingpage.ShopPartsPage;

public class TestShopParts extends BasePage {

    /* Test Case: Validate the functionality of the parts shopping feature
    *1.Navigate to the MBUSA website.
    *2.Locate and click on the "Shop Parts" or "Parts & Accessories" section
    *3.Click on Shop Tires
    *4.Click on  "By size" Button
    *5.Select the desired width, ratio and diameter for your tires
    *6.Click on shop now Button
    *7.Add the part to the shopping cart.
    *8.Validate that the part is successfully added to the shopping cart
     */

    @Test(priority = 3,groups={"BAT"})
    public void testDoShopParts(){
        HomePage homePage=new HomePage();
        ShopPartsPage shopPartsPage=homePage.clickOnShoppingLink();
        shopPartsPage.doShopParts();
        Assert.assertTrue(isElementVisible(shopPartsPage.descriptiveText));

    }
}
