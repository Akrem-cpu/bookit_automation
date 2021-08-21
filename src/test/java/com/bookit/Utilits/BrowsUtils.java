package com.bookit.Utilits;

public class BrowsUtils {

    public static void sleep(int second){
         second = second*1000;
         try {
             Thread.sleep(second);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }


    }






}
