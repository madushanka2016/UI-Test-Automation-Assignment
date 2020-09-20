package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginPage.java - class to verify Login Page functions Created by SrirankanK
 * on 10/3/2018.
 */
public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By txtUserName = By.id("username");
    private static By txtPassword = By.id("password");
    private static By btnLogIn = By.xpath("//button[@type='submit' and @class='radius']");
    private static By hdrLoginPage = By.xpath("//h2[text()='Login Page']");
    private static By alertMessage= By.id("flash");

    public static  void  setUserName(String userName){
        getDriver().findElement(txtUserName).sendKeys(userName);
    }

    public static  void  setPassword(String password){
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public static void clickLogIn(){
        getDriver().findElement(btnLogIn).click();
    }

    public static boolean isLoginPageDisplayed() {
        return getDriver().findElement(hdrLoginPage).isDisplayed();
    }

    public static boolean isAlterDisplayed() {
        return getDriver().findElement(alertMessage).isDisplayed();
    }

    public static String getAlterMessage(){
        return getDriver().findElement(alertMessage).getText();
    }
}
