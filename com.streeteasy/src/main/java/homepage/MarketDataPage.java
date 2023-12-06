package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketDataPage extends BasePage {

    public MarketDataPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//h1[@class='section-title text-left']")
    public WebElement marketDataHeader;
}
