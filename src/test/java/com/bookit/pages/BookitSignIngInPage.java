package com.bookit.pages;

import com.bookit.Utilits.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookitSignIngInPage {

    public BookitSignIngInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name ="email")
    public WebElement emailInputBox;

    @FindBy(name = "password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@class='button is-dark']")
    public WebElement signInButton;








}
