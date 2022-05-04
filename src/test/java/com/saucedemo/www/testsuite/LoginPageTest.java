package com.saucedemo.www.testsuite;

import com.saucedemo.www.pages.InventoryPage;
import com.saucedemo.www.pages.LoginPage;
import com.saucedemo.www.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();


    @Test
    public void verifyUserShouldLoginSuccessfullyAndSeeSixProducts(){
        loginPage.userName("standard_user");
        loginPage.password("secret_sauce");
        loginPage.loginButton();
        String expectedText = "PRODUCTS";
        String actualText = inventoryPage.verifyTextProduct();
        int excpectedNumber = 6;
        int actualNumber1 = inventoryPage.verifyActualNumber();
        Assert.assertEquals(excpectedNumber,actualNumber1);

    }
}
