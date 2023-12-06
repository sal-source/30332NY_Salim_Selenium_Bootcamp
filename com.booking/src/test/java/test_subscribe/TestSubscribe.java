package test_subscribe;

import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestSubscribe extends BasePage {

    /*Test Case: Subscribe on Booking.com
    *1.Navigate to the Booking.com homepage.
    *2.Locate the subscription or newsletter signup section on the homepage. It is typically displayed as a form or a subscription widget.
    *3.Fill in the required information in the subscription form, including:
          Email address: Enter a valid email address to receive updates and newsletters
    *4.Click on the "Subscribe" or "Sign Up" button to submit the subscription form
    *5.Check the provided email address for a subscription confirmation email from Booking.com
     */

    @Test(priority = 1, groups={"BAT"}, dataProvider = "subscribeDataProvider")
    public void testDoSubscribeEmail(String email) {
        HomePage homePage = new HomePage();
        homePage.doSubscribe(email);
    }


    @DataProvider(name = "subscribeDataProvider")
    public String[][] subscribeDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSubscribe");
        return data;
    }
}
