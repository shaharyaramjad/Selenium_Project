package testcase;

import BaseCode.BaseCode;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Login_page;

import static Utils.Urls.actualUrl;



public class LoginWithValidCredentials extends BaseCode {




    @Test(dataProvider = "testdata")
    public static void ValidCredentials(String username, String password) throws InterruptedException {
        System.out.println("Successful Login");
        System.out.println(driver.getTitle());
        Login_page loginPage = new Login_page();
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickButton();
//        driver.findElement(By.id(prop.getProperty("username"))).sendKeys(username);
//        driver.findElement(By.id(prop.getProperty("password"))).sendKeys(password);
//        driver.findElement(By.id(prop.getProperty("clickbutton")));

//        Thread.sleep(1000);

        Assert.assertEquals(actualUrl,driver.getCurrentUrl());


    }

    @DataProvider(name="testdata")
    public Object[][] tData()
    {
        return new Object[][]
                {
                        {"standard_user","secret_sauce"}
//                        {"locked_out_user","secret_sauce"},
//                        {"problem_user","secret_sauce"},
//                        {"performance_glitch_user","secret_sauce"}
                };

    }


}
