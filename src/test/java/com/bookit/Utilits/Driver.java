package com.bookit.Utilits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {


    private Driver(){}


    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();


    public static WebDriver getDriver(){
        if(driverPool.get()==null){

            String browserType = ConfiReader.getProperties("browser");

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


            }






        }


        return driverPool.get();



    }

    public static void destroy(){
        if(driverPool.get()!=null){
            driverPool.get().quit();
            driverPool.set(null);
        }
    }










}
