package com.seleniumframework.pages;

import com.seleniumframework.base.BaseClass;
import com.seleniumframework.base.Utility;
import com.seleniumframework.logs.Log;
import com.seleniumframework.stepdefinitions.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.xml.XmlPackage;

import java.util.List;

public class HomePage extends Utility {
private By searchfieldXpath = By.id("search");

public void searchForProduct(){
    enterText(searchfieldXpath, "Jean Pants");
}
public void verifysearchedProductsIsDisplayed(){
  List<WebElement> AllGymPants = driver.findElements(By.xpath("//*[@id=\'maincontent\']/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/a/span/span/img"));
    for(int i =1; i<2; i++){
       WebElement element = driver.findElement(By.xpath("//*[@id=\'maincontent\']/div[3]/div[1]/div[2]/div[2]/ol/li["+i+"]/div/a/span/span/img"));
    Assert.assertEquals(element.getText().contains("Gym"), true);

    }
}
}





