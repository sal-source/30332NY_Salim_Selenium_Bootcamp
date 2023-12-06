package test_shoppingcart;
import authenticationpage.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import shoppingcartpage.AddModifyCartPage;

public class TestShoppingCart extends BasePage {
     //Test Case: Test adding item to shopping cart functionality
//    Navigate to URL
//    Enter a search term in the search bar
//    Click on the search icon button
//    Select a product from the search results
//    Click on Add to the Cart button
//    Verify that the item was added to the cart

    //Test Case: Remove Item from shopping cart

//    Navigate to URL
//    Enter a search term in the search bar
//    Click on the search icon button
//    Select a product from the search results
//    Click on Add to the Cart button
//    Click on the cart Icon
//    Click on the Remove Item icon
//    Verify that the item was removed from the cart



    @Test(priority = 9, groups = {"BAT"})
    public void addModifyRemoveFromCartData() {
        HomePage homepage = new HomePage();
        homepage.doSearch("Duffle Bag");
        AddModifyCartPage addModifyRemove=new AddModifyCartPage();
        addModifyRemove.addToCartItem();
        addModifyRemove.modifyItem();
        addModifyRemove.removeCartItem();
        Assert.assertTrue(isElementVisible(addModifyRemove.noItemsInCart));

    }
}
