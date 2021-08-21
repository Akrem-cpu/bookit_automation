package com.bookit.Utilits;

import java.sql.*;

public class DBUtils {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    /**
     * this method will create the connection for the database
     */
    public static void creatConnection() {
        String url = ConfiReader.getProperties("DBurl");
        String username = ConfiReader.getProperties("DBUsrName");
        String password = ConfiReader.getProperties("DBPassword!");
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }




    /**
     * this method will close all the connection to the database
     */
    public static void destroy(){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(statement!= null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }






}
