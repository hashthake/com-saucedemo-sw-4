package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginBtn = By.id("login-button");

    public void userName(String value){
        sendTextToElement(userNameField,value);
    }
    public void password(String value){
        sendTextToElement(passwordField,value);
    }
    public void loginButton(){
        clickOnElement(loginBtn);
    }
}
