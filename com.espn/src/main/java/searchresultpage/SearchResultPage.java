package searchresultpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage {
    public SearchResultPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"fittPageContainer\"]/div[2]/div/div/ul/li[1]/a")
    public WebElement searchResult;
}
