package test_vehicleconfiguration;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import searchpage.ModelSelectedPage;




public class TestVehicleConfiguration extends BasePage {


    /*Test Case:Vehicle configuration
     *1.Navigate to bmwusa.com.
     *2.Select a specific model.
     * Click on "Build your own"
     *3.Customize the vehicle by selecting various options (color, trim, packages).
     *4.Verify that the selected options are reflected in the configured vehicle.
     */
    @Test(priority = 1, groups = {"BAT"})

    public void testVehicleConfiguration() {
        HomePage homePage = new HomePage();
        ModelSelectedPage modelSelectedPage= homePage.clickOnVehicleModel();
        modelSelectedPage.buildYourOwn();
        Assert.assertTrue(isElementVisible(modelSelectedPage.descriptiveText));


    }
}
