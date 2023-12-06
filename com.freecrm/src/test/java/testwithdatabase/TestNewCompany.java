package testwithdatabase;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class TestNewCompany extends BasePage {

    @Test
    public void testCreateCompany() throws SQLException {


        String query="SELECT COUNT(*) FROM COMPANIES WHERE NAME ='Tesla'";

        Object result =db.executeQueryReadOne(query);
        Assert.assertTrue(result.toString().equals("1"));
}
}
