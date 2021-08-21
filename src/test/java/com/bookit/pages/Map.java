package com.bookit.pages;

import com.bookit.Utilits.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Map {

    public Map(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//h1[text()='map']")
    public WebElement mapH1Header;






}
