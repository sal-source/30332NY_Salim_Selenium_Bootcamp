package attractionspage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AttractionPage extends BasePage {

    public AttractionPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[.='Key West']")
    public WebElement desiredAttraction;
    @FindBy(xpath = "//label[.='Most popular']")
    public WebElement mostPopularButton;
    @FindBy(xpath = "//div[@class='css-crbgu0']//div[2]//div[3]//span[@class='bbdb949247']")
    public WebElement priceBox;

    @FindBy(xpath = "//span[@class='b6dc9a9e69 e6c50852bd']//*[name()='svg']")
    public WebElement testResult;

    @FindBy(xpath = "//a[@aria-label='Customer support']")
    public WebElement helpCenterIcon;

    @FindBy(xpath = "//div[@class='a1b3f50dcd be36d14cea f7c6687c3d']//div[1]//button[1]//span[2]//*[name()='svg']")
    public WebElement covidRequirements;

    @FindBy(xpath = "//a[normalize-space()='here']")
    public WebElement hereLink;

    @FindBy(xpath = "//h1[contains(text(),'We’re here to help')]")
    public WebElement textResult;



    public void clickOnDesiredAttraction(){
        safeClickOnElement(desiredAttraction);
    }
    public void clickOnMostPopular(){
        safeClickOnElement(mostPopularButton);
    }
    public void clickOnPriceBox(){
        safeClickOnElement(priceBox);
    }
   public void doFilterAttraction(){
        clickOnDesiredAttraction();
        clickOnMostPopular();
        clickOnPriceBox();
   }

   public void clickOnHelpCenterIcon(){
        safeClickOnElement(helpCenterIcon);
   }

   public void clickOnCovidRequirements(){
        safeClickOnElement(covidRequirements);
   }
   public void clickOnHereLink(){
        safeClickOnElement(hereLink);
   }
   public void helpCenter(){
        clickOnHelpCenterIcon();
        clickOnCovidRequirements();
        clickOnHereLink();
   }

}
