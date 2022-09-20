package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import BaseCode.BaseCode;

import static BaseCode.BaseCode.driver;
import static BaseCode.BaseCode.prop;

public class Login_page {


    By username = By.id(prop.getProperty("username"));
    By password = By.id(prop.getProperty("password"));
    By button = By.id(prop.getProperty("clickbutton"));


    public void setUsername(String text)
    {
        driver.findElement(username).sendKeys(text);
    }

    public void setPassword(String text)
    {
        driver.findElement(password).sendKeys(text);
    }

    public void clickButton()
    {
        driver.findElement(button).sendKeys(Keys.RETURN);
    }

}
