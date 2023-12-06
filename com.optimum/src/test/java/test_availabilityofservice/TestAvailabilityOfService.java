package test_availabilityofservice;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAvailabilityOfService extends BasePage {

    /*Test Case: Validate the functionality to check service availability at a specific location.
    *1.Navigate to the optimum.com website.
    *2.Locate the "Check Availability" or "Service Availability" section
    *3.Enter the required address details (street, city, state, ZIP code) in the provided input fields.
    *4.Click on the "Check Availability" or similar button.
    *5.Check if the system indicates whether the services (internet, TV, phone) are available at the specified location.
     */

    @Test(priority = 1,groups={"BAT"}, dataProvider = "checkAvailabilityDataProvider")
    public void testAvailabilityOfService(String addressStreet,String zipCode ){
        HomePage homePage=new HomePage();

        homePage.doCheckAvailabilityOfService(addressStreet,zipCode);
        Assert.assertTrue(isElementVisible(homePage.resultText));
    }
    @DataProvider(name = "checkAvailabilityDataProvider")
    public String[][] availabilityDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doCheckAvailability");
        return data;
    }

}
