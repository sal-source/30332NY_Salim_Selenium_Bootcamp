package freecrm.pom.contactspage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BasePage {
    public ContactPage(){
        PageFactory.initElements(driver,this );
    }
    @FindBy(xpath = "//button[.='Show Filters']")
    public WebElement showFilterButton;

    @FindBy(xpath="//div[@name='name']/i[@class='dropdown icon']")
    public WebElement dropDownMenu;

    @FindBy(xpath="//span[.='First Name']")
    public WebElement firstNameOption;

    @FindBy(xpath="//div[@name='operator']/i[@class='dropdown icon']")
    public WebElement dropDownOperator;

    @FindBy(xpath="//span[.='Contains']")
    public WebElement containsOption;

    @FindBy(xpath="//input[@name='value']")
    public WebElement valueInputField;

    @FindBy(xpath="//button[5]")
    public WebElement searchButton;
    @FindBy(xpath="//button[@class='ui green button']")
    public WebElement filterApplied;

    public void clickOnShowFilterButton(){
        safeClickOnElement(showFilterButton);
    }
    public void clickOnDropDownMenu(){
        safeClickOnElement(dropDownMenu);
    }
    public void clickOnFirstNameOption(){
        safeClickOnElement(firstNameOption);
    }
    public void clickOnDropDownOperator(){
        safeClickOnElement(dropDownOperator);
    }
    public void clickOnContainsOption(){
        safeClickOnElement(containsOption);
    }
    public void enterValueInput(String value){
        sendKeysToElement(valueInputField,value);
    }
    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }

    public void doFilterSearchInContacts(String value){
        clickOnShowFilterButton();
        clickOnDropDownMenu();
        clickOnFirstNameOption();
        clickOnDropDownOperator();
        clickOnContainsOption();
        enterValueInput(value);
        clickOnSearchButton();
    }
}


