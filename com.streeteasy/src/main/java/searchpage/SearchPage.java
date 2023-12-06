package searchpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

    public SearchPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Type']")
    public WebElement typeButton;
    @FindBy(xpath = "//label[normalize-space()='Condos']")
    public WebElement typeOfApartment;
    @FindBy(xpath="//button[normalize-space()='Done']")
    public WebElement doneButton;

    @FindBy(xpath = "//button[normalize-space()='Save Search']")
    public WebElement saveSearch;


    public void clickOnTypeButton(){
        safeClickOnElement(typeButton);
    }
    public void clickOnTypeOfApartment(){
        safeClickOnElement(typeOfApartment);
    }
    public void clickOnDoneButton(){
        safeClickOnElement(doneButton);
    }
    public void clickOnSaveSearch(){
        safeClickOnElement(saveSearch);
    }

    public void doFilterSearch(){
        clickOnTypeButton();
        clickOnTypeOfApartment();
        clickOnDoneButton();
        clickOnSaveSearch();
    }
}
