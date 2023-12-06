package test_searchcontacts;

import base.BasePage;
import freecrm.pom.authentication.DashboardUserPage;
import freecrm.pom.authentication.LogInPage;
import freecrm.pom.contactspage.ContactPage;
import freecrm.pom.homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestSearchContact extends BasePage {

    /* Test Case: Contact Search
    * 1.Launch the FreeCRM application and navigate to the login page
    * 2.Enter valid login credentials (username and password) and click on the "Login" button
    * 3.Verify that the user is successfully logged in and redirected to the dashboard
    * 4.Enter the search criteria, such as the name, email, or phone number of the contact you want to search for.
    * 5.Click on the search button to initiate the search.
    * 6.Verify that the search results are displayed, showing the contacts that match the search criteria.
    *
     */

    @Test(priority= 1, groups= {"BAT"},dataProvider = "searchContactsDataProvider")

    public void testSearchContacts(String value){
        HomePage homePage = new HomePage();
        LogInPage logInPage=homePage.clickOnLoginButton();
        String email="sadouni.dalal@gmail.com";
        String password="AydenLiam1213";
        DashboardUserPage dashboardUserPage =logInPage.doLogin(email,password);
        Assert.assertTrue(isElementVisible(dashboardUserPage.userName));
        ContactPage contactPage= dashboardUserPage.clickOnContactsIcon();
        contactPage.doFilterSearchInContacts(value);
        Assert.assertTrue(isElementVisible(contactPage.filterApplied));

    }
    @DataProvider(name="searchContactsDataProvider")
    public String[][] contactsDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doFilterSearchInContacts");
        return data;

    }
}
