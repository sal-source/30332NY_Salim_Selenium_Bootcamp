package test_switchlanguage;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSwitchLanguage extends BasePage {


    /*Test Case: Switching Language on Booking.com
    *1.Navigate to Booking.com website
    *2.Locate the language selector on the Booking.com homepage. It is typically displayed as a flag icon or a dropdown menu.
    *3.Click on the language selector to expand the available language options.
    *4.Identify the target language to switch to.
    *5.Click on the target language to select it.
    *6.Verify that the website content, including text, headings, and navigation elements, is now displayed in the selected language.
     */
    @Test(priority = 1,groups={"BAT"})
    public void testSwitchLanguage(){
        HomePage homePage= new HomePage();
        homePage.doSwitchLanguage();
        Assert.assertTrue(isElementVisible(homePage.seConnecterBouton));
    }
}
