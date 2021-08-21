package com.bookit.Utilits;

import com.bookit.pages.BookitSignIngInPage;
import com.bookit.pages.Map;

public class Pages {

  private Pages (){}
private static Map map;
  private static BookitSignIngInPage bookitSignIngInPage;


    public static  BookitSignIngInPage getBookitSignIngInPage() {
        if(bookitSignIngInPage==null){
            bookitSignIngInPage = new BookitSignIngInPage();
        }
        return bookitSignIngInPage;
    }


    public static Map getMap() {
        if(map==null){
            map = new Map();
        }
        return map;
    }

    public static void destroy(){
        bookitSignIngInPage = null;
        map= null;
    }

}
