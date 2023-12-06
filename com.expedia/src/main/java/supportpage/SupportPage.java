package supportpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportPage extends BasePage {

    public SupportPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//iframe[@src='https://vac.vap.expedia.com/3.46.0/index.html']")
    public WebElement iframe;


    @FindBy(xpath="//button[.='Change booking']")
    public WebElement changeBookingButton;


    @FindBy(xpath = "//button[@class='uitk-button uitk-button-medium uitk-button-fullWidth uitk-button-has-text uitk-button-secondary']")
    public WebElement enterBookingDetails;
    public void clickOnChangeBookingButton(){
        switchToFrameByElement(iframe);
        safeClickOnElement(changeBookingButton);
    }
}


