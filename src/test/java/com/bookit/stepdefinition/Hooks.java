package com.bookit.stepdefinition;

import com.bookit.Utilits.Driver;
import com.bookit.Utilits.Pages;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){

            byte[] screenShot  = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png",scenario.getName());


        }
        Pages.destroy();
        Driver.destroy();


    }


}
