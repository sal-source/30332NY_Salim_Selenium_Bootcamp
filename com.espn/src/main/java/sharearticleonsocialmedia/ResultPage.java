package sharearticleonsocialmedia;



import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage {

    @FindBy(xpath = "//ul[@class='article-social vertical']//a[.='Twitter']")
    public WebElement twitterIcon;


    public boolean isSocialMediaSharingVisible(){
        return twitterIcon.isDisplayed();
    }
    public TwitterPage clickOnTwitterIcon(){
        safeClickOnElement(twitterIcon);
        return new TwitterPage();
    }
}
