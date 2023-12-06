package test_shoppingcart;

import base.BasePage;
import homepage.HomePage;
import loginpage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import resutpage.ResultPage;

public class TestShoppingCart extends BasePage {

    @Test(priority = 1, groups = {"BAT"})

    public void testAddToCart() {
        HomePage homePage = new HomePage();
        String searchTerm="Cat Food";
        ResultPage resultPage= homePage.doSearch(searchTerm);
        resultPage.doAddToCart();
        Assert.assertTrue(isElementVisible(resultPage.goToCheckoutButton));
    }
}