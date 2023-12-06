package homepage;

import attractionspage.AttractionPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import registrationpage.RegistrationPage;
import resultspage.SearchPage;

public class HomePage extends BasePage {

    public HomePage (){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='a1b3f50dcd be36d14cea b2fe1a41c3 db7f07f643 c7b46bab72']/a[2]/span[@class='e57ffa4eb5']")
    public WebElement registerButton;

    @FindBy(xpath="//div[.='Your account']")
    public WebElement yourAccountButton;

    @FindBy(xpath="//span[.='Sign out']")
    public WebElement signOutButton;

    @FindBy(xpath="//span[.='Flights']")
    public WebElement flightsButton;

    @FindBy(xpath="//button[3]/div[@class='css-ztjjo9']//span[@class='Text-module__root--variant-body_2___-3fYM Text-module__root--color-disabled___tERfD']")
    public WebElement whereToInputField;
    @FindBy(xpath="//input[@class='css-1ejj2j9']")
    public WebElement airportInputField;
    @FindBy(xpath = "//ul[@class='css-1eonra']//span[@class='css-3cj1dx']/span[contains(.,'CFU Corfu International Airport')]")
    public WebElement selectedAirport;
    @FindBy(css="[placeholder='Depart – Return']")
    public WebElement departReturnField;
    @FindBy(xpath = "//div[@class='Calendar-module__content___XsvtK']//tr[2]//span[@class='Calendar-module__date___FlMKj']/span[1]/span[.='11']")
    public WebElement firstDate;
    @FindBy(xpath="//div[@class='Calendar-module__content___XsvtK']//tr[2]//span[@class='Calendar-module__date___FlMKj']/span[1]/span[.='12']")
    public WebElement secondDate;

    @FindBy(xpath = "//span[.='Search']")
    public WebElement searchButton;

    @FindBy(xpath="//button[.='Best']")
    public WebElement searchResults;

    @FindBy(xpath="//a[@id='accommodations']")
    public WebElement staysButton;

    @FindBy(xpath="//input[@name='ss']")
    public WebElement whereAreYouGoingButton;

    @FindBy(xpath="//div[.='Atlantic City']")
    public WebElement firstOption;

    @FindBy(css="[data-testid='date-display-field-start']")
    public WebElement checkInDateField;

    @FindBy(xpath="//span[.=\"I'm flexible\"]")
    public WebElement flexibleButton;
   @FindBy(xpath="//div[@class='a1b3f50dcd be36d14cea b2fe1a41c3']/div[2]//span[@class='e50b5c7936']")
   public WebElement weekOption;
   @FindBy(xpath="//div[.='Aug2023']")
   public WebElement desiredMonth;

   @FindBy(xpath="//span[.='Select dates']")
   public WebElement selectDateButton;

    @FindBy(xpath="//button[@class='fc63351294 a822bdf511 d4b6b7a9e7 cfb238afa1 c938084447 f4605622ad aa11d0d5cd']")
    public WebElement submitButton;

    @FindBy(xpath="//img[@src='https://t-cf.bstatic.com/design-assets/assets/v3.79.0/images-flags/Us@3x.png']")
    public WebElement flagImage;
    @FindBy(xpath="//span[.='Français']")
    public WebElement frenchLanguage;

    @FindBy(xpath="//div[@class='bb0b3e18ca d9b0185ac2']/a[.='Se connecter']")
    public WebElement seConnecterBouton;

    @FindBy(xpath = "//div[@class='Stack-module__root___r9Dwc Stack-module__root--direction-row___-ITW9 Stack-module__root--gap-large___lJC00 Stack-module__root--align-items-center___0oIal']/div[1]//span[@class='InputRadio-module__field___4Jbyo']")
    public WebElement roundTripRadioButton;
    @FindBy(xpath = "//div[@class='Stack-module__root___r9Dwc Stack-module__root--direction-row___-ITW9 Stack-module__root--gap-large___lJC00 Stack-module__root--align-items-center___0oIal']/div[2]//span[@class='InputRadio-module__field___4Jbyo']")
    public WebElement oneWayRadioButton;

