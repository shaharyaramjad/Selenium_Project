package testcase;

import BaseCode.BaseCode;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Login_page;



public class LoginWithInvalidCredential extends BaseCode {

    @Test(dataProvider = "testdata")
    public static void InValidCredentials(String username, String password)
    {
        System.out.println("Un-Successful Login");
        System.out.println(driver.getTitle());
        Login_page loginPage = new Login_page();
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickButton();

        Assert.assertEquals("https://www.saucedemo.com/",driver.getCurrentUrl());


    }


    @DataProvider(name="testdata")
    public Object[][] tData()
    {
        return new Object[][]
                {
                        {"shaharyar","secret_sauce"}
                };

    }







}
