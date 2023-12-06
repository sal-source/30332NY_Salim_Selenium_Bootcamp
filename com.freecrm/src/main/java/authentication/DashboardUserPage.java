package freecrm.pom.authentication;

import base.BasePage;
import freecrm.pom.contactspage.ContactPage;
import freecrm.pom.create_new_contact.CreateNewContactPage;
import freecrm.pom.taskspage.TasksPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardUserPage extends BasePage {

    @FindBy(xpath = "//span[@class='user-display']")
    public WebElement userName;

    @FindBy(xpath = "//div[@class='ui basic button floating item dropdown']/i[@class='settings icon']")
    public WebElement settingIcon;

    @FindBy(xpath = "//span[.='Log Out']")
    public WebElement logOutButton;

    @FindBy(xpath = "//i[@class='users icon']")
    public WebElement contactsIcon;
    @FindBy(xpath ="//div[@id='main-nav']/div[3]/button[@class='ui mini basic icon button']")
    public  WebElement addContactButton;

    @FindBy(xpath ="//i[@class='tasks icon']")
    public  WebElement tasksIcon;
    @FindBy(xpath ="//div[@id='main-nav']/div[6]/button[@class='ui mini basic icon button']")
    public  WebElement addTasksIcon;


    public DashboardUserPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnSettingButton(){
        safeClickOnElement(settingIcon);
    }
    public void clickOnLogOutButton(){
        safeClickOnElement(logOutButton);
    }
    public LogInPage doLogOut(){
        clickOnSettingButton();
        clickOnLogOutButton();
        return new LogInPage();
    }

    public void hoverOverContactsIcon(){
        hoverOverElement(contactsIcon);
    }
    public CreateNewContactPage clickOnAddContactButton(){
        safeClickOnElement(addContactButton);
        return new CreateNewContactPage();
    }


    public CreateNewContactPage doClickAddButton(){
        hoverOverContactsIcon();
        clickOnAddContactButton();
        return new CreateNewContactPage();
    }

    public ContactPage clickOnContactsIcon(){
        safeClickOnElement(contactsIcon);
        return new ContactPage();
    }
    public void hoverOverTasksIcon(){
        hoverOverElement(tasksIcon);
    }
    public void clickOnAddTasksIcon(){
        safeClickOnElement(addTasksIcon);
    }
    public TasksPage hoverClickOnTasksIcon(){
       hoverOverTasksIcon();
       clickOnAddTasksIcon();
       return new TasksPage();
    }
}