    @FindBy(xpath = "//div[@class='Stack-module__root___r9Dwc Stack-module__root--direction-row___-ITW9 Stack-module__root--gap-large___lJC00 Stack-module__root--align-items-center___0oIal']/div[3]//span[@class='InputRadio-module__field___4Jbyo']")
    public WebElement multiCityRadioButton;

    @FindBy(xpath = "//input[@id='newsletter_to']")
    public WebElement emailInputField;
    @FindBy(xpath = "//button[@id='newsletter_button_footer']")
    public WebElement subscribeButton;

    @FindBy(xpath = "//span[.='Attractions']")
    public WebElement attractionButton;





    public RegistrationPage clickOnRegisterButton(){
        safeClickOnElement(registerButton);
        return new RegistrationPage();
    }

    public WebElement assertLogin(){
        safeClickOnElement(yourAccountButton);
        safeClickOnElement(signOutButton);
        return signOutButton;
    }

    public void clickOnFlightButton(){
        safeClickOnElement(flightsButton);
    }
    public void clickOnWhereToGoButton(){
        safeClickOnElement(whereToInputField);
    }
    public void enterDestinationName(String countryName){
        sendKeysToElement(airportInputField,countryName);
    }
    public void clickOnSelectedAirport(){
        safeClickOnElement(selectedAirport);
    }

    public void clickOnDepartReturnButton(){
        safeClickOnElement(departReturnField);
    }

    public void clickOnFirstDate(){
        safeClickOnElement(firstDate);
    }
    public void clickOnSecondDate(){
        safeClickOnElement(secondDate);
    }

    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }

    public void doSearchFlights(String countryName){
        clickOnFlightButton();
        clickOnWhereToGoButton();
        enterDestinationName(countryName);
        clickOnSelectedAirport();
        clickOnDepartReturnButton();
        clickOnFirstDate();
        clickOnSecondDate();
        clickOnSearchButton();
    }

    public void clickOnStaysButton(){
        safeClickOnElement(staysButton);
    }
    public void clickOnWhereYouGo(){
        safeClickOnElement(whereAreYouGoingButton);
    }
    public void clickOnFirstOption(){
        safeClickOnElement(firstOption);
    }
    public void clickOnCheckInDateField(){
        safeClickOnElement(checkInDateField);
    }

    public void clickOnSubmitButton(){
        safeClickOnElement(submitButton);
    }
    public SearchPage doSearchHotel() {
        clickOnStaysButton();
        clickOnWhereYouGo();
        clickOnFirstOption();
        clickOnCheckInDateField();
        safeClickOnElement(flexibleButton);
        safeClickOnElement(weekOption);
        safeClickOnElement(desiredMonth);
        safeClickOnElement(selectDateButton);
        clickOnSubmitButton();
        return new SearchPage();
    }

    public void clickOnFlagImage(){
        safeClickOnElement(flagImage);
    }
    public void clickOnFrenchLanguage(){
        safeClickOnElement(frenchLanguage);
    }
    public void doSwitchLanguage(){
        clickOnFlagImage();
        clickOnFrenchLanguage();
    }

    public void clickOnRoundTripRadioButton(){
        safeClickOnElement(flightsButton);
        safeClickOnElement(roundTripRadioButton);
    }

    public void clickOnOneWayRadioButton(){
        safeClickOnElement(flightsButton);
        safeClickOnElement(oneWayRadioButton);
    }

    public void clickOnMultiCityRadioButton(){
        safeClickOnElement(flightsButton);
        safeClickOnElement(multiCityRadioButton);
    }

    public void enterEmailAddress(String email){
        sendKeysToElement(emailInputField,email);
    }

    public void clickOnSubscribeButton(){
        safeClickOnElement(subscribeButton);
    }

    public void doSubscribe(String email){
        enterEmailAddress(email);
        clickOnSubscribeButton();
    }
 public AttractionPage clickOnAttractionButton(){
        safeClickOnElement(attractionButton);
        return new AttractionPage();
 }

}
