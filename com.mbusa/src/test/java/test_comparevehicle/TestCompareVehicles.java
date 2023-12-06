package test_comparevehicle;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import vehiclepage.VehiclePage;

public class TestCompareVehicles extends BasePage {

    /*Test Case: Vehicle Comparison
    *1.Navigate to the MBUSA website.
    *2.Click on "Vehicles" button.
    *3.Click on  "Compare Models" button
    *4.Click on "Add A Vehicle" Icon
    *5.Select two models
    *6.Click on Compare Button.
    * 7.Verify that the comparison page is displayed, showing the selected vehicles side by side.
     */
    @Test(priority = 1, groups = {"BAT"})
    public void testDoCompareVehicle(){
        HomePage homePage=new HomePage();

        VehiclePage vehiclePage= homePage.clickOnExploreButton();
        vehiclePage.doCompare();
        Assert.assertTrue(isElementVisible(vehiclePage.featuresHighlightsText));
    }
}
