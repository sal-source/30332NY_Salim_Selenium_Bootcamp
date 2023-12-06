package resultspage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

    public SearchPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//h1[@class='fcab3ed991 d5f78961c3']")
    public WebElement resultText;

    @FindBy(xpath = "//div[@class='Stack-module__root___r9Dwc Stack-module__root--direction-column___2y5oZ Stack-module__root--gap-medium___CEpBV']/div[3]//span[@class='InputRadio-module__field___4Jbyo']")
    public WebElement stopNumber;
    @FindBy(xpath="//span[.='Reset all']")
    public WebElement resetAllButton;

    public void clickOnStopNumber(){
       checkElementSelected(stopNumber);

    }
}
