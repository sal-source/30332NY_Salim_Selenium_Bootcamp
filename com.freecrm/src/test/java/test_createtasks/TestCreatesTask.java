package test_createtasks;

import base.BasePage;
import freecrm.pom.authentication.DashboardUserPage;
import freecrm.pom.authentication.LogInPage;
import freecrm.pom.homepage.HomePage;
import freecrm.pom.taskspage.TasksPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestCreatesTask extends BasePage {

/*Test case: Add a new task in FreeCRM.com
*1.Launch the FreeCRM.com application and navigate to the login page
*2.Enter valid login credentials (username and password) and click on the "Login" button
*3.Click on the "Tasks"  link to open the tasks page
* 4.Fill in the required fields for the task, such as title, due date, and task description.
* 5.Save the task by clicking on the "Save" button.
* 6.Verify that the task is successfully created and added to the task list
 */

    @Test(priority = 1,groups={"smoke"},dataProvider = "createTaskDataProvider")
    public void testCreateTask(String title){

        HomePage homePage =new HomePage();

        LogInPage logInPage= homePage.clickOnLoginButton();
        String email1 = "sadouni.dalal@gmail.com";
        String password="AydenLiam1213";
        DashboardUserPage dashboardUserPage= logInPage.doLogin(email1,password);

        TasksPage tasksPage=dashboardUserPage.hoverClickOnTasksIcon();

        tasksPage.doAddNewTask(title);
        Assert.assertTrue(isElementVisible(tasksPage.titleOfCreatedTask));

    }

    @DataProvider(name="createTaskDataProvider")
    public Object [][] addContactDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doAddTasks");
        return data;

    }
}
