package test_addtocard;

import addtocart.AddToCard;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddToCart extends BasePage {

    /* Test Case : Test adding to cart functionality
    *1.Navigate to http://optimum.com
    *2.Click on "Shop plan" link
    *3.Click on "Add to Cart" Button
    *3.Click on "I am a new customer" button
    *5.Provide a zip code, enter it in a zip code input field
    *6.Click On Continue button
    * 7.Verify that the selected plan was successfully added to the cart
   */

    @Test(priority = 1,groups={"BAT"})
    public void testAddToCart(){

        HomePage homePage=new HomePage();
        AddToCard addToCard= homePage.clickOnShopButton();
        String zipCode="10001";
        addToCard.doAddToCart(zipCode);
        Assert.assertTrue(isElementVisible(addToCard.cartText));

    }
}
