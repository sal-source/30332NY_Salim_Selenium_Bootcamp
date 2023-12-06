package test_authentication;

import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {

    /*Test Case:  log in to StreetEasy
    *1.Open your web browser and go to the StreetEasy website (www.streeteasy.com).
    *2.Click on the "Log in" link located in the top right corner of the homepage. This will take you to the login page.
    *3.Click on  "Log in with email" button.
    *4.Enter the email address associated with your StreetEasy account in the provided field.
    *5.Click on "Submit" button
    * 6. Type your password in the designated password field.
    * 7. Click on the "Log in" button to proceed.
    * 8.If the login credentials you entered are correct, you will be redirected to your StreetEasy account dashboard, where you can access your saved searches, listings, and other account features.
     */

    @Test(priority = 1, groups = {"BAT"}, dataProvider = "loginDataProvider")
    public void testLogin(String email, String password) {
        HomePage homePage = new HomePage();
        homePage.doLogin(email, password);

    }


    @DataProvider(name = "loginDataProvider")
    public String[][] loginDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doLogIn");
        return data;
    }
}
