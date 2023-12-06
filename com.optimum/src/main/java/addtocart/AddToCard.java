package addtocart;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCard extends BasePage {
    public AddToCard(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='lineListColumn']//span[contains(.,'Add to cart')]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[.='No, I am a new customer']")
    public WebElement newCustomerButton;

    @FindBy(xpath = "//div[@class='anchor-link']/a[contains(.,'Skip')]")
    public WebElement skipButton;
    @FindBy(xpath = "//input[@id='email-input']")
    public WebElement zipCodeInputField;

    @FindBy(xpath = "//span[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//span[.='Continue']")
    public WebElement continueButton;
    @FindBy(xpath = "//div[@class='title-xs']")
    public WebElement cartText;

    public void clickOnAddToCartButton(){
        safeClickOnElement(addToCartButton);
    }
    public void clickOnNewCustomerButton(){
        safeClickOnElement(newCustomerButton);
    }
    public void clickOnSkipButton(){
        safeClickOnElement(skipButton);
    }
    public void enterZipCode(String zipCode){
        sendKeysToElement(zipCodeInputField,zipCode);
    }
    public void clickOnSubmitButton(){
        safeClickOnElement(submitButton);
    }
    public void clickOnContinueButton(){
        safeClickOnElement(continueButton);
    }

    public void doAddToCart(String zipCode){
        clickOnAddToCartButton();
        clickOnNewCustomerButton();
        clickOnSkipButton();
        enterZipCode(zipCode);
        clickOnSubmitButton();
        clickOnContinueButton();
    }
}
