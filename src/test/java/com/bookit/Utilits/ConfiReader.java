package com.bookit.Utilits;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfiReader {
    private static Properties properties = new Properties();



    static {

        try {
            FileInputStream file = new FileInputStream("confi.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static String getProperties(String keyword){

        return properties.getProperty(keyword);


    }


}
