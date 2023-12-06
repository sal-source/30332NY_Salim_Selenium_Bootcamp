package test_switchlanguage;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSwitchLanguage extends BasePage {
    /*Test case: Switch language
    *1.Launch the web browser and navigate to www.expedia.com.
    *2.Click on "English" Button
    *3.Select the desired language from the drop-down language
    *4.Click on "save" Button
    *5.Verify that the language successfully switched.
     */

    @Test(priority=1,groups={"BAT"})
    public void testSwitchLanguage(){
        HomePage homePage=new HomePage();
        homePage.doSwitchLanguage();

        Assert.assertTrue(isElementVisible(homePage.spanishLanguageButton));
    }
}
