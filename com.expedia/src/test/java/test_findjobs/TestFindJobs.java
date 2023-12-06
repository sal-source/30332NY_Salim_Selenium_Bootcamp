package test_findjobs;

import base.BasePage;
import homepage.HomePage;
import jobspage.JobsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFindJobs extends BasePage {

    /*Test Case: Verify Jobs Functionality on Expedia.com
    *1.Launch the web browser and navigate to www.expedia.com.
    *2.Click on the "Jobs" link.
    *3.Enter a specific job title or keyword in the search field.
    *4.Select  EG team that you are interested on.
    *5.Select a country from drop down
    *6.Click on the "Search" or similar button.
    *7.Verify that the search results are displayed correctly, listing relevant job openings.
     */

    @Test(priority = 7,groups = {"BAT"})
    public void testFindJobs(){
        HomePage homePage= new HomePage();
        JobsPage jobsPage= homePage.clickOnJobsButton();
        String keyWord="Software engineer ";
        jobsPage.findJob(keyWord);
        Assert.assertTrue(isElementVisible(jobsPage.resultText));
    }
}
