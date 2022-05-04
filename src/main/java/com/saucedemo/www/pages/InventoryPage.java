package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;

public class InventoryPage extends Utility {

    By textProduct = By.xpath("//span[contains(text(),'Products')]");
    By productsNumber = By.className("inventory_item");

    public String verifyTextProduct(){
        return getTextFromElement(textProduct);
    }
    public int verifyActualNumber(){
        return findActualNumber(productsNumber);
    }
}
