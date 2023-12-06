package freecrm.pom.homepage;

import base.BasePage;

import freecrm.pom.authentication.LogInPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    @FindBy(xpath = "//span[.='Log In']")
    public WebElement loginButton;

    public HomePage() {

        PageFactory.initElements(driver, this);
    }
    public LogInPage clickOnLoginButton() {

        safeClickOnElement(loginButton);
        return new LogInPage();
    }
}