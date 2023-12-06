package freecrm.pom.taskspage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TasksPage extends BasePage {
    public TasksPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//input[@name='title']")
    public WebElement titleInputField;

    @FindBy(xpath="//div[@class='ui fluid selection dropdown']/i[@class='dropdown icon']")
    public WebElement assignedToDropDown;
    @FindBy(xpath="//div[@class='divider text']")
    public WebElement selectedItem;

    @FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div/div/input")
    public WebElement dueDateBox;
    @FindBy(xpath="//button[@class='react-datepicker__navigation react-datepicker__navigation--next react-datepicker__navigation--next--with-time']")
    public WebElement nextMonthIcon;
    @FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--023 react-datepicker__day--selected react-datepicker__day--weekend']")
    public WebElement dueDate;
    @FindBy(xpath = "//button[@class='ui linkedin button']")
    public WebElement saveButton;
    @FindBy(xpath = "//span[@class='selectable ']")
    public WebElement titleOfCreatedTask;


   public void enterTitle(String title){
       sendKeysToElement(titleInputField,title);

   }


 public void clickOnAssignToDropDown(){
       safeClickOnElement(assignedToDropDown);
 }
    public void selectFromTheDropDown() {
     safeClickOnElement(selectedItem);

    }

    public void clickOnSaveButton(){
       safeClickOnElement(saveButton);
    }

    public void clickAndSelectOnDueDateBox(){
       safeClickOnElement(dueDateBox);
       String year = "2023";
       String month="July";
       String date="30";
       while (true)
       {
           String monthYear = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
           String arr[]= monthYear.split(" ");
           String mon = arr[0];
           String yr=arr[1];
           if(mon.equalsIgnoreCase(month) && yr.equals(year))
               break;
           else
               driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next react-datepicker__navigation--next--with-time']")).click();
    }
       //Date selection
        List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='react-datepicker__month-container']"));
        for(WebElement ele:allDates)
        {
            String dt=ele.getText();
            if(dt.equals(date))
            {
                ele.click();
                break;
            }
        }
}


public void doAddNewTask(String title){
       enterTitle(title);

       clickOnAssignToDropDown();
       selectFromTheDropDown();
       clickAndSelectOnDueDateBox();
       clickOnSaveButton();
}
}
