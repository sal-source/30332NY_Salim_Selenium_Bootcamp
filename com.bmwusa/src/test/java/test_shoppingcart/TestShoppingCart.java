package test_shoppingcart;

import authentication.DashboardPage;
import authentication.LoginPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import shoppingpage.ShoppingPage;

public class TestShoppingCart extends BasePage {

    /*Test Case: TEST the scenario of selecting an accessory for My BMW on the bmwusa.com website.
    *1.Navigate to the bmwusa.com website (https://www.bmwusa.com).
    *2.Click on the "Login" button/link.
    *3.Enter the valid login credentials (username and password) in the appropriate input fields
    *4.Click on the "Login" button.
    *5.Click on Shopping Button
    *6.Click on Shop BMW Parts & Accessories
    *7.Click on Shop Now
    *8.Select the year, serie and model of your BMW.
    *9.Browse through the available accessories or use the search functionality to find a specific accessory.
    * 10.Click on the desired accessory to view its details.
    * 11.Verify that the accessory details page includes relevant information such as description, compatibility, pricing, and available options.
     */

    @Test(priority = 1, groups = {"BAT"})

    public void testShoppingCart()  {

        HomePage homePage= new HomePage();
        LoginPage loginPage=homePage.clickOnLoginLink();
        String email="sadouni.dalal@gmail.com";
        String password="AydenLiam1213@";
        DashboardPage dashboardPage=loginPage.doSign(email, password);

        ShoppingPage shoppingPage = dashboardPage.switchToNewTab();
        shoppingPage.doShop();

        Assert.assertTrue(isElementVisible(shoppingPage.descriptiveAccessory));
        String zipCode="19145";
        shoppingPage.clickOnAddToCart();

        shoppingPage.clickOnDealerNameInputField();
        shoppingPage.enterDealerLocation(zipCode);

        shoppingPage.clickOnLockUpButton();




    }
}
