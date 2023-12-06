package sharearticleonsocialmedia;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage extends BasePage {

    public TwitterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"layers\"]/div[3]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div/span/span/span")
    public WebElement twitterLoginButton;

    public void clickOnTwitterLoginButton(){
        safeClickOnElement(twitterLoginButton);
    }
}