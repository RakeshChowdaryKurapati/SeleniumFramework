package com.seleniumframework.pages;

import com.seleniumframework.base.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchProduct extends Utility {
    private By selectProductxpath = By.xpath("//*[@id=\'maincontent\']/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/a/span/span/img");
    private By sizeOfProduct = By.id("option-label-size-143-item-170");
    private By colorOfProduct = By.xpath("//*[@id='option-label-color-93-item-50']");
    private By quantity = By.id("qty");
private By addToCartButtton = By.id("product-addtocart-button");
private By priceOfProdyct = By.xpath("//*[@id='product-price-542']/span");



    public void selectProductspecifications(){
       clickElement(selectProductxpath);
        clickElement(sizeOfProduct);
        clickElement(colorOfProduct);
       enterText(quantity,"2");

    }
public void addToCort(){
clickElement(addToCartButtton);
}





}