package com.seleniumframework.pages;

import com.seleniumframework.base.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CartList extends Utility {
    private By cartButton = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
    private By SelectedProductText = By.xpath("//*[@id='minicart-content-wrapper']/div[2]/div[4]");
private By proccedToCheckOutButton = By.id("top-cart-btn-checkout");

String ActualUrl = "https://magento.softwaretestingboard.com/checkout/";
String ExpectedUrl = driver.getCurrentUrl();



public void CartShouldShouldDisplaySelectedProducts(){
    clickElement(cartButton);
    getText(SelectedProductText);
}
public void ProceedToCheckOut(){
    clickElement(proccedToCheckOutButton);
}
public void VerifyUserOnChechoutPage(){
    Assert.assertEquals(ActualUrl,ExpectedUrl);
}


}
