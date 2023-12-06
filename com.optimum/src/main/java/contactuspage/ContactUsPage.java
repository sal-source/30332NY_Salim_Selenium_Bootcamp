package contactuspage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BasePage {

    public ContactUsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[.='Chat now']")
    public WebElement chatNowButton;
    @FindBy(xpath="//span[@class='asappChatSDKBadge__text']")
    public WebElement chatWithUsText;

    public void clickOnChatNowButton(){
        safeClickOnElement(chatNowButton);
    }
}
