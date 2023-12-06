package jobspage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsPage extends BasePage {
    public JobsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='keyword']")
    public WebElement keywordInputButton;
    @FindBy(xpath = "//select[@id='filtercategory']")
    public WebElement egTeamDropDown;

    @FindBy(xpath = "//select[@id='filtercountry']")
    public WebElement countryDropDown;

    @FindBy(xpath = "//button[@class='Hero-search__form__button button button--green-1 button--lg']")
    public WebElement letsGoButton;

    @FindBy(xpath="//h1[@class='Search-header__title text-xl text-white aos-init aos-animate']")
    public WebElement resultText;


    public void enterKeyword(String keyWord){
        sendKeysToElement(keywordInputButton,keyWord);
    }

    public void selectFromEgTeamDropDown(){
        selectFromDropdownByVisibleText(egTeamDropDown,"Technology");
    }
    public void selectFromCountryDropDown(){
        selectFromDropdownByVisibleText(countryDropDown,"United States");
    }
    public void clickOnLetsGoButton(){
        safeClickOnElement(letsGoButton);
    }
    public void findJob(String keyWord){
        enterKeyword(keyWord);
        selectFromEgTeamDropDown();
        selectFromCountryDropDown();
        clickOnLetsGoButton();
    }
}
