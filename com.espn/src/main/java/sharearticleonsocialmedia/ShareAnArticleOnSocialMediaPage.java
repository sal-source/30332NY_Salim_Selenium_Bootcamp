package sharearticleonsocialmedia;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShareAnArticleOnSocialMediaPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"news-feed\"]/article[1]/section/a/div/div[3]/h2")
    public WebElement soccerArticle;




    public void clickOnSoccerArticle(){
        safeClickOnElement(soccerArticle);
    }
}