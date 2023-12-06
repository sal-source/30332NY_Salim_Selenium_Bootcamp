package test_sharearticleontwitter;

import base.BasePage;
import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import sharearticleonsocialmedia.ResultPage;
import sharearticleonsocialmedia.ShareAnArticleOnSocialMediaPage;
import sharearticleonsocialmedia.TwitterPage;

public class TestArticleOnTwitter extends BasePage {

    @Test(priority = 2, groups = {"smoke"})
    public void testShareArticle() {

        HomePage homePage = new HomePage();
        ResultPage resultPage= new ResultPage();
        homePage.clickOnSoccerButton();

        ShareAnArticleOnSocialMediaPage shareAnArticleOnSocialMediaPage= new ShareAnArticleOnSocialMediaPage();
        shareAnArticleOnSocialMediaPage.clickOnSoccerArticle();

        if (resultPage.isSocialMediaSharingVisible()) {
            // Click on a social media sharing button
            resultPage.clickOnTwitterIcon();

            // Switch to the new window or popup
            String parentWindowHandle = driver.getWindowHandle();
            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(parentWindowHandle)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }


        }
    }


}
