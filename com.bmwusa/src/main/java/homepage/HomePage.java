package homepage;

import authentication.LoginPage;
import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import searchpage.ModelSelectedPage;

public class HomePage extends BasePage {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='http://mybmw.bmwusa.com']")
    public WebElement logInLink;

    @FindBy(xpath = "(//button[@aria-label='Search'])[2]")
    public WebElement searchIcon;

    @FindBy(xpath = "(//input[@name='site search'])[2]")
    public WebElement searchBar;

    @FindBy(xpath = "//div[@class='globalnav-primary-search-results bmw-grid-col-default-25 bmw-grid-col-lg-10 bmw-grid-col-lg-offset-14 globalnav-primary-search-results--active']//a[.='MyBMW']")
    public WebElement myBmwOption;

    @FindBy(xpath = "//a[@href='/vehicles/all-electric/ix/sports-activity-vehicle/overview.html.html']")
    public WebElement vehicleModel;
    @FindBy(xpath = "//*[@id=\"destination_publishing_iframe_bmwmini_0\"]")
    public WebElement iframeSearchBar;



    public LoginPage clickOnLoginLink() {
        safeClickOnElement(logInLink);
        return new LoginPage();
    }

    public void clickOnSearchIcon() {
        safeClickOnElement(searchIcon);
    }

    public void enterSearchTerm(String model, String year) {
        //switchToFrameByElement(iframeSearchBar);
        safeClickOnElement(searchBar);
        sendKeysToElement(searchBar, model);
        sendKeysToElement(searchBar, year);
        searchBar.sendKeys(Keys.RETURN);
    }

    public void doSearch(String model, String year) {
        clickOnSearchIcon();
        driver.navigate().refresh();
        clickOnSearchIcon();
        searchBar.click();
        enterSearchTerm(model, year);
    }

    public ModelSelectedPage clickOnVehicleModel() {
        safeClickOnElement(vehicleModel);
        return new ModelSelectedPage();
    }

}
