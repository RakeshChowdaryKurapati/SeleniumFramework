package com.seleniumframework.stepdefinitions;

import com.seleniumframework.base.Utility;
import com.seleniumframework.logs.Log;
import com.seleniumframework.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.seleniumframework.base.BaseClass.driver;

public class HomePageStepDef extends PageObjects {

    @Given("When user open Homepage")
    public void whenUserOpenHomepage() {


    }

    @When("User search for {string} product")
    public void userSearchForProduct(String arg0) {
        homepage.searchForProduct();

    }


    @Then("Verify user is on HomePage")
    public void verifyUserIsOnHomePage() {
        loginPage.VerifyHomepageTitle();

    }



}


