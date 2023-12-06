package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import searchpage.SearchPage;

public class HomePage extends BasePage {

        @FindBy(xpath = "//a[@aria-label='Blog']")
        public WebElement blogDropdown;

        @FindBy(xpath = "//a[normalize-space()='Market Data']")
        public WebElement marketDataButton;
        @FindBy(xpath = "//button[@class='Typography__Body-sc-100sue7-0 styled__BodyLink-sc-1539xtj-0 bifKRW bFmZnr styled__HeaderNavButton-sc-13gaig-0 azbHp styled__SignInRegisterButton-sc-1ajtd72-0 LKAzv jsGoogleOneTap']")
        public WebElement signInButton;
        @FindBy(xpath = "//input[@id='login-email-input']")
        public WebElement emailInputField;
        @FindBy(xpath = "//button[@class='styled__BaseButton-sc-1mmbp3f-0 styled__Primary-sc-1mmbp3f-1 fha-dcQ bqodGM']")
        public WebElement submitButton;
        @FindBy(xpath = "//input[@name='password']")
        public WebElement passwordInputField;
        @FindBy(xpath = "//button[@class='styled__BaseButton-sc-1mmbp3f-0 styled__Primary-sc-1mmbp3f-1 fha-dcQ bqodGM']")
        public WebElement loginButton;
        @FindBy(xpath = "//button[@aria-label='Buy']")
        public WebElement buyLink;
        @FindBy(xpath="//a[@data-gtm-header-menu='Sales'][normalize-space()='Manhattan']")
        public WebElement desiredLocation;

        public HomePage() {
            PageFactory.initElements(driver, this);
        }

        public void hoverOverBlogDropDown(){
            hoverOverElement(blogDropdown);
        }

        public void clickOnMarketDataButton(){

            safeClickOnElement(marketDataButton);
        }

        public MarketDataPage doVerifyBlogDropDown(){
            hoverOverBlogDropDown();
            clickOnMarketDataButton();
           return new MarketDataPage();
        }

    public void clickOnSignInButton(){
            safeClickOnElement(signInButton);
    }
    public void enterEmailAddress(String emailAddress){
            sendKeysToElement(emailInputField,emailAddress);
    }
    public void clickOnSubmitButton(){
        safeClickOnElement(submitButton);
    }

    public void enterPassword(String password){
        sendKeysToElement(passwordInputField,password);
    }

    public void clickOnLoginButton(){
        safeClickOnElement(loginButton);
    }

    public void doLogin(String emailAddress, String password){
            clickOnSignInButton();
            enterEmailAddress(emailAddress);
            clickOnSubmitButton();
            enterPassword(password);
            clickOnLoginButton();
    }
    public void clickOnBuyLink(){
            safeClickOnElement(buyLink);
    }
    public void clickOnDesiredLocation(){
            safeClickOnElement(desiredLocation);
    }

    public SearchPage clickOnLocation(){
            clickOnBuyLink();
            clickOnDesiredLocation();
            return new SearchPage();
    }
}

