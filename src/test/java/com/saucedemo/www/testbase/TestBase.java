package com.saucedemo.www.testbase;

import com.saucedemo.www.utility.Utility;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = "chrome";

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

//    @AfterMethod
//    //public void tearDown(){
//        closeBrowser();
//    }
}
