package registrationpage;

import base.BasePage;
import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {

    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement emailInputField;

    @FindBy(xpath = "//span[.='Continue with email']")
    public WebElement continueWithEmailButton;

    @FindBy(xpath = "//input[@id='new_password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//input[@id='confirmed_password']")
    public WebElement confirmPasswordInputField;

    @FindBy(xpath = "//span[.='Create account']")
    public WebElement createAccountButton;


    public void enterEmail(String email){
    sendKeysToElement(emailInputField,email);
    }

    public void clickOnContinueButton(){
    safeClickOnElement(continueWithEmailButton);
    }
    public void enterPassword(String password){
        sendKeysToElement(passwordInputField,password);
    }
    public void confirmPassword(String password){
        sendKeysToElement(confirmPasswordInputField,password);
    }
    public void clickOnCreateAccountButton(){
        safeClickOnElement(createAccountButton);
    }

    public HomePage doRegister(String email,String password){
        enterEmail(email);
        clickOnContinueButton();
        enterPassword(password);
        confirmPassword(password);
        clickOnCreateAccountButton();
        return new HomePage();
    }

}
