package freecrm.pom.authentication;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {


    @FindBy(xpath="//input[@name='email']")
    public WebElement inputEmailField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement inputPasswordField;

    @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
    public WebElement LoginButton;



    public LogInPage(){
        PageFactory.initElements(driver, this);
    }

    public void enterValidEmailAddress(String email){
        sendKeysToElement(inputEmailField, email);
    }
    public void enterValidPassword(String password){
        sendKeysToElement(inputPasswordField,password);
    }
    public void clickOnLoginButton(){
        safeClickOnElement(LoginButton);
    }


    public DashboardUserPage doLogin(String email, String password){
       enterValidEmailAddress(email);
       enterValidPassword(password);
       clickOnLoginButton();
       return new DashboardUserPage();
    }



}
