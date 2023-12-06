package test_radiobuttons;

import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.Test;

public class TestRadioButtons extends BasePage {

    @Test(priority = 1, groups = {"Smoke"})
    public void testRoundTripRadioButton(){
        HomePage homePage = new HomePage();
        homePage.clickOnRoundTripRadioButton();
        checkElementSelected(homePage.roundTripRadioButton);


    }
    @Test(priority = 2, groups = {"Smoke"})
    public void testOneWayRadioButton(){
        HomePage homePage = new HomePage();
        homePage.clickOnOneWayRadioButton();
        checkElementSelected(homePage.oneWayRadioButton);

    }

    @Test(priority = 3, groups = {"Smoke"})
    public void testMultiCityRadioButton(){
        HomePage homePage = new HomePage();
        homePage.clickOnMultiCityRadioButton();
        checkElementSelected(homePage.multiCityRadioButton);

    }
}
