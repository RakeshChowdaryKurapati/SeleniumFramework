package com.seleniumframework.pages;

import com.seleniumframework.base.Utility;
import com.seleniumframework.logs.Log;
import com.seleniumframework.stepdefinitions.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends Utility{
private By loginLinkXpath = By.linkText("Sign In");
    private By emailIdXpath = By.id( "email");
   private  By passwordXpath = By.id("pass");
   private By loginBtXpath = By.xpath("//*[@id='send2']/span");



public void login(String username,String password) {

clickElement(loginLinkXpath);
    enterText(emailIdXpath,username);
    enterText(passwordXpath, password);
    clickElement(loginBtXpath);



}
    public void VerifyHomepageTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites";
       Assert.assertEquals(actualTitle,expectedTitle);
        Log.info(actualTitle);
    }

}
