package com.bookit.stepdefinition;

import com.bookit.Utilits.ConfiReader;
import com.bookit.Utilits.Driver;
import com.bookit.Utilits.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class LoginFunctionality {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfiReader.getProperties("envQ1"));
    }
    @Given("user enter {string} and {string}")
    public void user_enter_and(String username, String password) {
       Pages.getBookitSignIngInPage().emailInputBox.sendKeys(username);
       Pages.getBookitSignIngInPage().passwordInputBox.sendKeys(password);

    }
    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
      Pages.getBookitSignIngInPage().signInButton.click();
    }
    @Then("user should see header that says {string}")
    public void user_should_see_header_that_says(String expectedHeaderText) {
        String actualText = Pages.getMap().mapH1Header.getText();
        assertEquals("the actual H1 header is not matching the expected",actualText,expectedHeaderText);

    }


}
